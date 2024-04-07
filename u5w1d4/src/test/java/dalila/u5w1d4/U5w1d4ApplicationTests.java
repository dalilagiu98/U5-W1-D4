package dalila.u5w1d4;

import dalila.u5w1d4.entities.Drink;
import dalila.u5w1d4.entities.Pizza;
import dalila.u5w1d4.entities.Table;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class U5w1d4ApplicationTests {

	@Test
	void contextLoads() {

	}
	private static AnnotationConfigApplicationContext ctx;

	@BeforeAll
	public static void startUp() {
		ctx = new AnnotationConfigApplicationContext(U5w1d4Application.class);

	}
	@Test
	public void testWaterPrice() {
		assertEquals(1.29, ctx.getBean("water", Drink.class).getPrice());
	}

}
