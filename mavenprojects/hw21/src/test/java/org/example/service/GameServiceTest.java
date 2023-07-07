package org.example.service;

import org.example.dto.GameData;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class GameServiceTest {

    static private GameService gameService;

    @BeforeAll
    static void beforeAll() {
        gameService = new GameService();
    }

    @ParameterizedTest
    @MethodSource
    void checkWinnerRPS(String playerSign, String computerSign, String expectation) {
        assertEquals(expectation, gameService.checkWinner(playerSign, computerSign, GameData.RPS_DATA));
    }

    static Stream<Arguments> checkWinnerRPS() {
        return Stream.of(
                Arguments.of("scissors", "scissors", "0"),
                Arguments.of("rock", "scissors", "1"),
                Arguments.of("rock", "paper", "2"),
                Arguments.of("scissors", "paper", "1")
        );
    }

    @ParameterizedTest
    @MethodSource({"checkWinnerRPS", "checkWinnerRPSLS"})
    void checkWinnerRPSLS(String playerSign, String computerSign, String expectation) {
        assertEquals(expectation, gameService.checkWinner(playerSign, computerSign, GameData.RPSLS_DATA));
    }

    static Stream<Arguments> checkWinnerRPSLS() {
        return Stream.of(
                Arguments.of("Spock", "lizard", "2"),
                Arguments.of("Spock", "rock", "1"),
                Arguments.of("Spock", "paper", "2"),
                Arguments.of("Spock", "scissors", "1"),
                Arguments.of("rock", "lizard", "1"),
                Arguments.of("paper", "lizard", "2"),
                Arguments.of("scissors", "lizard", "1")
        );
    }


    @Test
    void getSignByCode() {
        assertEquals("scissors", gameService.getSignByCode("s", GameData.RPS_DATA));
        assertEquals("rock", gameService.getSignByCode("r", GameData.RPS_DATA));
        assertEquals("Spock", gameService.getSignByCode("sp", GameData.RPSLS_DATA));
    }

    @RepeatedTest(5)
    void getRandomItem() {
        assertTrue(List.of(GameData.RPS_DATA[0]).contains(gameService.getRandomItem(List.of(GameData.RPS_DATA[0]))));
    }

    @Test
    void getCodeHint() {
        List<String> signs = List.of("January", "February", "March");
        List<String> signCodes = List.of("Jan", "Feb", "Mar");
        assertEquals("Jan-January, Feb-February, Mar-March", gameService.getCodeHint(signs, signCodes));
    }
}