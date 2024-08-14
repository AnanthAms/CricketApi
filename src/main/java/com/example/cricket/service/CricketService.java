package com.example.cricket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cricket.dao.CricketDao;
import com.example.cricket.entity.Cricketer;
import com.example.cricket.exceptions.AgeException;

@Service
public class CricketService {

	@Autowired
	CricketDao cd;
	
	public String postAll(List<Cricketer> a) {
		return cd.postAll(a);
	}
	
	public List<Cricketer> getAll(){
		return cd.getAll();
	}
	
	public List<Cricketer> findCricketer(int a) throws Exception{
		if(cd.findCricketer(a).isEmpty()) {
			throw new AgeException("No player is present in that age");
		}else {
			return cd.findCricketer(a);
		}
	}
}
