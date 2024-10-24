package com.drv;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.enty.Employee;


public class Delete 
{

	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("tika");
        EntityManager  em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Patient id to delete the data");
        int a=scn.nextInt();
        et.begin();
        Employee e1=em.find(Employee.class, a);
        if(e1!=null)
        {
        	em.remove(e1);
        }
        System.out.println("Data Deleted");
        et.commit();

	}

}
