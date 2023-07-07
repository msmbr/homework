package org.example.service;

import org.example.dto.GameSession;
import org.example.dto.Player;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GameService {

    public String getRandomItem(List<String> signs) {
        return signs.get((int) (Math.random() * signs.size()));
    }

    public String checkWinner(String playerSign, String computerSign, String[][] matrix) {
        if(playerSign.equals(computerSign)) return "0";

        int a = List.of(matrix[0]).indexOf(playerSign);
        int b = List.of(matrix[0]).indexOf(computerSign);
        return matrix[a + 2][b];
    }

    public String getSignByCode(String sign, String[][] matrix) {
        int index = List.of(matrix[1]).indexOf(sign);
        return matrix[0][index];
    }

    public void printScoreBoard(Player player1, Player player2, GameSession gameSession) {
        System.out.printf("Score: %s - %s, %s - %s, draw - %s, game - %s/%s%n",
                player1.getName(), player1.getWins(),
                player2.getName(), player2.getWins(),
                gameSession.getGameNum() - player1.getWins() - player2.getWins(),
                gameSession.getGameNum(), gameSession.getMaxNumberOfGames());
    }

    public void printResult(String winner, Player player1, Player player2) {
        System.out.println("\t" + player1.getName() + "'s sign: " + player1.getSign());
        System.out.println("\t" + player2.getName() + "'s sign: " + player2.getSign());
        switch (winner) {
            case "1" -> System.out.printf("\tResult: %s won%n", player1.getName());
            case "2" -> System.out.printf("\tResult: %s won%n", player2.getName());
            case "0" -> System.out.println("\tResult: draw");
        }
    }

    public String getCodeHint(List<String> signs, List<String> signCodes) {
        return Stream.iterate(0, n -> ++n).limit(signs.size()).map(i -> signCodes.get(i) + "-" + signs.get(i)).collect(Collectors.joining(", "));
    }

    public void resetResult(Player player1, Player player2, GameSession gameSession) {
        player1.setWins(0);
        player2.setWins(0);
        gameSession.resetData();
    }
}
