import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Doggotest {

	private Doggo doggo = new Doggo();

	@Test
	void Testsize() {
		Assertions.assertEquals(99, this.doggo.winner(45).size());
	}

	@Test
	void Testfalse() {
		Assertions.assertEquals(false, this.doggo.winner(3).contains("3rd"));
	}

}
