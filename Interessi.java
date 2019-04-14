
public class Interessi {
	
public static void main ( String [] args ) {
	
	double capitale = 3650;
	final double tasso = 0.03;
	double interesse;
	
	interesse = capitale * tasso ;
	capitale = capitale + interesse ;
	
	System.out.print (" Capitale maturato : ");
	System.out.println ( capitale );
	
	}		
}
