package me.lipu.po;

import java.sql.*;
import java.util.*;

public class Target {

	private String name;
	private Integer property;
	private Integer id;


	public String getName(){
		return name;
	}
	public Integer getProperty(){
		return property;
	}
	public Integer getId(){
		return id;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setProperty(Integer property){
		this.property=property;
	}
	public void setId(Integer id){
		this.id=id;
	}
}
