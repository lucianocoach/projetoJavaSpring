package com.kapon.curso.config;

import com.kapon.curso.entities.User;
import com.kapon.curso.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Dixon tibs", "tibs@gmail.com", "972879867", "1098455");
        User u3 = new User(null, "Tina Tunner", "tina@gmail.com", "988856756", "189054");
        User u4 = new User(null, "Alexandre Yung", "young@gmail.com", "97456788", "1567453");
        User u5 = new User(null, "James Brown", "brown@gmail.com", "9888822348", "1278951");
        User u6 = new User(null, "Bono Green", "bono@gmail.com", "97776645", "1078889");
        User u7 = new User(null, "Luiz Gonzaga", "luiz@gmail.com", "988887890", "102345477");
        User u8 = new User(null, "Ana Maria", "ana@gmail.com", "977756787", "12456703");

        userRepository.saveAll(Arrays.asList(
                u1,
                u2,
                u3,
                u4,
                u5,
                u6,
                u7,
                u8
        ));
    }
}
