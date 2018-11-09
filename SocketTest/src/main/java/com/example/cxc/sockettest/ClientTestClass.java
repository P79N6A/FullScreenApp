package com.example.cxc.sockettest;

public class ClientTestClass {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Client client = new Client();
            client.start();
        }
    }
}
