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
@Table(name = "shikilist")
@Access(AccessType.FIELD)
public class Shiki {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int shikiid;
	private String shikiname;
	
	@OneToMany(mappedBy = "primaryKey.shiki", cascade = CascadeType.ALL)
	private Set<PlayerShiki> playerShiki = new HashSet<PlayerShiki>();
	
	
	public Shiki() {
		// TODO Auto-generated constructor stub
	}
	public Shiki(String shikiname) {
		super();
		this.shikiname = shikiname;
	}
	
	public void addPlayer(PlayerShiki player) {
		this.playerShiki.add(player);
	}
	

	public int getShikiid() {
		return shikiid;
	}
	public void setShikiid(int shikiid) {
		this.shikiid = shikiid;
	}
	public String getShikiname() {
		return shikiname;
	}
	public void setShikiname(String shikiname) {
		this.shikiname = shikiname;
	}
	
	

	public Set<PlayerShiki> getPlayerShiki(){
		return playerShiki;
	}
	
	public void setPlayerShiki(Set<PlayerShiki> shiki) {
		this.playerShiki = shiki;
	}
	
	public void addPlayerShiki(PlayerShiki playerShiki) {
		this.playerShiki.add(playerShiki);
	}

	@Override
	public String toString() {
		return "Shiki [shikiid=" + shikiid + ", shikiname=" + shikiname + "]";
	}
	
	
	
}
