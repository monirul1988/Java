package Interface_concept;

public class Developing implements BankingClient, Domance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Developing d = new Developing();
		d.checkingbalanace();
		d.paycreditcard();
		d.transferbalance();

		d.login();

		BankingClient d1 = new Developing();// Runtime Polymorphisim
		d1.checkingbalanace();
		d1.paycreditcard();
		d1.transferbalance();

		Developing d2 = new Developing();
		d2.yesbank();

	}

	@Override
	public void paycreditcard() {
		// TODO Auto-generated method stub
		System.out.println("paycreditcard");
	}

	@Override
	public void transferbalance() {
		// TODO Auto-generated method stub
		System.out.println("transferbalance");
	}

	@Override
	public void checkingbalanace() {
		// TODO Auto-generated method stub
		System.out.println("checkingbalanace");
	}

	public void login() {
		// TODO Auto-generated method stub
		System.out.println("logged in");
	}

	@Override
	public void yesbank() {
		System.out.println("yes bank login");

	}

}
