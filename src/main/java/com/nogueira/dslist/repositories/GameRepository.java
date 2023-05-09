package com.nogueira.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nogueira.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
