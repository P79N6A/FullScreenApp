package com.example.cxc.sockettest;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static final int PORT = 8080;

    public void start() {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(PORT);
            while (true) {
                Socket connection = serverSocket.accept();

                Writer out = new OutputStreamWriter(connection.getOutputStream());
                out.write("Hello client,this is server");
                out.flush();
                connection.close();
            }
        } catch (IOException e) {

        } finally {
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (Exception e) {

                }
            }
        }

    }
}
