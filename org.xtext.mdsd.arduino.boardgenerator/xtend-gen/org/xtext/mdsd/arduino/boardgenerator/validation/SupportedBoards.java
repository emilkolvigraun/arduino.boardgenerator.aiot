package org.xtext.mdsd.arduino.boardgenerator.validation;

import java.util.Collections;
import java.util.Map;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pair;

@SuppressWarnings("all")
public class SupportedBoards {
  public static final Map<String, Integer> WROVER = Collections.<String, Integer>unmodifiableMap(CollectionLiterals.<String, Integer>newHashMap(Pair.<String, Integer>of("hts221", Integer.valueOf(2)), Pair.<String, Integer>of("fbm320", Integer.valueOf(1)), Pair.<String, Integer>of("bh1750", Integer.valueOf(1)), Pair.<String, Integer>of("mpu6050", Integer.valueOf(7)), Pair.<String, Integer>of("mag3110", Integer.valueOf(3))));
}
