package com.micweb.MIC.model;

import java.beans.Transient;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "player_shiki")
@AssociationOverrides({
	@AssociationOverride(name = "primaryKey.player",
			joinColumns = @JoinColumn(name = "playerid")),
	@AssociationOverride(name = "primaryKey.shiki",
			joinColumns = @JoinColumn(name = "shikiid"))
})
public class PlayerShiki {
	//composite-id key
	@EmbeddedId
	private PlayerShikiId primaryKey = new PlayerShikiId();
	//additional fields
	private int shardnum;
	private boolean wanted;
	

	public PlayerShikiId getPrimaryKey() {
		System.out.println(primaryKey);
		return primaryKey;
	}
	
	public void setPrimaryKey(PlayerShikiId primaryKey) {
		this.primaryKey = primaryKey;
	}

	@Transient
	public Player getPlayer() {
		return getPrimaryKey().getPlayer();
	}
	
	public void setPlayer(Player player) {
		getPrimaryKey().setPlayer(player);
	}
	
	@Transient
	public Shiki getShiki(){
		return getPrimaryKey().getShiki();
	}
	
	public void setShiki(Shiki shiki) {
		getPrimaryKey().setShiki(shiki);
	}
	
	
	public int getShardnum() {
		return shardnum;
	}

	public void setShardnum(int shardnum) {
		this.shardnum = shardnum;
	}

	public boolean isWanted() {
		return wanted;
	}

	public void setWanted(boolean wanted) {
		this.wanted = wanted;
	}

	
	
	@Override
	public String toString() {
		return "PlayerShiki [primaryKey=" + primaryKey + ", shardnum=" + shardnum + ", wanted=" + wanted + "]";
	}
	
	
		
}
