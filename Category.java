package core;

public enum Category {
	GOOD(100), BAD(200), VERYBAD(300);

	private int amount;
	Category(int amount) {
		// TODO Auto-generated constructor stub
		this.amount = amount;
		
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
}
