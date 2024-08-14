package com.example.cricket.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.cricket.entity.Cricketer;

public interface CricketRepository extends JpaRepository <Cricketer,Integer> {

	@Query(value="select * from cricketers where age < ?",nativeQuery=true)
	public List<Cricketer> findCricketer(int a);
}
