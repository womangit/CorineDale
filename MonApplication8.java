import java.util.Scanner;

public class MonApplication8 {

	public static void main(String arg[]) {
	System.out.println("demo boucle while");		
	String prenom = new String();
	//pas bes8 d'initialiser : on entre au moins une fois dans la boucle !		
	char reponse = 'O';		
	
	Scanner sc = new Scanner(System.in);
		
		do{		
		  System.out.println("Donnez un prenom : ");
		  prenom = sc.nextLine(); 
	      System.out.println("Bonjour" +prenom+", comment vas-tu ?");		  
		  
		  do{
			System.out.println("Voulez-vous réessayer ? (O/N"); 
			reponse = sc.nextLine().charAt(0);				
	      }while(reponse !='O');	

	    }while(reponse =='O');
		
		System.out.println("Au revoir... ");
		
		} 
}
		
		


	
		