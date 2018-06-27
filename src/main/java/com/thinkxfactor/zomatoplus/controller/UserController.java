package com.thinkxfactor.zomatoplus.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.User;
import com.thinkxfactor.zomatoplus.repository.UserRepository;


@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/add")
	public User addUser(@RequestBody User user)
	{
		User persistedUser=userRepository.save(user);
		return persistedUser;
	}
	
	@PostMapping("/getAll")
	public List<User> getAll()
	{
		List<User> listofusers=userRepository.findAll();
		return listofusers;
	}

	/*@GetMapping("/login")
	public User userLogin(@RequestParam("username") String username,@RequestParam("password") String password) {
		User usr = new User();
		usr.setUsername(username);
		usr.setPassword(password);
		return usr;
	}*/
	/*@GetMapping("/all")
	public List<User> userList() {
		List<User> users = new ArrayList<>(); 
		User usr1,usr2,usr3;
		usr1 = new User("Arya","abc123");
		usr2 = new User("Joey","xyz122");
		usr3 = new User("Chandler","woohpah");
		users.add(usr1);
		users.add(usr2);
		users.add(usr3);
		return users;

	}
	*/
	/*@PostMapping("/create")
	public User userCreate(@RequestBody User user)
	{ System.out.println(user.toString());
	return user;
	}*/

	

}
