package com.suraj.learning.neo;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Relationship;
import org.neo4j.graphdb.RelationshipType;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;

import java.io.File;


public class NeoController {

    public static String playWithNeo() {
        StringBuilder aa = new StringBuilder();
        try {
            GraphDatabaseFactory graphDbFactory = new GraphDatabaseFactory();
            GraphDatabaseService graphDb = graphDbFactory.newEmbeddedDatabase(
                    new File("data/cars"));

            graphDb.beginTx();
            Node car1 = graphDb.createNode(Label.label("Car1"));
            car1.setProperty("make", "tesla");
            car1.setProperty("model", "model3");

            Node car2 = graphDb.createNode(Label.label("Car2"));
            car2.setProperty("make", "Benz");
            car2.setProperty("model", "hit");

            Node owner = graphDb.createNode(Label.label("Person"));
            owner.setProperty("firstName", "test");
            owner.setProperty("lastName", "test2");

            owner.createRelationshipTo(car1, RelationshipType.withName("owner"));
            owner.createRelationshipTo(car2, RelationshipType.withName("owner"));
            owner.getRelationships().forEach(i -> System.out.println(i.getId()));
            for (Relationship relationship : owner.getRelationships()) {
                aa.append(relationship.getEndNode().getRelationshipTypes().toString());
            }
            System.out.println("Done.....");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return aa.toString();
    }
}
