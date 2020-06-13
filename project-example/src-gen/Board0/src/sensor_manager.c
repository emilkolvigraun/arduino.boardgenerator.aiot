#include <stdio.h>
#include <math.h>
#include "driver/i2c.h"
 
#include "sensors/bh1750.h"
#include "sensors/hts221.h"
 
#define I2C_MASTER_SCL_IO  26     /*!< gpio number for I2C master clock */
#define I2C_MASTER_SDA_IO  25 	  /*!< gpio number for I2C master data  */
#define I2C_MASTER_FREQ_HZ 100000 /*!< I2C master clock frequency */
 
static i2c_bus_handle_t i2c_bus = NULL;
static hts221_handle_t hts221   = NULL;
static bh1750_handle_t bh1750   = NULL;

static void i2c_master_init() {
    int i2c_master_port = I2C_NUM_0;
    i2c_config_t conf;
    conf.mode = I2C_MODE_MASTER;
    conf.sda_io_num = I2C_MASTER_SDA_IO;
    conf.sda_pullup_en = GPIO_PULLUP_ENABLE;
    conf.scl_io_num = I2C_MASTER_SCL_IO;
    conf.scl_pullup_en = GPIO_PULLUP_ENABLE;
    conf.master.clk_speed = I2C_MASTER_FREQ_HZ;
    i2c_bus = iot_i2c_bus_create(i2c_master_port, &conf);
}
 
void init_bh1750_sensor() {
	bh1750 = iot_bh1750_create(i2c_bus, BH1750_I2C_ADDRESS);
	bh1750_cmd_measure_t cmd_measure = BH1750_CONTINUE_4LX_RES;
	iot_bh1750_power_on(bh1750); 
	iot_bh1750_set_measure_mode(bh1750, cmd_measure);	 
}
 
void init_hts221_sensor() {
	hts221 = iot_hts221_create(i2c_bus, HTS221_I2C_ADDRESS);
	hts221_config_t hts221_config;
	hts221_config.avg_h = HTS221_AVGH_32;
	hts221_config.avg_t = HTS221_AVGT_16;
	hts221_config.odr = HTS221_ODR_1HZ;
	hts221_config.bdu_status = HTS221_DISABLE;
	hts221_config.heater_status = HTS221_DISABLE;
	iot_hts221_set_config(hts221, &hts221_config);
	iot_hts221_set_activate(hts221);
}
 
void init_sensors() { 
	i2c_master_init();
	init_bh1750_sensor();
	init_hts221_sensor();
	init_hts221_sensor();
}
 
struct lightTuple {
	float tuple[1];
};
 
struct lightTuple get_light(){
	struct lightTuple tbl;
	
	int ret;
	float bh1750_data;
	if (bh1750 == NULL){
	    return tbl;
	}
	ret = iot_bh1750_get_data(bh1750, &bh1750_data);
	if (ret != ESP_OK){
	    printf("No ack, sensor not connected...\n");
	    return tbl;
	}
	tbl.tuple[0] = bh1750_data;
	
	return tbl;
}
 
struct temperatureTuple {
	float tuple[1];
};
 
struct temperatureTuple get_temperature(){
	struct temperatureTuple tbl;
	
	int16_t temperature;
	if (hts221 == NULL){
	    return tbl;
	}
	iot_hts221_get_temperature(hts221, &temperature);
	tbl.tuple[0] = (float)temperature / 10;
	
	return tbl;
}
 
struct humidityTuple {
	float tuple[1];
};
 
struct humidityTuple get_humidity(){
	struct humidityTuple tbl;
	
	int16_t humidity;
	if (hts221 == NULL){
	    return tbl;
	}
	iot_hts221_get_humidity(hts221, &humidity);
	tbl.tuple[1] = (float)humidity / 10;
	
	return tbl;
}
 
