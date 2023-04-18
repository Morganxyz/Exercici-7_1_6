import java.util.Scanner;

public class M7_1_6_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int num1 = 0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introdueix la tabla de multiplicar, del 1 al 10,  que vols visualitzar: ");
		num1 = entrada.nextInt();
		
		for(int i = 0; i <= 10; i++) {
			System.out.println(num1 + " X " + i + " = " + multi(num1,i));
		}
		
	}

	public static int multi(int num1,int i) {
		
		return num1 * i;
		
	}
	
}


