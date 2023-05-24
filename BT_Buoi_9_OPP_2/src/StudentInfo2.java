/*Author: Phan Phúc An
 * Date: 22-05-2023
 * 
 * BT_Buổi 9_OPP:
 * 
 * Viết chương trình OOP quản lý sinh viên đơn giản: Nhập, xuất thông tin, tính điểm TB.
 * - Viết lớp Sinh viên như sau: Attributes (private): 
	 Mã sinh viên là số nguyên. 
	 Họ tên: chuỗi ký tự. 
	 Điểm LT, điểm TH : float 
 * Constructor: 
	 Constructor mặc định (để khởi tạo đối tượng với các thông tin kiểu số là 0, kiểu chuỗi là chuỗi rỗng). 
	 Constructor thứ hai nhận đầy đủ thông tin để khởi tạo giá trị cho tất cả các biến instance. 
 * Methods: 
	 Các getter và setter cho mỗi thuộc tính. 
	 Tính điểm trung bình. 
	 Phương thức toString để diễn tả đối tượng ở dạng chuỗi.
	- sv1 chứa thông tin của chính mình (tạo bằng constructor đủ thông số, thông tin biết rồi khỏi nhập từ bàn phím). 
	- sv2 là thông tin người bạn thân nhất của em (tạo bằng constructor đủ thông số, thông tin biết rồi khỏi nhập từ bàn phím).
	- sv3 tạo bằng constructor mặc định. Nhập các thông tin cho sv3 từ bàn phím rồi sau đó dùng các setter để
	gán vào cho các thuộc tính tương ứng.
 */

public class StudentInfo2 {
	private int id;
	private String name;
	private float LTScore;
	private float THScore;
	
	public StudentInfo2(int id, String name, float lTScore, float tHScore) {
		this.id = id;
		this.name = name;
		LTScore = lTScore;
		THScore = tHScore;
	}
	
	public StudentInfo2() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getLTScore() {
		return LTScore;
	}

	public void setLTScore(float lTScore) {
		LTScore = lTScore;
	}

	public float getTHScore() {
		return THScore;
	}

	public void setTHScore(float tHScore) {
		THScore = tHScore;
	}
	
	public float averageScore() {
		return (this.LTScore + this.THScore) / 2;
	}

	@Override
	public String toString() {
		return "StudentInfo2 [id=" + id + ", name=" + name + ", LTScore=" + LTScore + ", THScore=" + THScore + "]";
	}
	
	

}
