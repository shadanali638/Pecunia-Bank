package mainClass;

import java.util.Scanner;


//import transaction.TransactionImpl;
import transaction.repository;

public class transactionMain {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	while(true) {
	System.out.println("************************************");	
	System.out.println("*******1.Credit using Slip**********");
	System.out.println("*******2.Debit using Slip***********");
	System.out.println("*******3.Credit using Cheque********");
	System.out.println("*******4.Debit using Cheque*********");
	System.out.println("************************************");
	int n=sc.nextInt();
	switch(n) {
	case 1:
		repository r1=new repository();
		r1.CreditWithSlip();
		break;
	case 2:
		repository r2=new repository();
		r2.DebitWithSlip();
		break;
	case 3:
		repository r3=new repository();
		r3.CreditWithCheque();
	break;
	case 4:
		repository r4=new repository();
		r4.DebitWithCheque();
	}
	}
	//repository r=new repository();
	//r.CreditWithSlip();
	//r.DebitWithSlip();
	//r.CreditWithCheque();
	//r.DebitWithCheque();
	
	
	
	//TrnMain().getAmount();
		//TrnMain t=new TrnsactionImpl();
	
		
	}

}
