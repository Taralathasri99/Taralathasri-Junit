package epam.Junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveA extends AfterRemoveA{
	private AfterRemoveA obj;

	@BeforeEach
	void setUp()
	{
		obj=new AfterRemoveA();
	}

	@Test
	void test1() {
		assertEquals("BCD",obj.remove("ABCD"));
	}
	@Test
	void test2() {
		assertEquals("BCD",obj.remove("AABCD"));
	}
	@Test
	void test3() {
		assertEquals("",obj.remove("A"));
	}
	@Test
	void test4() {
		assertEquals("",obj.remove("AA"));
	}
	@Test
	void test5() {
		assertEquals("BCD",obj.remove("BCD"));
	}
	@Test
	void test6() {
		assertEquals("ABCD",obj.remove("AAABCD"));
	}
	@Test
	void test7() {
		assertEquals("",obj.remove(""));
	}
	@Test
	void test8() {
		assertEquals("B",obj.remove("B"));
	}
	@Test
	void test9() {
		assertEquals("A",obj.remove("AAA"));
	}
	@Test
	void test10() {
		assertEquals("BDEFG",obj.remove("AABDEFG"));
	}
	@Test
	void test11() {
		assertEquals("BCDAEFG",obj.remove("BCDAEFG"));
	}
	@Test
	void test12() {
		assertEquals("ABCDEAFG",obj.remove("AAABCDEAFG"));
	}
	@Test
	void test13() {
		assertEquals("BCDEAFG",obj.remove("AABCDEAFG"));
	}
	@Test
	void test14() {
		assertEquals("CD",obj.remove("AACD"));
	}
	@Test
	void test15() {
		assertEquals("BCD",obj.remove("BACD"));
	}
	@Test
	void test16() {
		assertEquals("BBAA",obj.remove("BBAA"));
	}
	@Test
	void test17() {
		assertEquals("BAA",obj.remove("AABAA"));
	}
	@Test
	void test18() {
		assertEquals("AA",obj.remove("AAAA"));
	}
	@Test
	void test19() {
		assertEquals("BB",obj.remove("BB"));
	}

}
