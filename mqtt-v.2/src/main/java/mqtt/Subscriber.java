package mqtt;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;

public class Subscriber {

    public static void main(String[] args) throws MqttException {

        System.out.println("== START SUBSCRIBER ==");

        MqttClient client = new MqttClient("tcp://localhost:1883", MqttClient.generateClientId());
        client.setCallback(new CallBack());
        client.connect();

//        client.subscribe("iot_data");
//        client.subscribe("iot_test");
        client.subscribe("outTopic");

    }

}
