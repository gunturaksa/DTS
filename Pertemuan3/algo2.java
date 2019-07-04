import java.util.Scanner;
public class algo2{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Masukkan Angka : ");
	int a = sc.nextInt();
	if (a%2 == 0){
		System.out.print("Genap");
	}
	else {
		System.out.print("Ganjil");
	}
	}
}