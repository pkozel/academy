package theory.lecture_13.sockets;

public class Main {
    public static void main(String[] args) {
        Thread server = new Thread(new Server());
        Thread client = new Thread(new Client());

        server.start();
        client.start();
    }
}