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

import com.thinkxfactor.zomatoplus.models.Items;
import com.thinkxfactor.zomatoplus.models.Restaurant;
import com.thinkxfactor.zomatoplus.models.User;
import com.thinkxfactor.zomatoplus.repository.RestaurantRepository;
import com.thinkxfactor.zomatoplus.repository.UserRepository;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
	@Autowired
	private RestaurantRepository restRepository;
	
	@PostMapping("/add")
	public Restaurant addRestaurant(@RequestBody Restaurant rest)
	{
		Restaurant persistedRest=restRepository.save(rest);
		return persistedRest;
	}
	
	@PostMapping("/getAll")
	public List<Restaurant> getAll()
	{
		List<Restaurant> listofrests=restRepository.findAll();
		return listofrests;
	}
	/*@PostMapping("/create")
	public Restaurant createRestaurant(@RequestParam ("name") String name, @RequestParam ("address") String address,@RequestParam ("rating") String rating,@RequestParam ("website") String website,@RequestParam ("contact_no") String contact_no) {
		Restaurant r=new Restaurant();
		r.setName(name);
		r.setAddress(address);
		r.setRating(rating);
		r.setWebsite(website);
		r.setContact_no(contact_no);
		System.out.println(r.toString());
		return r;
	}
	
	@GetMapping("/getall")
	public List<Restaurant> listAllRestaurants()
	{
		List<Restaurant> rst=new ArrayList<>();
		Restaurant r1,r2,r3;
		r1=new Restaurant("abc","123","4","xyz.com","12345");
		r2=new Restaurant("def","456","3","mno.com","45678");
		r3=new Restaurant("ghi","789","5","pqr.com","67890");
		rst.add(r1);
		rst.add(r2);
		rst.add(r3);
		return rst;

	}
	
	@PostMapping("/additems")
	public Items addItems(@RequestBody Items items)
	{
		System.out.println(items.toString());
		return items;
	}*/
	
	

}
