package pl.sda.springbootweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.sda.springbootweb.dto.UserDto;
import pl.sda.springbootweb.service.UserService;

@SpringBootApplication
public class SpringBootWebApplication implements ApplicationRunner {

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		userService.add(createUser("Kasia", "Nowak", "Warszawa"));
		userService.add(createUser("Monika", "Kowalska", "Kraków"));
		userService.add(createUser("Marcin", "Ciućka", "Poznań"));
	}

	private UserDto createUser(String firstName, String lastname, String address) {
		return UserDto.builder().firstName(firstName).lastName(lastname).address(address).build();
	}
}
