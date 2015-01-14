package pendulo;

import java.util.Scanner;

public class TestPendulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pendulo p = new Pendulo (20);
		System.out.println(p);
		Scanner in = new Scanner(System.in);
		System.out.println("dime la longitud");
		double longitud = in.nextDouble();
		
		Pendulo p1 = new Pendulo (longitud);
		System.out.println(p1);

	}

}
