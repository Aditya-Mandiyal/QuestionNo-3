package com.godigit.autowiredannotation;

public class Department {
      private String name;
      private String hodName;
      private int noOfTeachers;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHodName() {
		return hodName;
	}
	public void setHodName(String hodName) {
		this.hodName = hodName;
	}
	@Override
	public String toString() {
		return "Department [name=" + name + ", hodName=" + hodName + ", noOfTeachers=" + noOfTeachers + "]";
	}
	public int getNoOfTeachers() {
		return noOfTeachers;
	}
	public void setNoOfTeachers(int noOfTeachers) {
		this.noOfTeachers = noOfTeachers;
	}
      
}
