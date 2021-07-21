package com.suraj.learninggraphdatabase.neo;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Relationship;
import org.neo4j.graphdb.RelationshipType;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

@RestController
public class NeoController {
    @GetMapping("/")
    public String home() {
        String abc = playWithNeo();
        return abc;
    }

    private String playWithNeo() {
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
        } catch (Exception e) {
            e.printStackTrace();
        }
        return aa.toString();
    }
}
