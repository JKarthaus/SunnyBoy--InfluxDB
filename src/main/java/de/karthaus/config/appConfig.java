package de.karthaus.config;

import io.micronaut.context.annotation.Context;
import io.micronaut.context.annotation.Value;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Singleton;

@Context
public class appConfig {

    private static final Logger log = LoggerFactory.getLogger(appConfig.class);

    @Value("${micronaut.application.mqtt.broker.url}")
    private String mqttBrokerURL;

    @Value("${micronaut.application.mqtt.broker.password:#{null}}")
    private String mqttBrokerPasssword;

    @Value("${micronaut.application.mqtt.broker.username:#{null}}")
    private String mqttBrokerUsename;

    @Value("${micronaut.application.mqtt.broker.topic}")
    private String mqttBrokerTopic;

    @Value("${micronaut.application.location.longitude}")
    private String longitude;

    @Value("${micronaut.application.location.latitude}")
    private String latitude;

    public appConfig() {
        log.info("SmaDataLoggerConfig initialised");
    }

    public String getMqttBrokerURL() {
        return mqttBrokerURL;
    }

    public void setMqttBrokerURL(String mqttBrokerURL) {
        this.mqttBrokerURL = mqttBrokerURL;
    }

    public String getMqttBrokerPasssword() {
        return mqttBrokerPasssword;
    }

    public void setMqttBrokerPasssword(String mqttBrokerPasssword) {
        this.mqttBrokerPasssword = mqttBrokerPasssword;
    }

    public String getMqttBrokerUsename() {
        return mqttBrokerUsename;
    }

    public void setMqttBrokerUsename(String mqttBrokerUsename) {
        this.mqttBrokerUsename = mqttBrokerUsename;
    }

    public String getMqttBrokerTopic() {
        return mqttBrokerTopic;
    }

    public void setMqttBrokerTopic(String mqttBrokerTopic) {
        this.mqttBrokerTopic = mqttBrokerTopic;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
}
