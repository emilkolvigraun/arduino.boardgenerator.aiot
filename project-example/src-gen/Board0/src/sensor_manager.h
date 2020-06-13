#ifndef SENSOR_MANAGER_H
#define SENSOR_MANAGER_H

#ifdef __cplusplus
extern "C"
{
	#endif
	struct lightTuple {
		float tuple[1];
	};
	struct temperatureTuple {
		float tuple[1];
	};
	struct humidityTuple {
		float tuple[1];
	};
	void  init_sensors();
	lightTuple get_light();
	temperatureTuple get_temperature();
	humidityTuple get_humidity();
	
	#ifdef __cplusplus
}
#endif
#endif
