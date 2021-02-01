package cool.spongecaptain;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TestSocketBlocked {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8988);

        while (true){
            Socket socket = serverSocket.accept();
        }
    }
}
