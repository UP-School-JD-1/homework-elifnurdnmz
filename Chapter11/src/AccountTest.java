public class AccountTest {

	public static void main(String[] args) {
		AccountClient accountClient = new AccountClient();
		Account myAccount = new Account();
		Account transferAccount = new Account();

		accountClient.withdrawMoney(myAccount, 40);
		accountClient.payIntoMoney(myAccount, 3500);
		accountClient.transfer(myAccount, transferAccount, 100);

	}
}