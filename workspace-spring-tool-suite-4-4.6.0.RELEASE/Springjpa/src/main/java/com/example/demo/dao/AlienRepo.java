package com.example.demo.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Alien;

import antlr.collections.List;

public interface AlienRepo extends JpaRepository<Alien,Integer> {
	ArrayList<Alien> findByTech(String tech);
	ArrayList<Alien> findByAidGreaterThan(int aid);
	
	@Query("from Alien where tech=?1 order by aname")
	ArrayList<Alien> findByTechSorted(String tech);

}
