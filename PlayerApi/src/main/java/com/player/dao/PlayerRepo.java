package com.player.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.player.model.Player;

@Repository
public interface PlayerRepo extends MongoRepository<Player, Integer>{

}
