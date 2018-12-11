package com.micweb.MIC.model;

import java.io.Serializable;
import java.util.Optional;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class PlayerShikiId implements Serializable {
	@ManyToOne(cascade = CascadeType.ALL)
	private Player player;
	@ManyToOne(cascade = CascadeType.ALL)
	private Shiki shiki;
	
	



	public PlayerShikiId() {
		// TODO Auto-generated constructor stub
	}


	public Player getPlayer() {
		return player;
	}
	
	
	public void setPlayer(Player player) {
		this.player = player;
	}


	
	public Shiki getShiki() {
		return shiki;
	}

	public void setShiki(Shiki shiki) {
		this.shiki = shiki;
	}

	
	

	@Override
	public String toString() {
		return "PlayerShikiId [player=" + player + ", shiki=" + shiki + "]";
	}
	
	

}
