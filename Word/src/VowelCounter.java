import java.util.Scanner;
public class VowelCounter {
	
	public static int vowelCount(String str) {					
		str =str.toLowerCase();										
		int count=0;						
		for(int i=0; i<str.length();i++) {							
			
			switch(str.charAt(i)) {									
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':count++;
			}
		}
		
		return count;									
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

         Scanner sc = new Scanner(System.in);						
		
		System.out.println("Enter a String : ");
		String str = sc.nextLine();							
		
		int count = vowelCount(str);									
		System.out.println(count);							
		sc.close();
	}

}
