import java.util.Scanner;
public class MidCharOfString {

public static String midElement(String s) { 						
		
		int len = s.length();												
		int index = len/2;													
		if(len%2==0) {											
			return s.substring(index-1,index+1);
		}
		return String.valueOf(index);		
	}
	

public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);					
		System.out.println("Enter a String");					
		String str = sc.nextLine();						
		String middle = midElement(str); 						
		
		System.out.println("Middle character : " + middle);
		sc.close();
	}

}
