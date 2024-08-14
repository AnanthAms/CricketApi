package com.example.cricket.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cricketers")
public class Cricketer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int id;
	public String name;
	public int jerseyno;
	public int runs;
	public int age;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJerseyno() {
		return jerseyno;
	}
	public void setJerseyno(int jerseyno) {
		this.jerseyno = jerseyno;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Cricketer [id=" + id + ", name=" + name + ", jerseyno=" + jerseyno + ", runs=" + runs + ", age=" + age
				+ "]";
	}
	
	
}
