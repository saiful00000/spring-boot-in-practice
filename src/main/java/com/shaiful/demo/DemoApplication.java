package com.shaiful.demo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.shaiful.demo.models.Employee;
import org.apache.coyote.Response;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@SpringBootApplication
@RestController
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	@GetMapping("/get-data")
	@ResponseBody
	public JsonNode getData() throws JsonProcessingException {
		List<Employee> employeeList = new ArrayList<>();
		for(int i = 0; i < 3; i++){
			employeeList.add(new Employee("Name" + i, "SW", 55000, "E2", 5.7));
		}

		ObjectMapper mapper = new ObjectMapper();
		return  mapper.readTree(mapper.writeValueAsString(employeeList));
	}
}