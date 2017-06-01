package com.checklist.services;

import org.springframework.stereotype.Service;

import com.checklist.pojo.Checklist;
import java.util.ArrayList;
import java.util.List;
 
import org.bson.Document;
 
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

@Service
public class ChecklistService {
    
    
    public String getdetails(){
        
        @SuppressWarnings("resource")
        MongoClient client = new MongoClient("localhost", 27017);
        MongoDatabase database = client.getDatabase("checklist");
        MongoCollection<Document> collection = database.getCollection("detailList");
 
        List<Document> documents = (List<Document>) collection.find().into(
                new ArrayList<Document>());
 
               for(Document document : documents){
                   return document.toJson();
               }
               return null;
    }
        
    }
    
    
