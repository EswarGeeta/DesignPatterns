package org.handson.designpatterns.FactoryMethod;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdjacencyList extends GraphRepresentation {

    private Map<Character, List<Character>> adjList;

    public AdjacencyList(String filePath) throws IOException {
        /*
        I know it is not a perfect way to instantiate graph.
        Bare with me for now as the goal here is to showcase Factory method pattern.
         */
        Path file = Path.of(filePath);
        String graphString = Files.readString(file);
        adjList = new HashMap<Character, List<Character>>();
        for(String edge: graphString.split("\n") ) {
            String[] vertices = edge.split("->");
            List<Character> verticesList = adjList.get(edge.charAt(0));
            if(verticesList == null)
                verticesList = new ArrayList<>();
            verticesList.add(edge.charAt(3));
            adjList.put(edge.charAt(0), verticesList);
        }
    }

    @Override
    public void printGraph() {
        System.out.println("Adjacency List representation of Graph: ");
        System.out.println(adjList);
    }
}
