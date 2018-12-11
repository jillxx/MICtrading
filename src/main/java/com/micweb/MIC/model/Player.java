package com.micweb.MIC.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "player")
@Access(AccessType.FIELD)
public class Player {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String pin;
	
	@OneToMany(mappedBy ="primaryKey.player", cascade = CascadeType.ALL)
	private Set<PlayerShiki> playerShiki = new HashSet<PlayerShiki>();
	
	
	
	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Player(String name, String pin) {
		super();
		this.name = name;
		this.pin = pin;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	
	public Set<PlayerShiki> getPlayerShiki(){
		return playerShiki;
	}
	
	public void setPlayerShiki(Set<PlayerShiki> players) {
		this.playerShiki = players;
	}	
	public void addPlayerShiki(PlayerShiki playerShiki) {
		this.playerShiki.add(playerShiki);
	
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", pin=" + pin + "]";
	}



	
	
}
