package com.micweb.MIC.dao;

import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.micweb.MIC.model.Player;
import com.micweb.MIC.model.PlayerShiki;



@Repository
@Transactional
public class PlayerShikiDao {
	
	@PersistenceContext
	EntityManager em;
	
	public PlayerShiki addPlayShiki(PlayerShiki ps) {
		return em.merge(ps);
	}
	
	public List<PlayerShiki> listPlayerShiki() {
	
			Query query = em.createQuery("SELECT p.primaryKey.player.name,p.primaryKey.shiki.shikiname,p.shardnum FROM PlayerShiki p");
			
			return query.getResultList();
		}
	
	
}
