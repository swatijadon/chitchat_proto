package org.example;

import com.example.entities.LoginProto;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

       var builder= LoginProto.LoginRequest.newBuilder().setPassword("ebviybe").build();
        System.out.print("Builder +"+builder);
    }
}