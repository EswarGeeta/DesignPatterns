package org.handson.designpatterns.FactoryMethod;

import java.io.IOException;

public class Client {

    public static void main(String[] args) {
        GraphRepresentationFactory factory1 = new AdjacencyMatrixFactory();
        GraphRepresentationFactory factory2 = new AdjacencyListFactory();
        GraphRepresentation graph1 = null, graph2 = null;
        try {
            graph1 = factory1.getGraphRepresentation("src/main/java/org/handson/designpatterns/FactoryMethod/GraphInput");
        } catch (IOException e) {
            e.printStackTrace();
        }
        graph1.printGraph();

        try {
            graph2 = factory2.getGraphRepresentation("src/main/java/org/handson/designpatterns/FactoryMethod/GraphInput");
        } catch (IOException e) {
            e.printStackTrace();
        }
        graph2.printGraph();

    }
}
