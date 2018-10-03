package warsztaty_1;

import java.util.Random;
import java.util.Scanner;

public class guessNumber_1 {

    public static void main(String[] args) {

        Random rand = new Random();
        int random = rand.nextInt(100);

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int value = scan.nextInt();

        while (true) {
                if (value > random) {
                System.out.println("Za dużo!");
                value=scan.nextInt();
                }

                if (value < random) {
                System.out.println("Za mało!");
                value=scan.nextInt();
                }

                if (value==random){
                System.out.println("Zgadłeś!");
                break;
                }
            }
        }

    }


