package Ekhemee839;
import java.util.Scanner;
public class Lab1 {
	public static String Utga(String[] args){
		Scanner myObj = new Scanner(System.in);
		String A = myObj.nextLine();
		return A;
	}
	
	public static int tsalin(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int ts = myObj.nextInt();
		return ts;
	}
	
	public static double jTsalin(int ts) {
		double total = ts*12/0.11;
		return total;
	}
	
	public static void main(String[] args) {
		int ts;
		double total;
		System.out.println("Та нэрээ оруулна уу?\n");
		String name = Utga(null);
		
		System.out.println("Та сарын цалингаа оруулна уу?\n");
		ts = tsalin(null);
		
		total = jTsalin(ts);
		
		System.out.println("Таны гар дээрээ авах цалин = "+ total);
	}
}