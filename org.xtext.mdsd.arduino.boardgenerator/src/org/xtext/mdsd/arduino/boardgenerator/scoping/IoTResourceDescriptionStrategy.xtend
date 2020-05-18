package org.xtext.mdsd.arduino.boardgenerator.scoping

import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy
import com.google.inject.Inject
import org.eclipse.xtext.scoping.impl.ImportUriResolver
import org.eclipse.xtext.util.IAcceptor
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.resource.IEObjectDescription 
import org.xtext.mdsd.arduino.boardgenerator.ioT.Model 
import java.util.HashMap
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.EOperation
import org.eclipse.emf.common.util.EList
import java.lang.reflect.InvocationTargetException
import org.eclipse.emf.common.notify.Notification
import java.util.List
import java.nio.file.Paths;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Include
import org.xtext.mdsd.arduino.boardgenerator.ioT.ImportObject
import org.xtext.mdsd.arduino.boardgenerator.ioT.impl.ImportObjectImpl

class IoTResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {
	public static final String INCLUDES = "includes"
	@Inject 
	ImportUriResolver uriResolver

	override createEObjectDescriptions(EObject eObject, IAcceptor<IEObjectDescription> acceptor) {
		if(eObject instanceof Model) {
			this.createEObjectDescriptionForModel(eObject, acceptor)
			return true
		}
		else {
			super.createEObjectDescriptions(eObject, acceptor)
		} 
	}

	def void createEObjectDescriptionForModel(Model model, IAcceptor<IEObjectDescription> acceptor) {
		val uris = newArrayList()
		val includes = model.includes
		  
		for (Include include : includes){   
			val str = include.importURI.join("/") + ".aiot"
			var importObj = new Reference(str)  
			uris.add(uriResolver.apply(importObj))	
		} 
		val userData = new HashMap<String,String>
		userData.put(INCLUDES, uris.join(",")) 
		acceptor.accept(EObjectDescription.create(QualifiedName.create(model.eResource.URI.toString), model, userData))
	}	
}

class Reference extends ImportObjectImpl {
	
	new (String importUri){
		this.importURI = importUri;
	}
}