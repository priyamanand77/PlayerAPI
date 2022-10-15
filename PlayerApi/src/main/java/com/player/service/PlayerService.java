package com.player.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.player.dao.PlayerRepo;
import com.player.model.Player;

@Service
public class PlayerService {

	@Autowired
	private PlayerRepo repo;
	
	
	public Player addPlayer(Player p)
	{
		return repo.save(p);
	}
	
	public List<Player> getAllPlayer()
	{
		return repo.findAll();
	}

	public Player getOnePlayer(int id) {
		return repo.findById(id).get();
		
	
	}

	public Player updatePlayer(int id,Player p) 
	{
		Player player=repo.findById(id).get();
		player.setAge(p.getAge());
		player.setName(p.getName());
		player.setPhno(p.getPhno());
		player.setTeam(p.getTeam());
		repo.save(player);
		return player;
	}

	public String deletebyid(int id) {
		repo.deleteById(id);
		return "player with "+id + " has been deleted from database";
	}

	public String deleteAllPlayer() {
		repo.deleteAll();
		return "All players has been deleted from database";
	}
	
	
	
}
