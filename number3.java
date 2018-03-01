import java.util.Scanner;

public class number3 {
	public static void main(String[] args) {

		Scanner scan=new Scanner (System.in);
		
		String f = scan.nextLine();
		
		System.out.print (name(f));
	}
	public static  boolean name (String i){	
		
		if(i.length()%2==0){
		return true;
		
				}	
	else {
		return false;}
	
	}
}