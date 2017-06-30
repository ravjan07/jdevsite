package jdev;

import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread {
    private static int port = 8000;

    public static void main(String[] args) {
	if (args != null && args.length > 0){
		port = Integer.parseInt(args[0]);
	}
        new Server().start();
    }

    @Override
    public void run() {
        try (ServerSocket server = new ServerSocket(port)) {
            System.out.println("Server is running on " + port);
	    while (true) {
                Socket client = server.accept();
                System.out.println("New Client " + client.getInetAddress());
                client.getOutputStream().write("Hello from pi server!".getBytes());
                client.getOutputStream().flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
