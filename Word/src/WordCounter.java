import java.util.Scanner;
public class WordCounter {

	public static int wordCount(String str) {									

		int count =0;
		for(int i =0;i<str.length();i++) {										
			if(str.charAt(i)== ' ' && str.charAt(i+1) !=' ') {					
				count++;														
			}
		}	
		return count+1;											
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);								

		System.out.println("Enter a String : ");
		String str = s.nextLine();										

		int count = wordCount(str);												
		System.out.println(count);												
		s.close();
	}

}
