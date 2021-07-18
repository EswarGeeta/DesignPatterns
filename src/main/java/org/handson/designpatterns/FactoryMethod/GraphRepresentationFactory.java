package org.handson.designpatterns.FactoryMethod;

import java.io.IOException;

public abstract class GraphRepresentationFactory {
    public GraphRepresentation getGraphRepresentation(String filePath) throws IOException {
        return createGraphRepresentation(filePath);
    }

    public abstract GraphRepresentation createGraphRepresentation(String filePath) throws IOException;

}
