package com.player.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.player.model.Player;
import com.player.service.PlayerService;

@RestController
public class PlayerController {

	
	@Autowired
	PlayerService ser;
	
	//to add player data
	@PostMapping("/add")
	public Player addData(@RequestBody Player p)
	{
		return ser.addPlayer(p);
	}
	
	//to get player data
	@GetMapping("/getAll")
	public List<Player> getAll()
	{
		return ser.getAllPlayer();
	}
	
	//to get 1 player data using id
	@GetMapping("/getOne/{id}")
	public Player getOne(@PathVariable(name = "id") int id)
	{
		return ser.getOnePlayer(id);
	}
	//upadte using id
	@PutMapping("/update/{id}")
	public Player update(@PathVariable(name = "id") int id , @RequestBody Player p)
	{
		return ser.updatePlayer(id,p);
		
	}
	//delete using id
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable(name = "id") int id)
	{
		return ser.deletebyid(id);
	}
	
	@DeleteMapping("/deleteAll")
	public String deleteAllPlayer()
	{
		return ser.deleteAllPlayer();
	}
	
	
	
	
}
