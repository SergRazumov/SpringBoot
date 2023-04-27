package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

  public static void main(String[] args) {
    SpringApplication.run(Main.class);
    System.out.println("Это ветка main");
    System.out.println("Это ветка main2");
    System.out.println("Commit1 from Sergey для переноса");
  }

}
