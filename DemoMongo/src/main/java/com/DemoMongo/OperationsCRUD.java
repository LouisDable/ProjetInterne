package com.DemoMongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class OperationsCRUD {

	private MongoClient conxMongo;
	private MongoDatabase db;
	private int port;
	private String adr;
	private String nomDb;
	
	public OperationsCRUD(String adresse, String name) {
		conxMongo = null;
		db = null;
		port = 27017;
		adr = adresse;
		nomDb = name;
	}
	
	// Connexion à la base de données
	private void connexion(){
		try{
			conxMongo = new MongoClient(adr,port);
			db = conxMongo.getDatabase(nomDb);
			System.out.println("---  Connexion Successfull ---");
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	// Creation d'une collection
	public boolean createCollection( String nomCol ){	
		try{
			
			connexion();
			db.createCollection(nomCol);
			System.out.println("Creation Collection "+nomCol+" Successfull");
			return true;
		}catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}
	
	
}
