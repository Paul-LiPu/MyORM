package me.lipu.test;

import me.lipu.myorm.core.Query;
import me.lipu.myorm.core.QueryFactory;
import me.lipu.po.Target;

public class testMyORM {

	public static void main(String[] args) {
//		try {
//			Class.forName("me.lipu.myorm.core.TableContext");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		Target e = new Target();
		e.setId(1);
		e.setName("lipu");
		e.setProperty(1000);
		
		Query q  = QueryFactory.createQuery();
		Target f = (Target)q.queryByPriKey(e.getClass(), new Integer(1));
		System.out.println(f);
//		q.queryUniqueRow("", clazz, params);
	}
	
	

}
