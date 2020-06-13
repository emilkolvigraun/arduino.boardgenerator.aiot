package org.xtext.mdsd.arduino.boardgenerator.scoping;

import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.scoping.impl.ImportUriGlobalScopeProvider;
import org.eclipse.xtext.util.IResourceScopeCache;
import org.eclipse.emf.ecore.resource.Resource;
import com.google.inject.Provider;
import java.util.LinkedHashSet;
import org.eclipse.emf.common.util.URI;
import org.xtext.mdsd.arduino.boardgenerator.ioT.IoTPackage;

import com.google.common.base.Splitter;
import com.google.inject.Inject;
import org.eclipse.xtext.EcoreUtil2; 

class IoTGlobalScopeProvider extends ImportUriGlobalScopeProvider {
	static final Splitter c_splitter = Splitter.on(',');
	static final Splitter src_splitter = Splitter.on('src/');
 
	@Inject 
	IResourceDescription.Manager descriptionManager;

	@Inject
	IResourceScopeCache cache;

	override protected getImportedUris(Resource resource) {
		return cache.get(IoTGlobalScopeProvider.getSimpleName(), resource, new Provider<LinkedHashSet<URI>>() {
			override get() { 
				val uniqueImportURIs = collectImportUris(resource, new LinkedHashSet<URI>())
				val uriIter = uniqueImportURIs.iterator()
				while(uriIter.hasNext()) {
					if (!EcoreUtil2.isValidUri(resource, uriIter.next()))
						uriIter.remove()
				}
				return uniqueImportURIs
			}

			def LinkedHashSet<URI> collectImportUris(Resource resource, LinkedHashSet<URI> uniqueImportURIs) {
				val resourceDescription = descriptionManager.getResourceDescription(resource)
				val models = resourceDescription.getExportedObjectsByType(IoTPackage.Literals.MODEL)
				
				models.forEach[ 
					val userData = getUserData(IoTResourceDescriptionStrategy.INCLUDES)
					if(userData !== null) {
						c_splitter.split(userData).forEach[uri |
							var includedUri = URI.createURI(uri)
							includedUri = includedUri.resolve(resource.URI)  
							if (uri.length > 0){ 
								includedUri = URI.createURI(src_splitter.split(includedUri.toString).get(0) + "src/" + uri)
							} 
							if(uniqueImportURIs.add(includedUri)) { 
								collectImportUris(resource.getResourceSet().getResource(includedUri, true), uniqueImportURIs)
							}
						]
					}
				]
				
				return uniqueImportURIs
			}
		});
	}
}