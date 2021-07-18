package org.handson.designpatterns.FactoryMethod.factories;

import org.handson.designpatterns.FactoryMethod.models.GraphRepresentation;

import java.io.IOException;

public abstract class GraphRepresentationFactory {
    public GraphRepresentation getGraphRepresentation(String filePath) throws IOException {
        return createGraphRepresentation(filePath);
    }

    public abstract GraphRepresentation createGraphRepresentation(String filePath) throws IOException;

}
