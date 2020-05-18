package org.xtext.mdsd.arduino.boardgenerator.scoping;

import com.google.common.base.Splitter;
import com.google.inject.Inject;
import com.google.inject.Provider;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.scoping.impl.ImportUriGlobalScopeProvider;
import org.eclipse.xtext.util.IResourceScopeCache;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.xtext.mdsd.arduino.boardgenerator.ioT.IoTPackage;
import org.xtext.mdsd.arduino.boardgenerator.scoping.IoTResourceDescriptionStrategy;

@SuppressWarnings("all")
public class IoTGlobalScopeProvider extends ImportUriGlobalScopeProvider {
  private static final Splitter c_splitter = Splitter.on(",");
  
  private static final Splitter src_splitter = Splitter.on("src/");
  
  @Inject
  private IResourceDescription.Manager descriptionManager;
  
  @Inject
  private IResourceScopeCache cache;
  
  @Override
  protected LinkedHashSet<URI> getImportedUris(final Resource resource) {
    abstract class __IoTGlobalScopeProvider_1 implements Provider<LinkedHashSet<URI>> {
      final __IoTGlobalScopeProvider_1 _this__IoTGlobalScopeProvider_1 = this;
      
      public abstract LinkedHashSet<URI> collectImportUris(final Resource resource, final LinkedHashSet<URI> uniqueImportURIs);
    }
    
    String _simpleName = IoTGlobalScopeProvider.class.getSimpleName();
    __IoTGlobalScopeProvider_1 ___IoTGlobalScopeProvider_1 = new __IoTGlobalScopeProvider_1() {
      @Override
      public LinkedHashSet<URI> get() {
        LinkedHashSet<URI> _linkedHashSet = new LinkedHashSet<URI>(5);
        final LinkedHashSet<URI> uniqueImportURIs = this.collectImportUris(resource, _linkedHashSet);
        final Iterator<URI> uriIter = uniqueImportURIs.iterator();
        while (uriIter.hasNext()) {
          boolean _isValidUri = EcoreUtil2.isValidUri(resource, uriIter.next());
          boolean _not = (!_isValidUri);
          if (_not) {
            uriIter.remove();
          }
        }
        return uniqueImportURIs;
      }
      
      public LinkedHashSet<URI> collectImportUris(final Resource resource, final LinkedHashSet<URI> uniqueImportURIs) {
        final IResourceDescription resourceDescription = IoTGlobalScopeProvider.this.descriptionManager.getResourceDescription(resource);
        final Iterable<IEObjectDescription> models = resourceDescription.getExportedObjectsByType(IoTPackage.Literals.MODEL);
        final Consumer<IEObjectDescription> _function = (IEObjectDescription it) -> {
          final String userData = it.getUserData(IoTResourceDescriptionStrategy.INCLUDES);
          if ((userData != null)) {
            final Consumer<String> _function_1 = (String uri) -> {
              URI includedUri = URI.createURI(uri);
              includedUri = includedUri.resolve(resource.getURI());
              int _length = uri.length();
              boolean _greaterThan = (_length > 0);
              if (_greaterThan) {
                String _get = ((String[])Conversions.unwrapArray(IoTGlobalScopeProvider.src_splitter.split(includedUri.toString()), String.class))[0];
                String _plus = (_get + "src/");
                String _plus_1 = (_plus + uri);
                includedUri = URI.createURI(_plus_1);
              }
              boolean _add = uniqueImportURIs.add(includedUri);
              if (_add) {
                this.collectImportUris(resource.getResourceSet().getResource(includedUri, true), uniqueImportURIs);
              }
            };
            IoTGlobalScopeProvider.c_splitter.split(userData).forEach(_function_1);
          }
        };
        models.forEach(_function);
        return uniqueImportURIs;
      }
    };
    return this.cache.<LinkedHashSet<URI>>get(_simpleName, resource, ___IoTGlobalScopeProvider_1);
  }
}
