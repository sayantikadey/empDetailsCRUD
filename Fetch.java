package com.drv;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.enty.Address;
import com.enty.Department;
import com.enty.Employee;

public class Fetch 
{

    public static void main(String[] args) 
    {
       
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("tika");       
        EntityManager em = emf.createEntityManager();
        
        Employee e1 = em.find(Employee.class, 101);
        
        if (e1 != null) 
        {
            // Fetch associated department and address
            Department dept = e1.getDepartment();
            Address addr = e1.getAddress();
            
            // Print employee details
            System.out.println("Employee ID: " + e1.getId());
            System.out.println("Employee Name: " + e1.getName());
            System.out.println("Employee Age: " + e1.getAge());
            System.out.println("Employee Email: " + e1.getEmail());
            System.out.println("Employee Salary: " + e1.getSalary());
            
            // Print department details if available
            if (dept != null) 
            {
                System.out.println("Department Name: " + dept.getDname());
            } 
            // Print address details if available
            if (addr != null) 
            {
                System.out.println("Address: " + addr.getAddress());
            } 
        } 

        
    }
}

