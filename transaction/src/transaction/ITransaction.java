package transaction;

public interface ITransaction {
	public void CreditWithSlip();
	public void DebitWithSlip();
	public void CreditWithCheque();
	public void DebitWithCheque();

}
