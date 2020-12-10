package com.example.co2emission.model;
//package model;
//
//import java.util.Set;
//
//
//public class District {
//
//	@Id
//	private Long districtID;
//	
//	private String name;
//	
//	@OneToMany(mappedBy="sensor")
//    private Set<Measurment> measurments;
//	
//	@ManyToOne(mappedBy="sensor")
//    private District district;
//	
//	public District(String name) {
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