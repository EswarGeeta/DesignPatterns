package org.handson.designpatterns.creational.FactoryMethod.factories;

import org.handson.designpatterns.creational.FactoryMethod.models.AdjacencyMatrix;
import org.handson.designpatterns.creational.FactoryMethod.models.GraphRepresentation;

import java.io.IOException;

public class AdjacencyMatrixFactory extends GraphRepresentationFactory {
    @Override
    public GraphRepresentation createGraphRepresentation(String filePath) throws IOException {
        return new AdjacencyMatrix(filePath);
    }
}
