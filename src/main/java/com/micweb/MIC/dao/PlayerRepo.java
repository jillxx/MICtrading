package com.micweb.MIC.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.micweb.MIC.model.Player;

public interface PlayerRepo extends JpaRepository<Player,Integer> {

}
