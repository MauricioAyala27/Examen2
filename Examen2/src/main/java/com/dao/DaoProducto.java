package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Catalogo;
import com.entity.Producto;

import app.HibernateUtil;

public class DaoProducto {
	
	public void guardarProducto(Producto pro) {
		
		Transaction transaction = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			
			transaction = session.beginTransaction();
			session.save(pro);
			transaction.commit();
		}catch(Exception e) {
			
			if(transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		
	}
	
	public void eliminarProducto(int id) {
		Transaction transaction = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		transaction = session.beginTransaction();
		Producto p = (Producto) session.load(Producto.class,new Integer(id));
		if(null !=p) {
			session.delete(p);
			transaction.commit();
		
		}
//		Transaction transaction = null;
//		try(Session session = HibernateUtil.getSessionFactory().getCurrentSession()){
//			
//			transaction = session.beginTransaction();
//			session.update(id);
//			transaction.commit();
//		}catch(Exception e) {
//			
//			if(transaction != null) {
//				transaction.rollback();
//			}
//			e.printStackTrace();
//		}
		
	}
	
	public void actualizarProducto(Producto pro) {
		Transaction transaction = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		transaction = session.beginTransaction();
			session.update(pro);
			transaction.commit();
		
	}
	
	public List<Producto> listarProducto(){
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			
			return session.createQuery("from Producto",Producto.class).list();
		}
	}
	
	public List<Catalogo> listarCatalogo(){
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			
			return session.createQuery("from Catalogo",Catalogo.class).list();
		}
	}
	
	
}
