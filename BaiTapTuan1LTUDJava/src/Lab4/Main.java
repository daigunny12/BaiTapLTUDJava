package Lab4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số phần tử: ");
		int n=sc.nextInt();
		ArrayList<SanPham> list = new ArrayList<SanPham>(n);
		for(int i=0 ; i<n;i++) {
			Scanner scanner = new Scanner(System.in);
			SanPham sp = new SanPham();
			sp.Nhap(scanner);
			list.add(sp);
			}	
		for(int j=0;j<n;j++) {
			list.get(j).Xuat();

		}
	}
}
