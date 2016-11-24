package com.DemoMongo;

public class DemoMongo {

	private static String adresse = "148.60.11.176";
	private static String nameDb = "db_PI";
	
	public static void main(String[] args) {
		OperationsCRUD op = new OperationsCRUD(adresse,nameDb);
		op.createCollection("TestCol");
	}

}