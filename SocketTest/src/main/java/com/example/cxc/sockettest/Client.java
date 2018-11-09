package com.example.cxc.sockettest;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    public void start() {
        Socket socket = null;
        try {
            StringBuilder time = new StringBuilder();
            socket = new Socket("127.0.0.1", Server.PORT);
            socket.setSoTimeout(15000);
            InputStream inputStream = socket.getInputStream();
            InputStreamReader reader = new InputStreamReader(inputStream, "ASCII");
            for (int c = reader.read(); c != -1; c = reader.read()) {
                time.append((char) c);
            }

            System.out.println(time);

        } catch (IOException e) {

        } finally {
            if (socket != null) {
                try {
                    socket.close();
                } catch (Exception e) {
                    //
                }
            }
        }
    }
}
