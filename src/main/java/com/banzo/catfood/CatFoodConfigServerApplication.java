package com.banzo.catfood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class CatFoodConfigServerApplication {

  public static void main(String[] args) {
    SpringApplication.run(CatFoodConfigServerApplication.class, args);
  }
}
