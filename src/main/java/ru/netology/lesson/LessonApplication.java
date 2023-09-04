package ru.netology.lesson;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class LessonApplication {
	@Value("${server.port}")
	private String port;

	@GetMapping
	String index() {
		return "hello from " + port;
	}

	public static void main(String[] args) {
		SpringApplication.run(LessonApplication.class, args);
	}

}
