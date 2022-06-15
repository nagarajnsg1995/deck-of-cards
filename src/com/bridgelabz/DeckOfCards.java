package com.bridgelabz;
import java.util.Random;

public class DeckOfCards {
    int[][] cards = new int[4][13];

    public void distributeOneCard(int player) {
        Random random = new Random();

        int suit = random.nextInt(4);
        int rank = random.nextInt(13);


        if (cards[suit][rank] != 0) {
            distributeOneCard(player);
        } else {
            cards[suit][rank] = player;
        }
    }

    //   distributing cards

    public void distributeCards(int player) {
        for (int i = 0; i < 9; i++) {
            distributeOneCard(player);
        }
    }
    public void display(int player) {
        for (int suit = 0; suit < 4; suit++) {
            for (int rank = 0; rank < 13; rank++) {
                if ( player==cards[suit][rank]) {
                    System.out.print(getSuit(suit) + " " + getRank(rank) + "\t");
                }
            }
        }
        System.out.println("\n");
    }


    // method for rank
    String getRank(int rankNumber) {
        switch (rankNumber) {
            case 1:
                return "2";
            case 2:
                return "3";
            case 3:
                return "4";
            case 4:
                return "5";
            case 5:
                return "6";
            case 6:
                return "7";
            case 7:
                return "8";
            case 8:
                return "9";
            case 9:
                return "10";
            case 10:
                return "Jack";
            case 11:
                return "Queen";
            case 12:
                return "King";
            case 13:
                return "Ace";
            default:
                return "";
        }
    }

    // method to get the suits
    String getSuit(int suitNumber) {
        switch (suitNumber) {
            case 1:
                return "Clubs";
            case 2:
                return "Diamonds";
            case 3:
                return "Hearts";
            case 4:
                return "Spades";
            default:
                return "";
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Deck of Cards Game");
        DeckOfCards deckOfCards = new DeckOfCards();

        for (int player = 1; player <= 4; player++) {
            deckOfCards.distributeCards(player);
            System.out.println("Player " + player + " cards :");
            deckOfCards.display(player);

        }
    }
}



