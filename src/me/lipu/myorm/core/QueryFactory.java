package me.lipu.myorm.core;

public class QueryFactory {
	public static Query createQuery(){
		if (DBManager.getConf().getUsingDB().equalsIgnoreCase("mysql")){
			return new MySqlQuery();
		}
		return null;
	}
}
