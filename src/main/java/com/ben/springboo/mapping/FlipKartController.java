package com.ben.springboo.mapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ben.springboo.model.User;

@RestController
@RequestMapping("/orderService")
public class FlipKartController {
	
	@Autowired
	private FlipKartRepository flipKartRepository;
	
	@PostMapping("/placeOrder")
	private String placeOrder(@RequestBody User user) {
		flipKartRepository.save(user);
		System.out.println("this is test");
		return "Order placed sucessfully";
	}
	
	@GetMapping("/getUsers")
	public List<User> getUser(){
		return flipKartRepository.findAll();	
	}
	
	@GetMapping("/getBYName/{name}")
	public List<User> getUserBYName(@PathVariable String name){
		return flipKartRepository.findByName(name);
	}
	
	@GetMapping("/getByCity/{city}")
	public List<User> getUserBYAddress(@PathVariable String city){
		return flipKartRepository.findBYCity(city);
	}
}
