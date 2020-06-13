package org.xtext.mdsd.arduino.boardgenerator.validation;

import java.util.Collections;
import java.util.Map;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pair;

@SuppressWarnings("all")
public class SupportedBoards {
  public static final Map<String, Integer> WROVER = Collections.<String, Integer>unmodifiableMap(CollectionLiterals.<String, Integer>newHashMap(Pair.<String, Integer>of("hts221", Integer.valueOf(2)), Pair.<String, Integer>of("fbm320", Integer.valueOf(1)), Pair.<String, Integer>of("bh1750", Integer.valueOf(1)), Pair.<String, Integer>of("mpu6050", Integer.valueOf(7)), Pair.<String, Integer>of("mag3110", Integer.valueOf(3))));
  
  public static final Map<String, String> WROVER_INFO = Collections.<String, String>unmodifiableMap(CollectionLiterals.<String, String>newHashMap(Pair.<String, String>of("hts221", "(temperature[0], humidity[1])"), Pair.<String, String>of("fbm320", "([0])"), Pair.<String, String>of("bh1750", "(light_level[0])"), Pair.<String, String>of("mpu6050", "([0],[1],[2],[3],[4],[5],[6])"), Pair.<String, String>of("mag3110", "(acc_x[0],acc_x[y],acc_x[z])")));
}
