package org.xtext.mdsd.arduino.boardgenerator.scoping;

import org.xtext.mdsd.arduino.boardgenerator.ioT.impl.ImportObjectImpl;

@SuppressWarnings("all")
public class Reference extends ImportObjectImpl {
  public Reference(final String importUri) {
    this.importURI = importUri;
  }
}
