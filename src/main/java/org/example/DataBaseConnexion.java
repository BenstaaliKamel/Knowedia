package org.example;

import com.mongodb.client.*;
import org.bson.Document;

import static com.mongodb.client.model.Filters.eq;

public class DataBaseConnexion {
    public void data_base_connexion() {
        System.out.println("Hello world!");
        // Connection string for MongoDB (change as needed for your MongoDB instance)
        String connectionString = "mongodb://localhost:27017";

        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            // Connect to the MongoDB database
            MongoDatabase database = mongoClient.getDatabase("bookstore"); // Replace "myDatabase" with your database name

            // Do something with the database, e.g., list all collection names
            for (String name : database.listCollectionNames()) {
                System.out.println(name);
            }
            // Get the collection
            MongoCollection<Document> collection = database.getCollection("books");
            FindIterable<Document> documents = collection.find();
            // For example, deleting a document where the "fieldName" has value "desiredValue"
            collection.deleteOne(eq("title", "The Call of the Weird"));
            // Iterate over the documents and display them
            MongoCursor<Document> cursor = documents.iterator();
            while (cursor.hasNext()) {
                Document document = cursor.next();
                System.out.println(document.toJson());
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        System.out.println("******************************");
        System.out.println("Connection with Atlas Cluster");
        String atlas_connectionString = "mongodb+srv://kamelbenstaali:Benben98!@knowediacluster.qsgfpqh.mongodb.net/";
        try (MongoClient mongoClient = MongoClients.create(atlas_connectionString)) {
            // Get the list of database names
            MongoIterable<String> databaseNames = mongoClient.listDatabaseNames();
            // Display all available database names
            for (String dbName : databaseNames) {
                System.out.println(dbName);
            }

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
