import java.text.DecimalFormat;

/*
 * Author: Phan Phúc An
 * Date: 24-05-2023
 * 
 * BT_Buổi 9_OPP:
 * 
 Bài 4 : 
Ngân hàng ABC muốn lưu trữ thông tin của mỗi tài khoản như sau: Mỗi tài khoản chứa các thông tin: 
	 Số tài khoản ( Kiểu long), 
	 Tên tài khoản (kiểu chuỗi), 
	 Số tiền trong tài khoản (kiểu double) 
(a). Thiết kế lớp Account để lưu trữ các thông tin, lớp bao gồm các phương thức sau: 
	 Constructor: Có 2 constructor ( mặc định và đầy đủ tham số) 
	 Các phương thức get, set cho từng thuộc tính 
	 Phương thức toString để trả về chuỗi chứa toàn bộ thông tin tài khoản,
	yêu cầu định dạng tiền tệ. 
(b). Thêm các thông tin sau vào lớp Account 
	 Hằng số lãi suất có giá trị khởi tạo 0.035 
	 Constructor có 2 đối số: số tài khoản, tên tài khoản.
	Constructor này sẽ khởi tạo số tiền mặc định là 50. 
	 Phương thức nạp tiền vào tài khoản:
	Lấy số tiền hiện tại trong tài khoản + số tiền nạp vào 
	 Phương thức rút tiền:
	Lấy số tiền hiện tại trong tài khoản – (số tiền muốn rút+phí rút tiền) 
	 Phương thức đáo hạn: Mỗi lần đến kỳ đáo hạn thì
	số tiền trong tài khoản = số tiền trong tài khoản + số tiền trong tài khoản * LAISUAT 
	 Phương thức chuyển khoản từ tài khoản này sang tài khoản khác
	Chú ý: Mỗi thao tác phải kiểm tra số tiền nạp, rút, chuyển có hợp lệ hay không?

 */
public class Account {
	private long accountNumber;
	private String accountName;
	private double accountBalance;
	private final double interestRate = 0.035;
	private final double withdrawalFee = 1100;
	
	public Account(long accountNumber, String accountName, double accountBalance) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountBalance = accountBalance;
	}
	
	public Account() {}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	@Override
	public String toString() {
		DecimalFormat decimalFormat = new DecimalFormat("###,###,###.00");
		return "Account [accountNumber=" + accountNumber + ", accountName=" + accountName + ", accountBalance="
				+ decimalFormat.format(accountBalance) + " VND" + " ]";
	}
	
	public String toStringBalance() {
		DecimalFormat decimalFormat = new DecimalFormat("###,###,###.00");
		return ("AccountBalance: "+ decimalFormat.format(accountBalance) + " VND");
	}
	
	public Account(long accountNumber, String accountName) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountBalance = 50000;
	}
	
	public void depositMoney(double topUpAmount) {
		if(topUpAmount>0)
			this.accountBalance = this.accountBalance + topUpAmount;
		else
			System.out.println("Vui lòng nhập lại số tiền cần nạp.");
	}
	
	public void withdrawMoney(double withdrawalAmount) {
		if(withdrawalAmount>0) {
			if(withdrawalAmount > this.accountBalance)
				System.out.println("Số dư không đủ để thực hiện giao dịch này.");
			else
				this.accountBalance = this.accountBalance - (withdrawalAmount + withdrawalFee);
		}
		else
			System.out.println("Vui lòng nhập lại số tiền cần rút.");
	}
	
	public void depositMaturity() {
		this.accountBalance = this.accountBalance + (this.accountBalance * this.interestRate);
	}
	
	public void transfer(Account destinationAccount,double transferAmount) {
		if(transferAmount>0) {
			if(transferAmount >= this.accountBalance)
				System.out.println("Số dư không đủ để thực hiện giao dịch này.");
			else {
				this.accountBalance = this.accountBalance - transferAmount;
				destinationAccount.depositMoney(transferAmount);
			}
		}
		else
			System.out.println("Vui lòng nhập lại số tiền cần chuyển.");
	}
}
