import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoException;
import com.mongodb.WriteConcern;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.DBCursor;

import org.codehaus.jackson.*;
import org.codehaus.jackson.map.ObjectMapper;

import com.mongodb.ServerAddress;
import java.util.Arrays;
import java.util.List;

import org.eclipse.paho.client.mqttv3.MqttMessage;

public class MongoConnection {
	MqttMessage message;
	String topic;
	Sensor sensor;
	
	public MongoConnection(String topic, MqttMessage message) {
		this.message = message;
		this.topic = topic;
		ObjectMapper mapper = new ObjectMapper();
		if(topic.equals("iscte_sid_2016_S1")){
		
		}
		sendMessage();
	}

	private void sendMessage() {
		 MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
		 DB db = mongoClient.getDB("RegistoPassagem");
		 
		 
		
	}

	public static void main(String[] args){
		  try{   
				
		         // To connect to mongodb server
			  MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));

					
		         // Now connect to your databases
		         DB db = mongoClient.getDB( "test");
		         DBCollection coll = db.getCollection("mycol");
		         
		         List<String> dbs = mongoClient.getDatabaseNames();
		         
		         List<Integer> books = Arrays.asList(27464, 747854);
		         DBObject person = new BasicDBObject()
		                                     .append("name", "Jo Bloggs")
		                                     .append("address", new BasicDBObject("street", "123 Fake St")
		                                                                  .append("city", "Faketon")
		                                                                  .append("state", "MA")
		                                                                  .append("zip", 12345))
		                                     .append("books", books);
		         
		         DB database = mongoClient.getDB("Examples");
		         DBCollection collection = database.getCollection("people");
		             
		         collection.insert(person);
		         
		         
		         
		         
		         for(String dba : dbs){
		         	System.out.println(dba);
		         }
		      }catch(Exception e){
		         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		      }
		
	}
}
