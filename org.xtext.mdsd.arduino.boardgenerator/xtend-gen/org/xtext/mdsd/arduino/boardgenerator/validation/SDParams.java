package org.xtext.mdsd.arduino.boardgenerator.validation;

import java.util.Collections;
import java.util.Map;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pair;

@SuppressWarnings("all")
public class SDParams {
  public static final Map<String, Integer> WROVER = Collections.<String, Integer>unmodifiableMap(CollectionLiterals.<String, Integer>newHashMap(Pair.<String, Integer>of("sd_clk", Integer.valueOf(14)), Pair.<String, Integer>of("sd_do", Integer.valueOf(2)), Pair.<String, Integer>of("sd_di", Integer.valueOf(15)), Pair.<String, Integer>of("sd_cs", Integer.valueOf(13))));
}
