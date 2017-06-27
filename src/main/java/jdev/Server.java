package jdev;

import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread {

    public static void main(String[] args) {
        new Server().start();
    }

    @Override
    public void run() {
        try (ServerSocket server = new ServerSocket(8088)) {
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
