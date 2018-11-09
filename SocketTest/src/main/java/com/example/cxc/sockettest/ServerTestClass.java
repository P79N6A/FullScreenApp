package com.example.cxc.sockettest;

public class ServerTestClass {
    public static void main(String[] args) {
        System.out.println("server is start...");

        Server server = new Server();
        server.start();

    }
}
