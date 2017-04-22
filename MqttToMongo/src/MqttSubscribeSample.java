import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

public class MqttSubscribeSample implements MqttCallback {
	 
	public static void main(String[] args) {

         String topic        = "iscte_sid_2016_S#";
         String content      = "Message from MqttPublishSample";
         int qos             = 2;
         String broker       = "tcp://iot.eclipse.org:1883";
         String clientId     = "sajkfsjdnfsnfs";
         MemoryPersistence persistence = new MemoryPersistence();

         try {
             MqttClient sampleClient = new MqttClient(broker, clientId, persistence);
             MqttConnectOptions connOpts = new MqttConnectOptions();
             connOpts.setCleanSession(true);
             System.out.println("Connecting to broker: "+broker);
             sampleClient.connect(connOpts);
             System.out.println("Connected");
             sampleClient.setCallback(new MqttSubscribeSample());
             sampleClient.subscribe(topic);
         } catch(MqttException me) {
             System.out.println("reason "+me.getReasonCode());
             System.out.println("msg "+me.getMessage());
             System.out.println("loc "+me.getLocalizedMessage());
             System.out.println("cause "+me.getCause());
             System.out.println("excep "+me);
             me.printStackTrace();
         }
     }

	@Override
	public void connectionLost(Throwable arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deliveryComplete(IMqttDeliveryToken arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void messageArrived(String arg0, MqttMessage arg1) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(arg1);
		MongoConnection putMessage = new MongoConnection(arg0, arg1);
		
	}
}
