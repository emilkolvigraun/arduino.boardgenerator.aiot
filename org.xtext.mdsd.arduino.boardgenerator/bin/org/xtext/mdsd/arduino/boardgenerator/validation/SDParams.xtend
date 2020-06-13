package org.xtext.mdsd.arduino.boardgenerator.validation

import java.util.Map;

class SDParams {
	
	public static final Map<String, Integer> WROVER = #{
		"sd_clk"  -> 14,
		"sd_do"  -> 2, 
		"sd_di"  -> 15,  
		"sd_cs" -> 13
	}
}
