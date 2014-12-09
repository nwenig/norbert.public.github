/**
 * @version 9.12.2014
 * @author Norbert Wenig
 */

public class Quadrat {
	static int quadrat( int n){
		return n * n;
	}
	static void ausgabe( int n){
		string s;
		int i;
		for ( i = 1; i <= n; i=i+1 ){
			s = "Quadrat(" + i + ") = " + quadrat(i);
			System.out.println( s );
		}		
	}
	
	public static void main( String args[] ){
		ausgabe( 4 );
	}
}
