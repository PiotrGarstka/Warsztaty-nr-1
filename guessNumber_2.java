package warsztaty_1;

import java.util.Scanner;

public class guessNumber_2 {

    public static void main(String[] args) {

        String userInput;
        Scanner sn = new Scanner(System.in);
        System.out.println("\n"+"*****GRA ZGADNIJ LICZBĘ*****"+"\n");
        System.out.println("Pomyśl liczbę od 0 do 1000 a ja ją zgadnę w max 10 próbach."+"\n");
        int max=1000;
        int min=0;

        int guess=((max-min)/2)+min;
        System.out.println("Zgaduję "+guess+"\n");

        int count=0;

        while(true){

            count++;
            System.out.println(count+".*****Wybierz jedną z poniższych opcji*****");
            System.out.println("*. Wybierz \"Za_dużo\"");
            System.out.println("*. Wybierz \"Za_mało\"");
            System.out.println("*. Wybierz \"Zgadłeś\"");
            System.out.println("Wprowadz komendę:");

            userInput = sn.next();

            switch(userInput){
                case "Za_dużo":
                    max=guess;
                    guess=((max-min)/2)+min;
                    System.out.println("Zgaduję "+guess+"\n");
                    break;
                case "Za_mało":
                    min=guess;
                    guess=((max-min)/2)+min;
                    System.out.println("Zgaduję "+guess+"\n");
                    break;
                case "Zgadłeś":
                    //exit from the program
                    System.out.println("Wygrałem!");
                    System.exit(0);
                default:
                    //inform user in case of invalid choice.
                    System.out.println("Niepoprawny wybór. Wprowadz polecenie jeszcze raz...");
            }
        }
    }
}
