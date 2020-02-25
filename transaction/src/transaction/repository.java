package transaction;
import main.Transaction;
//import packagename.classname;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class repository implements ITransaction {
	ArrayList<Transaction> trn;
	Transaction t1;
	Transaction t2;
	 public repository() {
		 trn=new ArrayList<Transaction>();
		 t1=new Transaction("123456789001","123456789003",5000L,0,"State Bank of India","SBI00123","15/12/2019");
		 t2=new Transaction("123456789002","123456789004",6000L,0,"Bank of India","BOI00123","15/12/2018");
		trn.add(t1);
		trn.add(t2);
		
		
		
	}
	@Override
	public void CreditWithSlip() {
		// TODO Auto-generated method stub
		
		System.out.println("enter the account no");
		Scanner sc=new Scanner(System.in);
		String acc=sc.nextLine();
		//ArrayList<Transaction>tra=ArrayList<Transaction>();
		
		//t1=new Transaction(acc);
		
		if(t1.getPayeeacc_no().equals(acc)) {
			System.out.println("enter the amount");
			long am=sc.nextLong();
			t1.setAmount(t1.getAmount()+am);
			System.out.println("your account balance after credited amount is Rs."+t1.getAmount());
			}
		else {
			System.out.println("wrong account no");
		}
		
		
		
	}
	@Override
	public void DebitWithSlip() {
		// TODO Auto-generated method stub
		System.out.println("enter the account no");
		Scanner sc=new Scanner(System.in);
		String acc=sc.nextLine();
		if(t1.getPayeeacc_no().equals(acc)) {
			System.out.println("enter the amount");
			long am=sc.nextLong();
			t1.setAmount(t1.getAmount()-am);
			System.out.println("your account balance after debited amount is Rs."+t1.getAmount());
		}
		else {
			System.out.println("Wrong account no");
		}
		
	}
	
	@Override
	public void CreditWithCheque() {
		// TODO Auto-generated method stub
		
		System.out.println("enter your account no:");
		Scanner sc=new Scanner(System.in);
		String acc=sc.nextLine();
		if(t1.getPayeeacc_no().equals(acc)|| t2.getPayeeacc_no().equals(acc)) {
		System.out.println("enter benefeciary account no:");
		
	    String bfacc=sc.nextLine();
	    
		if(t1.getBenfacc_no().equals(bfacc)||(t2.getBenfacc_no().equals(bfacc))){
			
		System.out.println("Cheque No:");
		
		 int cNumber = (int)((Math.random() * 90)+100000);
		t1.setChq_no(cNumber);
		System.out.println(t1.getChq_no());
		System.out.println("Enter the IFSC code");
		String ifc=sc.nextLine();
		if(t1.getIfsc_code().equals(ifc)||(t2.getIfsc_code().equals(ifc))) {
		System.out.println("Date:"+t1.getChq_date());
		System.out.println("enter the amount:");
		 int am=sc.nextInt();
		 t1.setAmount(t1.getAmount()-am);
		 System.out.println("your account balance after debited amount is Rs."+t1.getAmount());
		}
		else {System.out.println("Wrong Ifsc code");}
		
		}
		else {  System.out.println("account no does not exist");   }
		}
		else {  System.out.println("account no does not exist"); }
		}
	@Override
	public void DebitWithCheque() {
		// TODO Auto-generated method stub
		System.out.println("enter your account no:");
		Scanner sc=new Scanner(System.in);
		String acc=sc.nextLine();
		System.out.println("Cheque No:");
		
		 int cNumber = (int)((Math.random() * 90)+100000);
		t1.setChq_no(cNumber);
		System.out.println(t1.getChq_no());
		System.out.println("Enter the IFSC code");
		String ifc=sc.nextLine();
		System.out.println("Date:"+t1.getChq_date());
		System.out.println("enter the amount:");
		 int am=sc.nextInt();
		 t1.setAmount(t1.getAmount()+am);
		 System.out.println("your account balance after credited amount is Rs."+t1.getAmount());
		
	}
	
}
