package com.epam.TDDJUNIT_Task;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveAcharsTest {
	/*
	 * if "ABCD"=> return "BCD"
	 * if "AACD"=> return "CD"
	 * if "BACD"=> return "BCD"
	 * if "BBAA"=> return "BBAA"
	 * if "AABAA"=> return "BAA"
	 */
	RemoveAChars removeachar;
	@BeforeEach
	void setup() {
		removeachar=new RemoveAChars();
	}

	@Test
	void testABCD() {
		assertEquals("BCD",removeachar.remove("ABCD"));
	}
	@Test
	void testAACD() {
		assertEquals("CD",removeachar.remove("AACD"));
	}
	@Test
	void testBACD() {
		assertEquals("BCD",removeachar.remove("BACD"));
	}
	@Test
	void testAABAA() {
		assertEquals("BAA",removeachar.remove("AABAA"));
	}

}
