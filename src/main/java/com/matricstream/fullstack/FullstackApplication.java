package com.matricstream.fullstack;

import javax.annotation.PostConstruct;

import com.matricstream.fullstack.entity.User;
import com.matricstream.fullstack.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FullstackApplication {

	public static void main(String[] args) {
		SpringApplication.run(FullstackApplication.class, args);
	}


	@Autowired
	UserRepository userRepository;

	@PostConstruct
	public void runThisQuery() {
		User user = new User(1, "arpitjoshi333@gmail.com", "Arpit", "Joshi", "aj333", "toor", "admin");
		userRepository.save(user);
		User user1 = new User(2, "paul123@gmail.com", "Paul", "Mathew", "paul123", "jan2021", "user");
		userRepository.save(user1);
	}

}
