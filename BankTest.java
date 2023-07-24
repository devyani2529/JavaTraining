import java.awt.*;
import javax.swing.*;
public class BankTest {

	public static void main(String[] args) {
		BankApplicationForm bankAppForm1 = new BankApplicationForm();
		BankApplicationForm bankAppForm2 = new BankApplicationForm();
		BankApplicationForm bankAppForm3 = new BankApplicationForm();
		bankAppForm1.setApplicantName("kalyani patil");
		bankAppForm1.setAccountType("Saving");
		bankAppForm1.setAdress("105 gopal nagar pune");
		bankAppForm1.setAdhaarCard("58690524102270");
		bankAppForm1.setPanCard("MCOPS10008");
		bankAppForm1.setMobileNumber("749924006");
		bankAppForm1.setEmailAddress("klayanipatil123@email.com");

		bankAppForm2.setApplicantName("sunil Sonawane");
		bankAppForm2.setAdhaarCard("85462214");
		bankAppForm2.setPanCard("sos258946");
		bankAppForm2.setEmailAddress("sunil@gmail.com");
		bankAppForm2.setMobileNumber("8890443464");
		bankAppForm2.setAdress("D509, East Avenue, Pune 16");
		bankAppForm2.setAccountType("Current");
		
		bankAppForm3.setApplicantName("Seeta lanje");
		bankAppForm3.setAdhaarCard("985672587777");
		bankAppForm3.setPanCard("RO527654E");
		bankAppForm3.setEmailAddress("ratan@gmail.com");
		bankAppForm3.setMobileNumber("7799443464");
		bankAppForm3.setAdress("E59, South Avenue, Bengaluru 26");
		bankAppForm3.setAccountType("fixed");
		
	
		bankAppForm1.printApplicationForm();
		bankAppForm2.printApplicationForm();

		bankAppForm3.printApplicationForm();

		
		System.out.println("=============================");
		
		Bank bank = new Bank();
		BankAccount bankAcc1 = bank.applyForABankAccount(bankAppForm1); 
		BankAccount bankAcc2 = bank.applyForABankAccount(bankAppForm2); 
		BankAccount bankAcc3 = bank.applyForABankAccount(bankAppForm3);  

		bankAcc1.bankAccountDetails();	
		bankAcc2.bankAccountDetails();	
		bankAcc3.bankAccountDetails();	
		

	}

}
class Form{
	
}
class BankApplicationForm extends Form{
	private String applicantName;
	private String adress;
	private String adhaarCard;
	private String panCard;
	private String mobileNumber;
	private String emailAdress;
	private String accountType;
	
	
	public String getApplicantName(){
		return applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName=applicantName;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress=adress;
	}
	public String getAdhaarCard() {
		return adhaarCard;
	}
	public void setAdhaarCard(String adhaarCard) {
		this.adhaarCard = adhaarCard;
	}
	public String getPanCard() {
		return panCard;
	}
	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailAddress() {
		return emailAdress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAdress = emailAdress;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	void printApplicationForm() {
		System.out.println("Bank Applicant Name :"+applicantName);
		System.out.println("Bank Account Type  :"+accountType);
		System.out.println("Applicant adress :"+adress);
		System.out.println("Applicant Adhaar  :"+adhaarCard);
		System.out.println("Applicant Pan  :"+panCard);
		System.out.println("Applicant EmailId  :"+emailAdress);
		System.out.println("Applicant MobileNumber  :"+mobileNumber);
	}
}

class BankAccount{

	private long accountNumber;
	private String accountHolder;
	private long accountBalance;
	private String accountType;
	private String ifscCode;
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public long getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(long accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	
	void bankAccountDetails() {
		System.out.println("-------Bank Account Details -------");
		System.out.println("Account Number      : "+accountNumber);
		System.out.println("Account Type        : "+accountType);
		System.out.println("Account Holder      : "+accountHolder);
		System.out.println("Bank Account IFSC   : "+ifscCode);
		System.out.println("Account Balance     : "+accountBalance);
		
	}
}
class Bank{
	BankAccount applyForABankAccount(BankApplicationForm bankAppFormRef ) {
		System.out.println("Recieved the application form  : "+bankAppFormRef.getApplicantName());
		System.out.println("Creating bank Account ");
		BankAccount bankAccObj = new BankAccount(); 
		
		double value = Math.random() * 100;
		long accNum = (long) value;
		bankAccObj.setAccountNumber(accNum);
		bankAccObj.setAccountHolder(bankAppFormRef.getApplicantName());
		bankAccObj.setAccountType(bankAppFormRef.getAccountType());
		bankAccObj.setIfscCode("BOB000000725");
		bankAccObj.setAccountBalance(2000);
		
		return bankAccObj;
}
}

