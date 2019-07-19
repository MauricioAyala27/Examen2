package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Marca;

import app.HibernateUtil;

public class DaoMarca {
	
	public void guardarMarca(Marca marc) {
		
		Transaction transaction = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			
			transaction = session.beginTransaction();
			session.save(marc);
			transaction.commit();
		}catch(Exception e) {
			
			if(transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
	
	public List<Marca> listarMarca(){
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
				return session.createQuery("from Marca",Marca.class).list();
		}
	}
	
	

}
