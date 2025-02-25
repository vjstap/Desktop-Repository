package codingBat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CodingBatTest {

	@Test
	void CodingBat_abcXY123XYijk_XY_c13i() {
		String word = "abcXY123XYijk";
		String str = "XY";
		assertEquals("c13i", CodingBat.wordEnds(word, str));
	}
	@Test
	void CodingBat_XY123XY_XY_13() {
		String word = "XY123XY";
		String str = "XY";
		assertEquals("13", CodingBat.wordEnds(word, str));
	}
	@Test
	void CodingBat_XY1XY_XY_11() {
		String word = "XY1XY";
		String str = "XY";
		assertEquals("11", CodingBat.wordEnds(word, str));
	}
	@Test
	void CodingBat_XYXY_XY_XY() {
		String word = "XYXY";
		String str = "XY";
		assertEquals("XY", CodingBat.wordEnds(word, str));
	}
	@Test
	void CodingBat_XYXY_XY_EmptyString() {
		String word = "XYXY";
		String str = "XY";
		assertEquals("", CodingBat.wordEnds(word, str));
	}
	@Test
	void CodingBat_XY_XY_EmptyString() {
		String word = "XY";
		String str = "XY";
		assertEquals("", CodingBat.wordEnds(word, str));
	}
	@Test
	void CodingBat_EmptyString_XY_EmptyString() {
		String word = "";
		String str = "XY";
		assertEquals("", CodingBat.wordEnds(word, str));
	}
	@Test
	void CodingBat_abc1xyz1i1j_1_cxziij() {
		String word = "abc1xyz1i1j";
		String str = "1";
		assertEquals("cxziij", CodingBat.wordEnds(word, str));
	}
	@Test
	void CodingBat_abc1xyz1_1_cxz() {
		String word = "abc1xyz1";
		String str = "1";
		assertEquals("cxz", CodingBat.wordEnds(word, str));
	}
	@Test
	void CodingBat_abc1xyz11_1_cxz11() {
		String word = "abc1xyz11";
		String str = "1";
		assertEquals("cxz11", CodingBat.wordEnds(word, str));
	}
	@Test
	void CodingBat_abc1xyz1abc_abc_11() {
		String word = "abc1xyz1abc";
		String str = "abc";
		assertEquals("11", CodingBat.wordEnds(word, str));
	}
	@Test
	void CodingBat_abc1xyz1abc_b_acac() {
		String word = "abc1xyz1abc";
		String str = "b";
		assertEquals("acac", CodingBat.wordEnds(word, str));
	}
	@Test
	void CodingBat_abc1xyz1abc_abc_1111() {
		String word = "abc1xyz1abc";
		String str = "abc";
		assertEquals("1111", CodingBat.wordEnds(word, str));
	}
}
