package com.sonu.ecomproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import  java.sql.*;

@SpringBootApplication
public class EcomProjectApplication {

    public static void main(String[] args)  {
        SpringApplication.run(EcomProjectApplication.class, args);

        System.out.println("connection succeessful");
    }

}
