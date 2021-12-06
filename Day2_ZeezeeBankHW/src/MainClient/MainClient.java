package MainClient;
import AccountInfo.AccountInfo;

public class MainClient {
	
	public static void main(String args[])
	{
		AccountInfo o1 = new AccountInfo();
	
		int balance = o1.accBalance("9876543210",15000,1500,0);
		System.out.println(balance);

	}
}
