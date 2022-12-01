package basic.dev;

import java.util.Random;


public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[19];
		input(a);
		Print(a);
		tong(a);
		dem_chan_le(a);
		tang_dan(a);
		System.out.println();
		giam_dan(a);
		soNguyenTo(a);
		
		System.out.print("Cac so nguyen to co trong mang la: ");
		for (int i = 0; i < a.length; i++) {
			if (isPrime(a[i])) {
				System.out.print(a[i] + " ");
			}
		}
		System.out.println();
	}

	private static void soNguyenTo(int[] a) {
		// TODO Auto-generated method stub
		int dem = 0;
		for (int i = 0; i < a.length; i++) {
			if (isPrime(a[i])) {
				dem++;
			}	
		}
		System.out.format("Mang co %d so nguyen to!", dem);
		System.out.println();
	}


	static boolean isPrime(int n) {
		// TODO Auto-generated method stub
		if (n == 1 || n == 2) {
			return true;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}


	private static void tang_dan(int[] a) {
		// TODO Auto-generated method stub
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.print("Mang tang dan: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "       ") ;
		}
	}
	private static void giam_dan(int[] a) {
		// TODO Auto-generated method stub
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.print("Mang giam dan: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "       ") ;
		}
		System.out.println();
	}


	private static void dem_chan_le(int[] a) {
		// TODO Auto-generated method stub
		int even = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				even++;
			}
		}
		System.out.format("%d so chan %d so le", even, a.length - even);
		System.out.println();
	}

	private static void tong(int[] a) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println("Tong cua mang = " + sum);
		if (sum % 2 == 0) {
			System.out.println("EVEN!");
		}else {
			System.out.println("ODD!");
		}
	}

	private static void Print(int[] a) {
		// TODO Auto-generated method stub
		System.out.println("Mang a:");
		for (int i = 0; i < a.length; i++) {
			System.out.format("%d", a[i]).print("\t");
		}
		System.out.println();
	}

	private static void input(int[] a) {
		// TODO Auto-generated method stub
		int min = 1;
		int max = 10;
		for (int i = 0; i < a.length; i++) {
			a[i] = randomInteger(min, max);
		}
	}

	private static int randomInteger(int min, int max) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		return rand.nextInt(max + 1 - min) + min;
	}
}
