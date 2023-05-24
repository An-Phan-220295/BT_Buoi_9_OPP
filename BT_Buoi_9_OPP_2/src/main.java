import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Bài 3 :
			Viết chương trình OOP quản lý sinh viên đơn giản: Nhập, xuất thông tin, tính điểm TB.
			- Viết lớp Sinh viên như sau: 
			Attributes (private): 
				 Mã sinh viên là số nguyên. 
				 Họ tên: chuỗi ký tự. 
				 Điểm LT, điểm TH : float 
			Constructor: 
				 Constructor mặc định (để khởi tạo đối tượng với các thông tin kiểu số là 0,
				kiểu chuỗi là chuỗi rỗng). 
				 Constructor thứ hai nhận đầy đủ thông tin để khởi tạo giá trị cho tất cả các biến instance. 
			Methods: 
				 Các getter và setter cho mỗi thuộc tính. 
				 Tính điểm trung bình. 
				 Phương thức toString để diễn tả đối tượng ở dạng chuỗi.
			
			 sv1 chứa thông tin của chính mình (tạo bằng constructor đủ thông số,
			thông tin biết rồi khỏi nhập từ bàn phím). 
			 sv2 là thông tin người bạn thân nhất của em (tạo bằng constructor đủ thông số,
			thông tin biết rồi khỏi nhập từ bàn phím).
			 sv3 tạo bằng constructor mặc định. Nhập các thông tin cho sv3 từ bàn phím rồi sau đó
			dùng các setter để gán vào cho các thuộc tính tương ứng.

		 */
//		StudentInfo2 sv1 = new StudentInfo2(1,"Phan Phúc An",7,8);
//		StudentInfo2 sv2 = new StudentInfo2(2,"Nguyễn Văn A",8,7);
//		StudentInfo2 sv3 = new StudentInfo2();
//		
//		Scanner sc = new Scanner (System.in);
//		
//		sv3.setId(inputIntegerNumber(0, 100000, "Vui lòng nhập mã sinh viên: "));
//		
//		System.out.println("Vui lòng nhập tên sinh viên: ");
//		sv3.setName(sc.nextLine());
//		
//		sv3.setLTScore(inputRealNumber(0,10, "Vui lòng nhập điểm LT: "));
//		sv3.setTHScore(inputRealNumber(0,10, "Vui lòng nhập điểm TH: "));
//		
//		System.out.println(sv1.toString());
//		System.out.println(sv2.toString());
//		System.out.println(sv3.toString());
		
		//Bài 4: Ngân hàng...
		Account account1 = new Account(123456789,"Nguyen Van A");
		Account account2 = new Account(123456788,"Nguyen Van B");
		
		System.out.println("Số dư trước khi chuyển của Account1: "+ account1.toStringBalance());
		System.out.println("Số dư trước khi chuyển của Account2: "+ account2.toStringBalance());
		
//		account1.transfer(account2, 80);
		account1.transfer(account2, 20000);
		
		System.out.println("Số dư sau khi chuyển của Account1: "+ account1.toStringBalance());
		System.out.println("Số dư sau khi chuyển của Account2: "+ account2.toStringBalance());
		
	}
	public static int inputIntegerNumber(int lowerLimit,int upperLimit, String Text) {
		Scanner scan = new Scanner(System.in);
		int number;
		while (true) {
			try {
				System.out.print(Text);
				number = scan.nextInt();
				while (number < lowerLimit || number > upperLimit) {
					System.out.println("Vui lòng nhập một số nguyên trong khoản "+ lowerLimit+" đến "+upperLimit);
					number = scan.nextInt();
				}
				break;
			} catch (InputMismatchException mme) {
				// TODO: handle exception
				System.out.println("Vui lòng nhập một số nguyên.");
				scan.nextLine();
			}
		}
		return number;
	}
	public static float inputRealNumber(float lowerLimit,float upperLimit, String Text) {
		Scanner scan = new Scanner(System.in);
		float number;
		while (true) {
			try {
				System.out.print(Text);
				number = scan.nextFloat();
				while (number < lowerLimit || number > upperLimit) {
					System.out.println("Vui lòng nhập một số trong khoản "+ lowerLimit+" đến "+upperLimit);
					number = scan.nextFloat();
				}
				break;
			} catch (InputMismatchException mme) {
				// TODO: handle exception
				System.out.println("Vui lòng nhập một số");
				scan.nextLine();
			}
		}
		return number;
	}

}
