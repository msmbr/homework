package org.example.factory.creators;

import org.example.factory.products.Furniture;

public abstract class ChairCreator {

    public void drawUpInstructions() {
        Furniture furniture = createFurniture();
        System.out.println(furniture.drawUpInstructions());
    }

    abstract Furniture createFurniture();
}
