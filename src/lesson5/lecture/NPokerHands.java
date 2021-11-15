package lesson5.lecture;

import java.util.Scanner;

public class NPokerHands {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        variant1(n);
//        variant2(n);
    }

    static void variant1(int n) {
        String[] deck = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};

        for (int i = 0; i < n; i++) {
            String[] resultDeck = new String[5];

            for (int j = 0; j < 5; j++) {
                String randCard;
                boolean isUnique;
                do {
                    isUnique = true;

                    int randNum = (int) (Math.random() * (deck.length - 1));
                    int randSuits = (int) (Math.random() * (suits.length - 1));
                    randCard = deck[randNum] + suits[randSuits];

                    for (String str : resultDeck) {
                        if (randCard.equals(str)) {
                            isUnique = false;
                            break;
                        }
                    }
                } while (!isUnique);
                resultDeck[j] = randCard;
            }
            for (String card : resultDeck) {
                System.out.printf("%-15s", card);
            }
            System.out.println();
        }
    }

    static void variant2(int n) {
        String[] nums = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};

        for (int num = 0; num < n; num++) {
            String[] desk = new String[52];

            int deskIndex = 0;
            for (int i = 0; i < suits.length; i++) {
                for (int j = 0; j < nums.length; j++) {
                    desk[deskIndex] = nums[j] + suits[i];
                    deskIndex++;
                }
            }

            for (int i = 0; i < 50; i++) {
                int replaceFrom = (int) (Math.random() * desk.length);
                int replaceTo = (int) (Math.random() * desk.length);

                String temp = desk[replaceTo];
                desk[replaceTo] = desk[replaceFrom];
                desk[replaceFrom] = temp;
            }

            for (int i = 0; i < 5; i++) {
                System.out.printf("%-15s", desk[i]);
            }
            System.out.println();
        }
    }
}
