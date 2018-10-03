package warsztaty_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Lotto {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int myNumbers[]=new int [6];
        int r=0;
        for(int i=0; i<myNumbers.length; i++){
            System.out.println("Podaj numer: ");

            while((!scan.hasNextInt())||(myNumbers[i]<0)||(myNumbers[i]>49)){
                System.out.println("Podaj jeszcze raz: ");
                scan.next();
            }

            myNumbers[i]=scan.nextInt();
        }

        Integer[] arr = new Integer[49];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));
        Collections.shuffle(Arrays.asList(arr));
        System.out.println(Arrays.toString(arr));

        int tab[]=new int[6];
        for (int i = 0; i < 6; i++) {
            tab[i]=arr[i];
        }
        System.out.println(Arrays.toString(tab));

        int sum=0;
        for (int i = 0; i < tab.length; i++) {
            for(int j=0; j<myNumbers.length;j++ ){
                if(tab[i]==myNumbers[j]){
                    sum++;
                }
            }

        }

        System.out.print("Wylosowałeś "+ sum+ " Gratulacje!");
    }
}




