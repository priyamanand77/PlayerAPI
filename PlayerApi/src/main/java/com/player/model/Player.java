package com.player.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "list-players")
public class Player {

	@Id
	private int id;
	private String name;
	private int age;
	private String team; 
	private String phno;
	
}
