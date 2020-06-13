package org.xtext.mdsd.arduino.boardgenerator.scoping;

import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.HashMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.scoping.impl.ImportUriResolver;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Include;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Model;
import org.xtext.mdsd.arduino.boardgenerator.scoping.ImportReference;

@SuppressWarnings("all")
public class IoTResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {
  public static final String INCLUDES = "includes";
  
  @Inject
  private ImportUriResolver uriResolver;
  
  @Override
  public boolean createEObjectDescriptions(final EObject eObject, final IAcceptor<IEObjectDescription> acceptor) {
    boolean _xifexpression = false;
    if ((eObject instanceof Model)) {
      this.createEObjectDescriptionForModel(((Model)eObject), acceptor);
      return true;
    } else {
      _xifexpression = super.createEObjectDescriptions(eObject, acceptor);
    }
    return _xifexpression;
  }
  
  public void createEObjectDescriptionForModel(final Model model, final IAcceptor<IEObjectDescription> acceptor) {
    final ArrayList<Object> uris = CollectionLiterals.<Object>newArrayList();
    final EList<Include> includes = model.getIncludes();
    for (final Include include : includes) {
      {
        String _join = IterableExtensions.join(include.getImportURI(), "/");
        final String str = (_join + ".aiot");
        ImportReference importObj = new ImportReference(str);
        uris.add(this.uriResolver.apply(importObj));
      }
    }
    final HashMap<String, String> userData = new HashMap<String, String>();
    userData.put(IoTResourceDescriptionStrategy.INCLUDES, IterableExtensions.join(uris, ","));
    acceptor.accept(EObjectDescription.create(QualifiedName.create(model.eResource().getURI().toString()), model, userData));
  }
}
