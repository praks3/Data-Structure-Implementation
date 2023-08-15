package dataStructures;
import java.util.*;

public class Index {								//main page
	public static void main(String[] args) {
		
		int ch ;
		Scanner sc = new Scanner(System.in);
		Print disp=new Print();
		Menu menu= new Menu();
		
		while (true) {
        	disp.menu1();
            ch = sc.nextInt();

		switch (ch) {		
			case 1:	
				menu.ll();
				break;
			case 2 :
				menu.stack();
				break;
			case 3:
				menu.queue();
				break;
			case 4:
				menu.pqueue();
				break;
			case 5:
				menu.hasht();
				break;
			case 6:
				System.out.println("Exiting...");
				sc.close();
				System.exit(0);	
			default:
				System.out.println("\nInvalid choice.Try again.");
				break;
		} 
        }
		
	}
}