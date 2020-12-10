//package model;
//
//import javax.persistence.*;
//import java.util.Set;
//
//
//public class Sensor {
//
//	@Id
//	private Long sensorID;
//	
//	private String name;
//	
//	@OneToMany(mappedBy="sensor")
//    private Set<Measurment> measurments;
//	
//	@ManyToOne(mappedBy="sensor")
//    private District district;
//	
//	public Sensor(String name) {
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