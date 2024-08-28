package com.circlekeurope.test;

import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CirclekApplication {

  public static void main(String[] args) {
    SpringApplication.run(CirclekApplication.class, args);

    CountService countService = new CountService();
    System.out.println(countService.squareEvenNumbers(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
  }

}
