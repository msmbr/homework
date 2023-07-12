package org.example.factory.creators;

import org.example.factory.products.Furniture;
import org.example.factory.products.KitchenChair;

public class KitchenChairChairCreator extends ChairCreator {
    @Override
    Furniture createFurniture() {
        return new KitchenChair("white", "wood");
    }
}
