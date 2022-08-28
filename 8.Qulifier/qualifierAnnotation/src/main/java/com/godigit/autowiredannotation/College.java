package com.godigit.autowiredannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class College {
        private String name;
        private String location;
        @Autowired
        
        @Qualifier("cseDepartment")  // this is used because I create 2 department in bean.xml file
        private Department department;
		@Override
		public String toString() {
			return "College [name=" + name + ", location=" + location + ", department=" + department + "]";
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Department getDepartment() {
			return department;
		}
		public void setDepartment(Department department) {
			this.department = department;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		
		public College() {
			super();
			// TODO Auto-generated constructor stub
		}
		public College(String name, Department department, String location) {
			super();
			this.name = name;
			this.department = department;
			this.location = location;
		}
        
	
}
