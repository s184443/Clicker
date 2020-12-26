package model;

public class Basics {
	private int total;
	private int clickAmount=1;

	public int getClickAmount() {
		return clickAmount;
	}

	public void setClickAmount(int clickAmount) {
		this.clickAmount = clickAmount;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	public void incrementTotal(int amount) {
		setTotal(getTotal() + amount);
	}

}
