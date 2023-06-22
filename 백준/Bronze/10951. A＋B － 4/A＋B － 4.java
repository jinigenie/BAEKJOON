import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = 0, b = 0;
		
		while(scan.hasNext()) {
			a = scan.nextInt();
			b = scan.nextInt();
			
			System.out.println(a + b);
			
		}
        scan.close();
	}
}
