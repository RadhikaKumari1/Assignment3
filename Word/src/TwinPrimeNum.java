import java.util.ArrayList;
public class TwinPrimeNum {
	
	public static void twinPrimes(int len) {
		ArrayList<Integer> primes = new ArrayList<Integer>();						
		for(int i =2; i < 100 ;i++) {													
			int count =0;
			for(int j=2 ;j < i/2 ;j++ ) {
				if(i%j == 0)													
				{	count++;
					break;
				}
			}
			if(count == 0) {															
				primes.add(i);
			}
		}
		for(int i =0; i<primes.size()-1;i++) {							
			if(primes.get(i) + 2 == primes.get(i+1)) {						
				System.out.print("("+primes.get(i)+","+primes.get(i+1)+") ");			
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
       int limit = 100;
		
		twinPrimes(limit);												

	}

}
