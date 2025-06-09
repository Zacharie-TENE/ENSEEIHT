import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.jms.*;
import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

public class Irc {
    public static TextArea text;
    public static TextField data;
    public static Frame frame;

    public static String url = ActiveMQConnection.DEFAULT_BROKER_URL;
    public static String subject = "MyQueue";

    public static ConnectionFactory connectionFactory;
    public static Connection connection;
    public static Session session;
    public static MessageConsumer consumer;
    public static MessageProducer producer;
    public static Topic topic;
    public static String myName;
    
    // GUI Setup
    public static void main(String argv[]) {
        if (argv.length != 1) {
            System.out.println("java Irc <name>");
            return;
        }
        myName = argv[0];

        // creation of the GUI 
        frame = new Frame();
        frame.setLayout(new FlowLayout());

        text = new TextArea(10, 55);
        text.setEditable(false);
        text.setForeground(Color.red);
        frame.add(text);

        data = new TextField(55);
        frame.add(data);

        Button write_button = new Button("write");
        write_button.addActionListener(new writeListener());
        frame.add(write_button);

        Button connect_button = new Button("connect");
        connect_button.addActionListener(new connectListener());
        frame.add(connect_button);

        Button who_button = new Button("who");
        who_button.addActionListener(new whoListener());
        frame.add(who_button);

        Button leave_button = new Button("leave");
        leave_button.addActionListener(new leaveListener());
        frame.add(leave_button);

        frame.setSize(470, 300);
        text.setBackground(Color.black);
        frame.setVisible(true);
    }

    /* allow to print something in the window */
    public static void print(String msg) {
        try {
            text.append(msg + "\n");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // action invoked when the "write" button is clicked
    static class writeListener implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            try {
                String messageText = data.getText();
                if (messageText.isEmpty()) {
                    return;
                }

              
                TextMessage message = session.createTextMessage();
               // message.setText(myName + ": " + messageText);
                producer.send(message);
                print(myName + ": " + messageText); 

                data.setText(""); 
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    // action invoked when the "connect" button is clicked
    static class connectListener implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            try {
        
                connectionFactory = new ActiveMQConnectionFactory(url);
                connection = connectionFactory.createConnection();
                connection.start();

                session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
                topic = session.createTopic(subject);

                producer = session.createProducer(topic);
                producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);

        
                consumer = session.createConsumer(topic);
                consumer.setMessageListener(new MessageListener() {
                    public void onMessage(Message message) {
                        try {
                            if (message instanceof TextMessage) {
                                TextMessage textMessage = (TextMessage) message;
                                String msg = textMessage.getText();
								if(msg.equals("demande la liste des utilisateurs."))
									{producer.send("*"+myName);
									return ;}	

								else if(msg.startWith("*"))	
									return;						

                                print(msg); 
                            }
                        } catch (JMSException ex) {
                            ex.printStackTrace();
                        }
                    }
                });

                print("Connecte au forum comme " + myName);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    
    static class whoListener implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            try {
               
                TextMessage message = session.createTextMessage();
                message.setText("demande la liste des utilisateurs.");
                producer.send(message);
                print("demande la liste des participants...");
			
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }


    static class leaveListener implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            try {
              
                TextMessage message = session.createTextMessage();
                message.setText(myName + "a quitté le forum");
                producer.send(message);

             
                connection.close();
                print(myName + " a quitté le forum");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
