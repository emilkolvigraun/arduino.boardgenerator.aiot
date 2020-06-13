package org.xtext.mdsd.arduino.boardgenerator.validation

import java.util.Map

class SupportedBoards { 
	 
	 // esp32 boards
	public static final Map<String, Integer> WROVER = #{
		"hts221"  -> 2,
		"fbm320"  -> 1, 
		"bh1750"  -> 1,  
		"mpu6050" -> 7, 
		"mag3110" -> 3
	}
	
	// esp32 boards
	public static final Map<String, String> WROVER_INFO = #{
		"hts221"  -> "(temperature[0], humidity[1])",
		"fbm320"  -> "([0])", 
		"bh1750"  -> "(light_level[0])",  
		"mpu6050" -> "([0],[1],[2],[3],[4],[5],[6])", 
		"mag3110" -> "(acc_x[0],acc_x[y],acc_x[z])" 
	}
	
}