package Day4PP;

import java.util.Random;

public class SnakeAndLadder {

    static final int NO_PLAY = 0;
    static final int LADDER = 1;
    static final int SNAKE = 2;

    static final int WINNING_POSITION = 100;

    public static void main(String[] args) {

        System.out.println("Welcome to Snake and Ladder Game");

        int player1Pos = 0;
        int player2Pos = 0;

        int diceCount = 0;

        Random random = new Random();

        boolean isPlayer1Turn = true;

        while (player1Pos < WINNING_POSITION && player2Pos < WINNING_POSITION) {

            int dice = random.nextInt(6) + 1; // UC1
            int option = random.nextInt(3);   // UC2

            diceCount++;

            if (isPlayer1Turn) {
                player1Pos = playTurn(player1Pos, dice, option);
                System.out.println("Player 1 -> Dice: " + dice + " Position: " + player1Pos);

                if (option != LADDER) {
                    isPlayer1Turn = false;
                }

            } else {
                player2Pos = playTurn(player2Pos, dice, option);
                System.out.println("Player 2 -> Dice: " + dice + " Position: " + player2Pos);

                if (option != LADDER) {
                    isPlayer1Turn = true;
                }
            }
        }

        System.out.println("\nTotal Dice Rolls: " + diceCount);

        if (player1Pos == WINNING_POSITION) {
            System.out.println("Player 1 Wins!");
        } else {
            System.out.println("Player 2 Wins!");
        }
    }

    // Game Logic Method
    public static int playTurn(int position, int dice, int option) {

        switch (option) {

            case LADDER:
                position += dice;
                break;

            case SNAKE:
                position -= dice;
                break;

            case NO_PLAY:
                break;
        }

        // UC4: If position < 0 → reset to 0
        if (position < 0) {
            position = 0;
        }

        // UC5: Exact 100 condition
        if (position > WINNING_POSITION) {
            position -= dice; // revert move
        }

        return position;
    }
}