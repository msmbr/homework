package org.example.dto;

import lombok.Data;

@Data
public class GameSession {
    private int gameNum = 1;
    private int maxNumberOfGames = 1;

    public void incrementGames() {
        ++gameNum;
    }

    public void resetData() {
        setGameNum(1);
        setMaxNumberOfGames(1);
    }
}
