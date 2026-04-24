
// Problem 5

package day12pp;

import java.util.Arrays;
import java.util.Random;

class Node {
    String card;
    Node next;

    Node(String card) {
        this.card = card;
    }
}

class Queue {
    Node front, rear;

    void enqueue(String card) {
        Node newNode = new Node(card);

        if (rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    void display() {
        Node temp = front;
        while (temp != null) {
            System.out.println(temp.card);
            temp = temp.next;
        }
    }
}

class Player {
    Queue cards = new Queue();
}

public class PlayerCards {

    public static void main(String[] args) {

        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"};

        String[] deck = new String[52];
        int index = 0;

        for (String suit : suits)
            for (String rank : ranks)
                deck[index++] = rank + " of " + suit;

        Random rand = new Random();

        for (int i = 0; i < 52; i++) {
            int r = rand.nextInt(52);
            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }

        Player[] players = new Player[4];

        for (int i = 0; i < 4; i++)
            players[i] = new Player();

        index = 0;

        for (int i = 0; i < 4; i++) {
            String[] hand = new String[9];

            for (int j = 0; j < 9; j++) {
                hand[j] = deck[index++];
            }

            Arrays.sort(hand);

            for (String c : hand)
                players[i].cards.enqueue(c);
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("\nPlayer " + (i + 1));
            players[i].cards.display();
        }
    }
}