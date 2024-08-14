package com.example.cricket.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.cricket.entity.Cricketer;
import com.example.cricket.repository.CricketRepository;

@Repository
public class CricketDao {

	@Autowired
	CricketRepository cr;
	
	public String postAll(List<Cricketer> a) {
		cr.saveAll(a);
		return "posted successfully";
	}
	
	public List<Cricketer> getAll(){
		return cr.findAll();
	}

	public List<Cricketer> findCricketer(int a) throws Exception {
		return cr.findCricketer(a);
	}
}
