package com.matritellabs.utama.jbd;
import com.matritellabs.utama.helper.LineByLineReader;

public class Main {
    public static void main(String[] args) {

        // Setup New Game
        System.out.println("BATTLESHIP by torpedoTeam-2");
        System.out.println("---------------------------");
        System.out.println("Starting new Battleship game...\n");
        Game newGame = new Game();

        // Setup Players

        // Player 1
        System.out.println("Player 1: (Enter Name)");
        LineByLineReader playerOneNameInput = new LineByLineReader();
        String playerOneName = playerOneNameInput.readLineFromStdIn();
        newGame.setGamePlayer(1, playerOneName);

        // Player 2
        System.out.println("Player 2: (Enter Name)");
        LineByLineReader playerTwoNameInput = new LineByLineReader();
        String playerTwoName = playerTwoNameInput.readLineFromStdIn();
        newGame.setGamePlayer(2, playerTwoName);

        newGame.clearConsole();
        System.out.println(newGame);

        System.out.println("Game View:");
        Ship battleship = newGame.getPlayerOne().getShip("Battleship");
        Ship carrier = newGame.getPlayerOne().getShip("Carrier");


        newGame.getPlayerOne().placeShip(battleship, new Coordinate(5 ,5), "H");


        newGame.getPlayerOne().placeShip(carrier,new Coordinate(1 ,1), "V");
        newGame.getPlayerOne().getPlayerTable().printTable();

        System.out.println(newGame.getPlayerOne().getShip("Battleship"));






    }
}
