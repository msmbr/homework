package org.example.dto;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public class GameData {

    //ROCK_PAPER_SCISSORS_MATRIX_DATA
    public static final String[][] RPS_DATA = {
            {"rock", "paper", "scissors"},
            {"r", "p", "s"},
            {"0", "2", "1"},
            {"1", "0", "2"},
            {"2", "1", "0"}
    };

    //ROCK_PAPER_SCISSORS_LIZARD_SPOCK_MATRIX_DATA
    public static final String[][] RPSLS_DATA = {
            {"rock", "paper", "scissors", "lizard", "Spock"},
            {"r", "p", "s", "l", "sp"},
            {"0", "2", "1", "1", "2"},
            {"1", "0", "2", "2", "1"},
            {"2", "1", "0", "1", "2"},
            {"2", "1", "2", "0", "1"},
            {"1", "2", "1", "2", "0"},
    };

    private final Map<String, String[][]> games;

    public GameData() {
        games = new HashMap<>();
        games.put("1", RPS_DATA);
        games.put("2", RPSLS_DATA);
    }
}
