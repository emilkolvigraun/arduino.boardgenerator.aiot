package org.xtext.mdsd.arduino.boardgenerator.scoping;

import org.xtext.mdsd.arduino.boardgenerator.ioT.impl.ImportObjectImpl;

@SuppressWarnings("all")
public class ImportReference extends ImportObjectImpl {
  public ImportReference(final String importUri) {
    this.importURI = importUri;
  }
}
