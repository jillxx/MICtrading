package com.micweb.MIC.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.micweb.MIC.model.PlayerShiki;
import com.micweb.MIC.model.PlayerShikiId;

public interface PlayerShikiRepo extends JpaRepository<PlayerShiki, PlayerShikiId> {
	
}
