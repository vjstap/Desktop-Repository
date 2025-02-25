package m01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder (MethodOrderer.OrderAnnotation.class)
class Module01Test {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Preparing tests");	
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Finishing tests");
	}

	@Test
	@Order(1)
	void transform_barberReverse_True() {
		String actual = "barber_";
		System.out.println(Module01.transform(actual));
		assertEquals("barberrebrab", Module01.transform(actual));
	}
	@Test
	@Order(2)
	void transform_ayubaReverse_True() {
		String actual = "ayuba";
		System.out.println(Module01.transform(actual));
		assertEquals("AyubaabuyA", Module01.transform(actual));
	}
	@Test
	@Order(3)
	void transform_ClAyReverse_True() {
		String actual = "ClAy";
		System.out.println(Module01.transform(actual));
		assertEquals("clayyalc", Module01.transform(actual));
	}
	@Test
	@Order(4)
	void transform_BuzzReverse_True() {
		String actual = "Buzz";
		System.out.println(Module01.transform(actual));
		assertEquals("buzZZzub", Module01.transform(actual));
	}
	@Test
	@Order(5)
	void transform_Hi_hoReverse_True() {
		String actual = "Hi_ho";
		System.out.println(Module01.transform(actual));
		assertEquals("hihoohih", Module01.transform(actual));
	}
	@Test
	@Order(6)
	void transform_returnEmptyString_True() {
		String actual = "";
		System.out.println(Module01.transform(actual));
		assertEquals("", Module01.transform(actual));
	}
	@Test
	@Order(7)
	void transform_null_True() {
		String actual = null;
		System.out.println(Module01.transform(actual));
		assertNull(Module01.transform(actual));
	}
	/**
	 * Tests for methodB
	 */
	
	@Test
	@Order(8)
	void methodB_hi_2letters() {
		String actual = "hi";
		System.out.println(Module01.methodB(actual));
		assertEquals(2, Module01.methodB(actual));
	}
	@Test
	@Order(9)
	void methodB_Heu_2letters() {
		String actual = "Heu";
		System.out.println(Module01.methodB(actual));
		assertEquals(2, Module01.methodB(actual));
	}
	@Test
	@Order(10)
	void methodB_Eule_3letters() {
		String actual = "Eule";
		System.out.println(Module01.methodB(actual));
		assertEquals(3, Module01.methodB(actual));
	}
	@Test
	@Order(11)
	void methodB_rauh_3letters() {
		String actual = "rauh";
		System.out.println(Module01.methodB(actual));
		assertEquals(3, Module01.methodB(actual));
	}
	@Test
	@Order(12)
	void methodB_Hund_4letters() {
		String actual = "Hund";
		System.out.println(Module01.methodB(actual));
		assertEquals(4, Module01.methodB(actual));
	}
	@Test
	@Order(13)
	void methodB_maehen_5letters() {
		String actual = "maehen";
		System.out.println(Module01.methodB(actual));
		assertEquals(5, Module01.methodB(actual));
	}
	@Test
	@Order(14)
	void methodB_Moehren_6letters() {
		String actual = "Moehren";
		System.out.println(Module01.methodB(actual));
		assertEquals(6, Module01.methodB(actual));
	}
	@Test
	@Order(15)
	void methodB_Ueber_4letters() {
		String actual = "Ueber";
		System.out.println(Module01.methodB(actual));
		assertEquals(4, Module01.methodB(actual));
	}
	@Test
	@Order(16)
	void methodB_Freude_5letters() {
		String actual = "Freude";
		System.out.println(Module01.methodB(actual));
		assertEquals(5, Module01.methodB(actual));
	}
	@Test
	@Order(17)
	void methodB_freundlich_9letters() {
		String actual = "freundlich";
		System.out.println(Module01.methodB(actual));
		assertEquals(9, Module01.methodB(actual));
	}

}
