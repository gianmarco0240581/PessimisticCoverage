package logic;

public class CashbackController {

	public double calcoloCashback(double spesa) {
		double cashback;

		cashback = (spesa/100)*10;
		return cashback;
	}

}
