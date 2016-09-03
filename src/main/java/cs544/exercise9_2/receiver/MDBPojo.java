package cs544.exercise9_2.receiver;

import javax.jms.*;

public class MDBPojo implements MessageListener {

    public void onMessage(Message message){
    	ObjectMessage objmessage = (ObjectMessage)message;
    	try {
			String str = (String)objmessage.getObject();
			System.out.println("MDBPojo receives messageed : "+str);
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }
}

