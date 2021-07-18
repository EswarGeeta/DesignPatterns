package org.handson.designpatterns.FactoryMethod;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class AdjacencyMatrix extends GraphRepresentation {

    private int[][] adjMatrix;

    public AdjacencyMatrix(String filePath) throws IOException {
        /*
        I know it is not a perfect way to instantiate graph.
        Bare with me for now as the goal here is to showcase Factory method pattern.
         */
        Path file = Path.of(filePath);
        String graphString = Files.readString(file);

        Set<Character> vertices = new HashSet<>();
        for(String edge: graphString.split("\n") ) {
            vertices.add(edge.charAt(0));
            vertices.add(edge.charAt(3));
        }

        adjMatrix = new int[vertices.size()][vertices.size()];
        for(String edge: graphString.split("\n") ) {
            adjMatrix[Character.getNumericValue(edge.charAt(0))][Character.getNumericValue(edge.charAt(3))] = 1;
        }
    }

    @Override
    public void printGraph() {
        System.out.println("Adjacency matrix representation of Graph: ");
        for (int[] matrix : adjMatrix) {
            for (int i : matrix) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try {
            AdjacencyMatrix representation =
                    new AdjacencyMatrix("src/main/java/org/handson/designpatterns/FactoryMethod/GraphInput");
            representation.printGraph();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
