package org.company;

public class CompanyInfo {
	
private void companyname() {
	System.out.println("Company Name is CTS");

}
private void companyid() {
	System.out.println("Company ID is 9988");

}
private void companyaddress() {
	System.out.println("Company Address is Sholinganallur");

}
public static void main(String[] args) {
	CompanyInfo ci = new CompanyInfo();
	ci.companyname();
	ci.companyid();
	ci.companyaddress();
}

}
