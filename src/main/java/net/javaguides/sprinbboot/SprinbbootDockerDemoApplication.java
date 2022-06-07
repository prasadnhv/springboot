package net.javaguides.sprinbboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@restcontroller
public class Springbootdockerdemoapplication {
@GetMapping("/Welcome")
public String welcome(){
return "Sringboot Docker demo";
}
public class SprinbbootDockerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprinbbootDockerDemoApplication.class, args);
	}

}
