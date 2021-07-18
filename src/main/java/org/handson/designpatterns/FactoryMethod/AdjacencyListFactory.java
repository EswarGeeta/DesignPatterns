package org.handson.designpatterns.FactoryMethod;

import java.io.IOException;

public class AdjacencyListFactory extends GraphRepresentationFactory {
    @Override
    public GraphRepresentation createGraphRepresentation(String filePath) throws IOException {
        return new AdjacencyList(filePath);
    }
}
