package com.example.Springboot_Github;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
@RequestMapping("/test")
public String test() {
	return "Hello Worldkjhsdljifhlsdi";
}
@RequestMapping("/contact")
public String contact() {
	return "Contact Us : 8084540916";
}

}