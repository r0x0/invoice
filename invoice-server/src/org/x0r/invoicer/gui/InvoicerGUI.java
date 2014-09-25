package org.x0r.invoicer.gui;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.x0r.invoicer.core.HibernateUtil;
import org.x0r.invoicer.entity.basic.Country;

public class InvoicerGUI {
	
	public static void main(String[] args) {
		
//		TODO
		System.out.println("START");
		Session s = HibernateUtil.getSessionFactory().getCurrentSession();
		s.beginTransaction();
		
		Query query = s.createQuery("from Country");
		List list = query.list();
		for(Object o : list){
			Country c = (Country)o;
			System.out.println(c.getId() + " - " + c.getSearchKey());
		}
		
		query = s.createQuery("from Person");
		list = query.list();
		for(Object o : list){
			Country c = (Country)o;
			System.out.println(c.getId() + " - " + c.getSearchKey());
		}
		
		
		HibernateUtil.shutdown();
	}

}
