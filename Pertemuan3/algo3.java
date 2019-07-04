import java.util.Scanner;
public class algo3{
	public static void main(String args[]){
	double luas,keliling,pi;
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukan jari - jari awal : ");
		int r = sc.nextInt();
		pi=3.14;
		luas = pi*r*r;
		keliling = 2*pi*r;
		System.out.println("luas : "+luas);
		System.out.println("Keliling : "+keliling);	
		}
	}