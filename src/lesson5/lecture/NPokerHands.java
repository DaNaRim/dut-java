package lesson5.lecture;

import java.util.Scanner;

public class NPokerHands {

    public static void main(String[] args) {
        String[] deck = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 0; i < n; i++) {
            String[] resultDeck = new String[5];

            for (int j = 0; j < 5; j++) {
                String randCard;
                boolean isUnique;
                do {
                    isUnique = true;

                    int randNum = (int) (Math.random() * (deck.length - 1));
                    String randNudeCard = deck[randNum];
                    int randSuits = (int) (Math.random() * (suits.length - 1));
                    String randNudeSuits = suits[randSuits];

                    randCard = randNudeSuits + randNudeCard;

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
}
