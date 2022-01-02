package net.javaguides.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.springboot.model.User;
import net.javaguides.springboot.repository.UserRepository;

@SpringBootApplication
public class SpringbotBackendApplication implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbotBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Ram","dubey", "ab@bidas.com"));
		this.userRepository.save(new User("shyam","dubey", "shyam@bidas.com"));
		this.userRepository.save(new User("john","dubey", "john@bidas.com"));
		this.userRepository.save(new User("Cena","dubey", "Cena@bidas.com"));
		this.userRepository.save(new User("Eleven","dubey", "eleven@bidas.com"));
		
	}
}
