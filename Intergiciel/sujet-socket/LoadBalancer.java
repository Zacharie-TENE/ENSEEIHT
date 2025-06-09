import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class LoadBalancer extends Thread {
        static String hosts[] = {"localhost", "localhost"};
        static int ports[] = {8081,8082};
        static int nbHosts = 2;
        static Random rand = new Random();

        Socket ssock;
        public LoadBalancer(Socket ssock){
                this.ssock=ssock;
            }


       	public static void main (String[] args) throws IOException {

             try {
                    ServerSocket ss;
                    int port = 8083;
                    ss = new ServerSocket(port);
                    System.out.println("loadbalancer ready ...");
                    while (true) {
                        LoadBalancer sl = new LoadBalancer(ss.accept());
                        sl.start();
                    }
                 } catch (Exception e) {
                     System.out.println("An error has occurred ..."+ e.getMessage());
                 }

        }


          public void run (){

                int indice=LoadBalancer.rand.nextInt(LoadBalancer.nbHosts);
                Socket server;

            try {
                server = new Socket(hosts[indice],ports[indice]);
                int byteReal;
                System.out.println("Serveur attribué" + hosts[indice] +":"+ ports[indice]);
                byte[]  buffer =new byte [1024];


                // #pour communiquer avec les clients
                InputStream ins = ssock.getInputStream();

                OutputStream oos = ssock.getOutputStream();

                
                // #pour communiquer avec les servers
                
                InputStream serins = server.getInputStream();

                OutputStream seroos = server.getOutputStream();

                //communcation avec le client

                byteReal=ins.read(buffer);
          
                seroos.write(buffer,0,byteReal);


                //communication avec le server
                //byteReal=serins.read(buffer);

                //oos.write(buffer,0,byteReal);
                    
                
                byteReal=0;
                ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
                byte[] buffer1 = new byte[1024];
                int bytesRead;
                while ((bytesRead = serins.read(buffer1)) != -1) {
                    byteStream.write(buffer1, 0, bytesRead);
                    byteReal+=bytesRead;
                }
                byte[] allData = byteStream.toByteArray();

                FileOutputStream fos = new FileOutputStream("video.mp4");
                fos.write(allData);
                fos.flush();
                fos.close();
              //  oos.write(allData,0,byteReal);


                //fermeture de la liaison

                 ssock.close();
                 server.close();

                
            }

            catch (Exception e) {
                     System.out.println("An error has occurred ..."+e.getMessage());
                 }

               
            }
	}
