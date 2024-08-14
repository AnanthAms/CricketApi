package com.example.cricket.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.cricket.entity.Cricketer;
import com.example.cricket.service.CricketService;


@RestController
public class CricketController {

	static Logger log=Logger.getLogger(CricketController.class);
	@Autowired
	CricketService cs;
	
	@PostMapping(value="/postCricketer")
	public String postAll(@RequestBody List<Cricketer> a) {
		PropertyConfigurator.configure("Cricket.properties");
		log.info(cs.postAll(a));
		return cs.postAll(a);
	}
	
	@GetMapping(value="/getCricketers")
	public List<Cricketer> getAll(){
		PropertyConfigurator.configure("Cricket.properties");
		log.info(cs.getAll());
		return cs.getAll();
	}
	
	@GetMapping(value="/getPlayer/{a}")
	public List<Cricketer> findCricketer(@PathVariable int a) throws Exception{
		return cs.findCricketer(a);
	}
}
