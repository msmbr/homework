package org.example;

import org.example.dto.GameData;
import org.example.dto.GameSession;
import org.example.dto.Player;
import org.example.service.GameService;
import org.example.service.Validator;

import java.util.List;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        GameService gameService = new GameService();
        Scanner scanner = new Scanner(System.in);

        GameData gameData = new GameData();
        GameSession gameSession = new GameSession();

        System.out.print("Enter your name: ");
        Player player1 = new Player(scanner.nextLine());
        Player player2 = new Player("Computer");

        String gameCode;
        List<String> signs, signCodes;
        do {
            //choose game and get corresponding data
            System.out.print("Choose a game: \n\tRock-Paper-Scissors - 1 \n\tRock-Paper-Scissor-Lizard-Spock - 2\n: ");
            while (!gameData.getGames().containsKey(gameCode = scanner.nextLine())) {
                System.out.print("Incorrect code, try again: ");
            }
            signs = List.of(gameData.getGames().get(gameCode)[0]);
            signCodes = List.of(gameData.getGames().get(gameCode)[1]);
            String printAddition = gameService.getCodeHint(signs, signCodes);

            //determine the max number of games
            System.out.print("Specify how many time we will play [more then 0]: ");
            String gameMaxNumS;
            while (!Validator.isGameMaxNumberCorrect(gameMaxNumS = scanner.nextLine())) {
                System.out.print("Incorrect input, try again: ");
            }
            gameSession.setMaxNumberOfGames(Integer.parseInt(gameMaxNumS));

            //play game session
            System.out.println("-".repeat(70));
            while (gameSession.getGameNum() <= gameSession.getMaxNumberOfGames()) {

                //get signs
                System.out.printf("%s, print your sign(%s): ", player1.getName(), printAddition);
                String playerSign;
                while (!signCodes.contains(playerSign = scanner.nextLine())) {
                    System.out.print("Incorrect input, try again: ");
                }
                player1.setSign(gameService.getSignByCode(playerSign, gameData.getGames().get(gameCode)));
                player2.setSign(gameService.getRandomItem(signs));

                //checkWinner
                String winner = gameService.checkWinner(player1.getSign(), player2.getSign(), gameData.getGames().get(gameCode));
                switch (winner) {
                    case "1" -> player1.incrementWins();
                    case "2" -> player2.incrementWins();
                }

                gameService.printResult(winner, player1, player2);
                gameService.printScoreBoard(player1, player2, gameSession);

                gameSession.incrementGames();

                //Continue?
                if(gameSession.getGameNum() <= gameSession.getMaxNumberOfGames()) {
                    System.out.print("Continue? [Y/n]: ");
                    if(scanner.nextLine().equalsIgnoreCase("n")) break;
                }
            }
            System.out.println("-".repeat(70));

            gameService.resetResult(player1, player2, gameSession);

            System.out.print("Play again?[Y/n]: ");
        } while (!scanner.nextLine().equalsIgnoreCase("n"));
    }
}