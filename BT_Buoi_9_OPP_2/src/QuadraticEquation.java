/*
 * Author: Phan Phúc An
 * Date: 22-05-2023
 * 
 * BT_Buổi 9_OPP:
 * 
 * 1. Viết chương trình khai báo một lớp Phương trình bậc 2 với các thuộc tính là a, b, c với các phương thức sau:
	•Hàm tạo không tham số.
	•Hàm tạo có 3 tham số.
	•Get/set cho 3 thuộc tính.
	•Phương thức tính delta.
	•Phương thức tính nghiệm phương trình.
 */
public class QuadraticEquation {
	private double a;
	private double b;
	private double c;
	
	public QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public QuadraticEquation() {
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	
	public double delta() {
		return Math.pow(this.b, 2) - (4 * this.a * this.c);
	}
	public void solution() {
		if (delta() < 0) 
			System.out.println("Phương trình vô nghiệm.");
		if (delta() == 0) 
			System.out.println("Phương trình có nghiệm kép: "+(-b/(2*a)));
		else {
			double x1 = ((-b + Math.sqrt(delta()))/(2*a));
			double x2 = ((-b - Math.sqrt(delta()))/(2*a));
			
			System.out.println("Phương trình có nghiệm x1: "+x1);
			System.out.println("Phương trình có nghiệm x2: "+x2);
		}
	}
}
