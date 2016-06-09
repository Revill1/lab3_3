package lab3_3;

import org.junit.Test;

import edu.iis.mto.time.Order;
import edu.iis.mto.time.OrderExpiredException;

public class OrderTimeTest {

	@Test(expected = OrderExpiredException.class)
	public void OrderTimeTestMethod()
	{
		Order order = new Order();
		
		order.submit();
		order.confirm();
	}
}
