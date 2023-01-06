package com.nagarro.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.user.entity.Person;
import com.nagarro.user.service.UserService;
import com.nagarro.user.VO.ResponseTemplateVO;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/")
	public Person savePerson(@RequestBody Person person) {
		return userService.savePerson(person);
	}
	
	@GetMapping("/{id}")
    public ResponseTemplateVO getPersonWithProduct(@PathVariable("id") Long userId) {
		return userService.getPersonWithProduct(userId);
	}

}
