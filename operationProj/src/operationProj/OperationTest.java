package operationProj;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class OperationTest {
	@Test
	public void checkSum() {
		Operations operation = new Operations();
		int actualResult = operation.add(23, 10);
		Assert.assertEquals(actualResult, 13);
	}
	@Test
	public void checkSub() {
		Operations operation = new Operations();
		int actualResult = operation.sub(23, 10);
		Assert.assertEquals(actualResult, 13);
	}
	@Test
	public void checkMul() {
		Operations operation = new Operations();
		int actualResult = operation.mul(23, 10);
		Assert.assertEquals(actualResult, 230);
	}
	@Test
	public void checkDiv() {
		Operations operation = new Operations();
		int actualResult = operation.div(23, 10);
		Assert.assertEquals(actualResult, 2);
	}
}
