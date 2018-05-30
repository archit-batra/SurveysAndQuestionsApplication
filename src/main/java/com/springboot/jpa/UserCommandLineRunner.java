package com.springboot.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserCommandLineRunner implements CommandLineRunner {

  private static final Logger log = LoggerFactory
      .getLogger(UserCommandLineRunner.class);

  @Autowired
  private UserRepository repository;

  @Override
  public void run(String... args) throws Exception {

    repository.save(new User("Random", "Admin"));
    repository.save(new User("Random1", "User"));
    repository.save(new User("Random2", "Admin"));
    repository.save(new User("Random3", "User"));

    for (User user : repository.findAll()) {
      log.info(user.toString());
    }

    log.info("Admin users are.....");
    log.info("____________________");
    for (User user : repository.findByRole("Admin")) {
      log.info(user.toString());
    }

  }

}