import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] list = new int[n];
		
		for (int i = 0; i < n; i++) {
			list[i] = sc.nextInt();
		}
		
		int temp = 0;
		for (int i = 0; i < n -1; i++) {
			for (int j = 0; j < n - 1- i; j++) {
				if (list[j] > list[j + 1]) {
					temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println(list[i]);
		}
	}
}