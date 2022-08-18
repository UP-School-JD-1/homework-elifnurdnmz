public class AccountClient {

	public void withdrawMoney(Account account, double amount) {
		System.out.println(amount + " TL miktarında para çekilmiştir.");
	}

	public void payIntoMoney(Account account, double amount) {
		System.out.println(amount + " TL miktarında para yatırılmıştır.");
		return;
	}

	public void transfer(Account myAccount, Account transferAccount, double amount) {
		if (myAccount.getBalance() < (amount)) {
			System.out.println("Havale işlemi yapılamamaktadır");
			return;
		}
		
		System.out.println(amount + "TL miktarında havale işlemi yapılmıştır.");

	}

}