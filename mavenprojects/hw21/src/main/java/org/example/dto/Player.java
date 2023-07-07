package org.example.dto;

import lombok.Data;

@Data
public class Player {
    private String name;
    private int wins;
    private String sign;

    public Player(String name) {
        this.name = name;
    }

    public void incrementWins() {
        ++wins;
    }
}
