package org.handson.designpatterns.FactoryMethod.factories;

import org.handson.designpatterns.FactoryMethod.models.AdjacencyList;
import org.handson.designpatterns.FactoryMethod.models.GraphRepresentation;

import java.io.IOException;

public class AdjacencyListFactory extends GraphRepresentationFactory {
    @Override
    public GraphRepresentation createGraphRepresentation(String filePath) throws IOException {
        return new AdjacencyList(filePath);
    }
}
