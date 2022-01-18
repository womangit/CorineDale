public class MonApplication13 {

	public static void main(String arg[]) {
		System.out.println("Bienvenue dans mon application de gestion des ressources humaines");
		
		String employe1 = "Yves" ;
		
		ServicePaye servicePaye ;
		
		servicePaye = new ServicePaye() ;// instanciation
		
		int salaire1 = servicePaye.calculerSalaire (employe1);
		
		System.out.println("employe1" + " a un salaire de " + "salaire") ;
	}
}
		