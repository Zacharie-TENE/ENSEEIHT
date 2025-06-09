import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Comanche implements Runnable {
	private Socket s;
	public Comanche (Socket s) { this.s = s; }
	
	public static void main (String[] args) throws IOException {
		ServerSocket s = new ServerSocket(Integer.parseInt(args[0]));
		while (true) { new Thread(new Comanche(s.accept())).start(); }
	}

	public void run () {
		try {
			InputStreamReader in = new InputStreamReader(s.getInputStream());
			PrintStream out = new PrintStream(s.getOutputStream());
			String rq = new LineNumberReader(in).readLine();
			System.out.println(rq);
			if (rq.startsWith("GET ")) {
				System.out.println(rq.substring(5, rq.indexOf(' ', 4)));
				File f = new File(rq.substring(5, rq.indexOf(' ', 4)));
				if (f.exists() && !f.isDirectory()) {
					InputStream is = new FileInputStream(f);
					System.out.println(is.available());
					byte[] data = new byte[is.available()];
					is.read(data);
					is.close();
					// Send the appropriate Content-Type header
					String filePath = rq.substring(5, rq.indexOf(' ', 4));
                    String contentType = "application/octet-stream"; // Default
                    if (filePath.endsWith(".mp4")) {
                        contentType = "video/mp4";
					
						// Envoyer les données vidéo
						out.write(data, 0, data.length);
						
						out.flush();
					
						out.close();
						s.close();
						return;
					
						
                    }

					String c = new String(data);
					out.print("HTTP/1.0 200 OK\n\n"+c);
				} else {
					out.print("HTTP/1.0 404 Not Found\n\n <html>Document not found.</html>");
				}
			}
			out.close();
			s.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
