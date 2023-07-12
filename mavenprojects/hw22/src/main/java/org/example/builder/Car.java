package org.example.builder;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {
    private String type;
    private int seats;
    private String engine;
    private boolean pgsNavigator;

}
