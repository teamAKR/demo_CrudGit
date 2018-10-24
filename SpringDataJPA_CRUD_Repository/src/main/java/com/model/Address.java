package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

//@Entity
@Embeddable
public class Address
{
	//@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	//private int id;
	private String cityname,areaname;
	
	//@OneToOne(cascade=CascadeType.ALL,mappedBy="addr")
/*	private Student stud;*/

/*	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}*/

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	public String getAreaname() {
		return areaname;
	}

	public void setAreaname(String areaname) {
		this.areaname = areaname;
	}

	/*public Student getStud() {
		return stud;
	}

	public void setStud(Student stud) {
		this.stud = stud;
	}
	*/

}
