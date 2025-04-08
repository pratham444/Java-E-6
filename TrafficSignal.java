import java.util.Scanner;
class TrafficSignal
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Signal :");
		char ch = sc.next().charAt(0);
		 
		String result =(ch == 'r' || ch == 'R') ? "Rider Stop" : (ch == 'o' || ch == 'O') ? "Rider Be Ready" : (ch == 'g' || ch == 'G') ? "Rider Gooo!!" : "Flase Signal Entered" ;

		System.out.println(result);


	}
}
