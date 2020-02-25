package main;
import transaction.repository;

import java.util.Date;

public class Transaction {	
String payeeacc_no;
String benfacc_no;
long amount;
int chq_no;
String bnk_name;
String ifsc_code;
String chq_date;

public Transaction(String payeeacc_no, String benfacc_no,long amount, int chq_no, String bnk_name, String ifsc_code,
		String chq_date) {
	
	super();
	this.payeeacc_no = payeeacc_no;
	this.benfacc_no = benfacc_no;
	this.amount = amount;
	this.chq_no = chq_no;
	this.bnk_name = bnk_name;
	this.ifsc_code = ifsc_code;
	this.chq_date = chq_date;
}
public String getPayeeacc_no() {
	
	return payeeacc_no;
}
public void setPayeeacc_no(String payeeacc_no) {
	this.payeeacc_no = payeeacc_no;
}
public String getBenfacc_no() {
	return benfacc_no;
}
public void setBenfacc_no(String benfacc_no) {
	this.benfacc_no = benfacc_no;
}
public long getAmount() {
	return amount;
}
public void setAmount(long amount) {
	this.amount = amount;
}
public int getChq_no() {
	return chq_no;
}
public void setChq_no(int chq_no) {
	this.chq_no = chq_no;
}
public String getBnk_name() {
	return bnk_name;
}
public void setBnk_name(String bnk_name) {
	this.bnk_name = bnk_name;
}
public String getIfsc_code() {
	return ifsc_code;
}
public void setIfsc_code(String ifsc_code) {
	this.ifsc_code = ifsc_code;
}
public String getChq_date() {
	return chq_date;
}
public void setChq_date(String chq_date) {
	this.chq_date = chq_date;
}

}
