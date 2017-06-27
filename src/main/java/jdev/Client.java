package jdev;

import java.net.Socket;

public class Client extends Thread {

    private static String hostname;
    private static int port;

    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("no host name or/and port");
            System.exit(0);
        }
        hostname = args[0];
        port = Integer.parseInt(args[1]);
        new Client().start();
    }

    @Override
    public void run() {
        try (Socket client = new Socket(hostname, port)) {
            while (true) {
                int b = client.getInputStream().read();
                if (b > 0) {
                    System.out.print(((char) b));
                } else {
                    Thread.sleep(1000);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
