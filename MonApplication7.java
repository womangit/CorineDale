import java.util.Scanner;

public class MonApplication7 {

	public static void main(String arg[]) {
		System.out.println("demo boucle while");
		
		String prenom;
		char reponse = 'O';
		Scanner sc = new Scanner(System.in);
		
		while(reponse=='O'){
		System.out.println("Donnez un prenom : ");
		prenom = sc.nextLine();
		System.out.println("Bonjour" +prenom+", comment vas-tu ?");
		System.out.println("Voulez-vous réessayer ? (O/N");
		reponse = sc.nextLine().charAt(0);	//on veut prendre un seul caractère	
		}
		
		System.out.println("Au revoir... ");
		
		}		
}
		