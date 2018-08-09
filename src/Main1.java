import java.util.Random;
import java.util.Scanner;

// ZGADNIJ LICZBĘ
public class Main1 {

	 public static void main(String[] args) {
	    	Scanner scan= new Scanner(System.in);
	  	  
	    	Random rand = new Random();
	       int los= rand.nextInt(100);
	    	
	    	System.out.println("Zgadnij liczbę: ");
	    	while(true){
	    	
	    	while	(!scan.hasNextInt())	{
				scan.next();
				System.out.print("To nie jest liczba");	
	}
	    	int liczba =scan.nextInt();
	    	
	   if (liczba<los){
		   System.out.println("Za mało!");
	   }
	   else if (liczba>los){
		   System.out.println("Za duzo!");
	   }
	   else if (liczba==los){
		   System.out.println("Zgadles");
		   break;

	    }
	    }
	    	scan.close();
	    }
	

	}
