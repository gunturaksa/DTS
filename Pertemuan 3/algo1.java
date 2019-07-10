import java.util.Scanner;
public class algo1{
	public static void main(String args[]){
		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukan nila awal : ");
		int a = sc.nextInt();
		x = 1;
		y = x * x;
		while(y != a){
				x=x+1;
				y=x*x;
			}
		System.out.println("hasil akarnya adalah : "+x);	
		}
	}