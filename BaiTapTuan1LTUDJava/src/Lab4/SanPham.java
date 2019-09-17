package Lab4;

import java.util.Scanner;

public class SanPham {
	private String tenSP;
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSp(String tenSp) {
		this.tenSP = tenSp;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public double getGiamGia() {
		return giamGia;
	}
	public void setGiamGia(double giamGia) {
		this.giamGia = giamGia;
	}
	private double donGia;
	private double giamGia;
	private double thueNhapKhau;
	
	public  SanPham() {
		
		
	}
	
	public double getThueNhapKhau() {
		return thueNhapKhau;
	}
	public void setThueNhapKhau(double thueNhapKhau) {
		thueNhapKhau = thueNhapKhau;
	}
	static Scanner sc = new Scanner(System.in);
	
	public SanPham(String tenSp, double donGia, double giamGia){ 
		this.tenSP = tenSp;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}
	public SanPham(String tenSp, double donGia){
		this(tenSp, donGia,0);
	}


	public void Nhap( Scanner sc) {
		
		System.out.println(" Nhập tên sản phẩm: ");
		tenSP = sc.nextLine();
		System.out.println("Nhập đơn Giá: ");
		donGia = sc.nextDouble();
		System.out.println("Giảm giá: ");
		giamGia = sc.nextDouble();
		
		
		
	}
	public void Xuat() {
		System.out.println("Tên sản phẩm:" + tenSP);
		System.out.println("Đơn giá: " + donGia);
		System.out.println("Giảm giá: " + giamGia);
		System.out.println("Thuế sản phẩm" + (donGia * 10)/100);
		
	}
}
