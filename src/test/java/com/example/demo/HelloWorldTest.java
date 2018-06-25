package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {

	@Test public void 
	สวัสดี_gritin_when_input_is_gritin() {
		Reception reception = new Reception();
		String actualResult = reception.get("gritin");
		assertEquals("สวัสดี_gritin", actualResult);
	}

}
