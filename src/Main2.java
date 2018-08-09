import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;


//SYMULATOR LOTTO
public class Main2 {

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
	
	  
/*
    	
    	System.out.println("Podaj 1 liczbę: ");
    	while	(!scan.hasNextInt())	{
		scan.next();
		System.out.print("To nie jest liczba");	
    		}
    	int liczba1 =scan.nextInt();
    	
    	System.out.println("Podaj 2 liczbę: ");
    	while	(!scan.hasNextInt())	{
		scan.next();
		System.out.print("To nie jest liczba");	
    		}
    	int liczba2 =scan.nextInt();

    	
    	System.out.println("Podaj 3 liczbę: ");
    	while	(!scan.hasNextInt())	{
		scan.next();
		System.out.print("To nie jest liczba");	
    		}
    	int liczba3 =scan.nextInt();
    	
    	System.out.println("Podaj 4 liczbę: ");
    	while	(!scan.hasNextInt())	{
		scan.next();
		System.out.print("To nie jest liczba");	
    		}
    	int liczba4 =scan.nextInt();
    	
    	System.out.println("Podaj 5 liczbę: ");
    	while	(!scan.hasNextInt())	{
		scan.next();
		System.out.print("To nie jest liczba");	
    		}
    	int liczba5 =scan.nextInt();
    	
    	System.out.println("Podaj 6 liczbę: ");
    	while	(!scan.hasNextInt())	{
		scan.next();
		System.out.print("To nie jest liczba");	
    		}
    	int liczba6 =scan.nextInt();
	
		*/
		
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
    	
 //   	int tabPodane[]={liczba1, liczba2, liczba3, liczba4, liczba5, liczba6};
    	int sum=0;
    	for (int i = 0; i < tab.length; i++) {
    		for(int j=0; j<myNumbers.length;j++ ){
    			if(tab[i]==myNumbers[j]){
    				sum++;
    			}
    		}
    		
    	}
    	
    	System.out.print("Wyslosowałeś "+ sum+ " Gratulacje!");
	}
	}



