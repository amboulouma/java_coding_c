package com.example.co2emission.model;
//package model;
//
//import java.util.Set;
//
//
//public class Measurement {
//
//	@Id
//	private Long measurmentID;
//	
//	private String name;
//	
//	@ManyToOne(mappedBy="measurement")
//  private Sensor measurements;
//	
//	public Measurement(String name) {
//		this.name = name;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	@Override
//	public String toString() {
//		return "Beer [name=" + name + "]";
//	}
//}