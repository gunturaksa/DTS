import java.util.Scanner;
public class algo4{
	public static void main(String args[]){
		Scanner sca = new Scanner(System.in);
		System.out.print("Masukan a : ");
		int a = sca.nextInt();
		Scanner scb = new Scanner(System.in);
		System.out.print("Masukan b : ");
		int b = scb.nextInt();
		if (a > b){
			System.out.print(a+" > "+b);
		}
		else if(a == b){
			System.out.print(a+" = "+b);
		}
		else {
			System.out.print(b+" > "+a);
		}
		}
	}