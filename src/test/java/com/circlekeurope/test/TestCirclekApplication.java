package com.circlekeurope.test;

import org.springframework.boot.SpringApplication;

public class TestCirclekApplication {

  public static void main(String[] args) {
    SpringApplication.from(CirclekApplication::main).with(TestcontainersConfiguration.class).run(args);
  }

}
