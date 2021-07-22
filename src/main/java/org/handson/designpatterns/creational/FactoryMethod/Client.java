package org.handson.designpatterns.creational.FactoryMethod;

import org.handson.designpatterns.creational.FactoryMethod.factories.AdjacencyListFactory;
import org.handson.designpatterns.creational.FactoryMethod.factories.AdjacencyMatrixFactory;
import org.handson.designpatterns.creational.FactoryMethod.factories.GraphRepresentationFactory;
import org.handson.designpatterns.creational.FactoryMethod.models.GraphRepresentation;

import java.io.IOException;

public class Client {

    public static void printGraphRepresentation(GraphRepresentationFactory factory) {
        GraphRepresentation graph = null;
        try {
            graph = factory.getGraphRepresentation("src/main/java/org/handson/designpatterns/FactoryMethod/GraphInput");
        } catch (IOException e) {
            e.printStackTrace();
        }
        graph.printGraph();
    }

    public static void main(String[] args) {
        /*
        Here just by passing different concrete Factory classes, we can create different objects.
        */
        GraphRepresentationFactory factory = new AdjacencyMatrixFactory();
        printGraphRepresentation(new AdjacencyListFactory());
        printGraphRepresentation(new AdjacencyMatrixFactory());
    }
}
