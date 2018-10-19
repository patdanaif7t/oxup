/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ox_project;

import com.mongodb.*;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author firstx
 */
public class Database {
    
    private static MongoClientURI uri;
    private static MongoClient client;
    private static MongoDatabase db;
    private static MongoCollection<Document> collection;

    
    public static MongoDatabase getDB(){
        uri  = new MongoClientURI("mongodb://admin:abc123456@ds237922.mlab.com:37922/ox_59160117");
        client = new MongoClient(uri);
        db = client.getDatabase(uri.getDatabase());
        return db;
    }
    
    public static MongoCollection<Document> getCollection(String col) {
        MongoDatabase db = getDB();
        collection = db.getCollection(col);
        return collection;
    }
    
    public static FindIterable<Document> findAll(MongoCollection<Document> col) {
        return collection.find();
    }
    
//    public static Document select(String field, String find) {
//        Document query = new Document();
//        query.append(field, find);
//        return collection.find(query);
//    }
    
    public static void main(String[] args) {
        MongoCollection<Document> col = getCollection("Lobby");
        FindIterable<Document> docs = findAll(col);
        for(Document doc : docs){
            System.out.println(doc.toJson());
        }
//        Document ddd = select("ID","1");
    }
}
