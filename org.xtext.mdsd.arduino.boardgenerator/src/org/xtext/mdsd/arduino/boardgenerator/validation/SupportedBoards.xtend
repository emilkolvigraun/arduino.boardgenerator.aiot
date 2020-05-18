package org.xtext.mdsd.arduino.boardgenerator.validation

import java.util.Map

class SupportedBoards {
	 
	 // esp32 boards
	public static final Map<String, Integer> WROVER = #{
		"hts221" -> 2,
		"fbm320" -> 1, 
		"bh1750" -> 1,  
		"mpu6050" -> 7, 
		"mag3110" -> 3
	}
	
}