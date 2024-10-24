package com.drv;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.enty.Address;
import com.enty.Department;
import com.enty.Employee;

public class Drive
{

	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("tika");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		
		Employee e1 = new Employee();
		e1.setId(302);
		e1.setName("Jaya");
		e1.setAge(26);
		e1.setEmail("jaya@gmail.com");
		e1.setSalary(32000);
		
		Employee e2 = new Employee();
		e2.setId(303);
		e2.setName("Ratna");
		e2.setAge(28);
		e2.setEmail("ratna@gmail.com");
		e2.setSalary(35490);
		
		//To add new Dept
		//Department dept = new Department();
		//dept.setDid(3);
		//dept.setDname("Debug");
		
		//To add for existing Dept
		Department dept = em.find(Department.class, 3);
		
		Address a1 = new Address();
		a1.setHno(96);
		a1.setAddress("JayaNagar");
		
		Address a2 = new Address();
		a2.setHno(18);
		a2.setAddress("Silk Board");
		
		
		e2.setDepartment(dept);
		e2.setAddress(a1);
		
		e1.setDepartment(dept);
		e2.setAddress(a2);

		et.begin();
		em.persist(e1);
		em.persist(e2);
		em.persist(a1);
		em.persist(a2);
		em.persist(dept);
		et.commit();
	}

}
