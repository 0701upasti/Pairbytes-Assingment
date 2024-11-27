package com.Upasti.SpringBoot.MVC.Model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	
	@Id
	private String id;
	private String name;
	private String department;
	private String email;
	private String mobile;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return department;
	}
	public void setAge(String department) {
		this.department = department;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String id, String name, String age, String email, String mobile) {
		super();
		this.id = id;
		this.name = name;
		this.department = age;
		this.email = email;
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + department + ", email=" + email + ", mobile=" + mobile
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(department, email, id, mobile, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(department, other.department) && Objects.equals(email, other.email) && Objects.equals(id, other.id)
				&& Objects.equals(mobile, other.mobile) && Objects.equals(name, other.name);
	}
	
	
	
	

}
