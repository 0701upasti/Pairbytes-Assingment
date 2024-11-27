package com.Upasti.SpringBoot.MVC.Controller;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Upasti.SpringBoot.MVC.Model.Employee;

import org.hibernate.Session;

@Controller
public class StudentController {
	
	@Autowired  
	SessionFactory sf;
	
	@RequestMapping("myHome")
	private String home() {
		return "home";
	}
	
	@RequestMapping("createAccount")
	private String save() {
		return "save";
	}
	

	@PostMapping("/save")
	private String saveDataBase(Employee employee) {
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		s.save(employee
				);
		t.commit();
		return "viewemployee";
	}
	
	@RequestMapping("updatepage")
	private String updatepage() {
		return "update";
	}
	
	@RequestMapping("/update")
	private String updateDataBase(Employee employee) {
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		s.update(employee);
		t.commit();
		return "viewemployee";
	} 
	
	@RequestMapping("deletepage")
	private String deletepage() {
		return "delete";
	}
	
	@RequestMapping("/delete")
	private String deleteDataBase(Employee employee) {
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Employee ss=s.get(Employee.class, employee.getId());
		s.delete(ss);
		t.commit();
		return "viewemployee";
	}
	 
	@RequestMapping("viewtable")
	public String name() {
		return "viewemployee";
	}

}
 