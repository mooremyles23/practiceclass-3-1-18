import java.util.Scanner;
public class divisible {
	public static void main(String[] args) {

	Scanner scan=new Scanner (System.in);
	int i=scan.nextInt();
	
	if(i%2==0&&i%3==0){
	

		System.out.println(true);
	}
	else {
		System.out.println(false);}
	
}
}