package org.example.factory.creators;

import org.example.factory.products.Furniture;
import org.example.factory.products.ComputerChair;

public class ComputerChairCreator extends ChairCreator {
    @Override
    Furniture createFurniture() {
        return new ComputerChair("black", "plastic", 5);
    }
}
