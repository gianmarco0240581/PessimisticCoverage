package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import logic.CashbackController;
import logic.User;

public class TestJUnit {

	@Test
	public void TestCalcoloCashback() {

		// creo un nuovo utente ipotizzando una spesa mensile pari a 5 cent
		User user = new User();
		user.setUsername("TestUser");
		user.setSpesaMensile(0.05);

		CashbackController controller = new CashbackController();

		double value;
		value = controller.calcoloCashback(user.getSpesaMensile());

		// è lecito attendersi un cashback del 10% della spesa pari a 0 euro
		assertEquals(0.0, value, 0);

	}

}
