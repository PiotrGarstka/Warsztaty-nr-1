import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

// KOSTKA DO GRY
public class Dice {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
	  	  
    	Random rand = new Random();
    	int[] diceType={3,4,6,8,10,12,20,100}; 
 
       int y= rand.nextInt(3);
       int D4= rand.nextInt(4);
       int D6= rand.nextInt(6);
       int D8= rand.nextInt(8);
       int D10= rand.nextInt(10);
       int D12= rand.nextInt(12);
       int D20= rand.nextInt(20);
       int D100= rand.nextInt(100);
    
       System.out.println("Podaj komendę: ");
       
       String str =scan.next();
       
       
       
       
       String[] tokens = str.split("D");
       System.out.println(tokens[0]);
       System.out.println(tokens[1]);
    
       StringTokenizer st = new StringTokenizer(str, "+, D");
       
       while (st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}
     
       
	}



}
