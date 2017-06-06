package com.checklist.services;

import org.springframework.stereotype.Service;

import com.checklist.pojo.Checklist;
import java.util.ArrayList;
import java.util.List;
 
import org.bson.Document;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

@Service
public class ChecklistService {
    
    
    public String getdetails(){
        
        //@SuppressWarnings("resource")
        //MongoClient client = new MongoClient("ds163721.mlab.com",63721,"a","a");
        List<MongoCredential> credentialsList = new ArrayList<MongoCredential>();
        char[] password = new char[] {'m', 'l', 'a', 'b', '@', '6', '4', '1', '9'};
        MongoCredential a=MongoCredential.createCredential("rpandey21", "ops-checklist", password);
        credentialsList.add(a);
        ServerAddress addr=new ServerAddress("ds163721.mlab.com",63721);
        MongoClient client = new MongoClient(addr, credentialsList);
        MongoDatabase database = client.getDatabase("ops-checklist");
        //Mongo mongo = new Mongo("ds163721.mlab.com",63721);
        //DB db = mongo.getDB("ops-checklist");

        //char[] password = new char[] {'s', 'e', 'c', 'r', 'e', 't'};
        //boolean authenticated = database
        MongoCollection<Document> collection = database.getCollection("detailList");
 
        List<Document> documents = (List<Document>) collection.find().into(
                new ArrayList<Document>());
 
               for(Document document : documents){
                   return document.toJson();
               }
               return null;
    }
        
    }
    
    
