package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest { 

	@Test
	public void say_1_when_input_1() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String actualResult = fizzbuzz.say(1);
		assertEquals("1", actualResult);
	}
	@Test
	public void say_2_when_input_2() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String actualResult = fizzbuzz.say(2);
		assertEquals("2", actualResult);
	}
	@Test
	public void say_3_when_input_3() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String actualResult = fizzbuzz.say(3);
		assertEquals("Fizz", actualResult);
	}
	@Test
	public void say_4_when_input_4() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String actualResult = fizzbuzz.say(4);
		assertEquals("4", actualResult);
	}
	@Test
	public void say_5_when_input_5() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String actualResult = fizzbuzz.say(5);
		assertEquals("Buzz", actualResult);
	}
	@Test
	public void say_6_when_input_6() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String actualResult = fizzbuzz.say(6);
		assertEquals("Fizz", actualResult);
	}
	@Test
	public void say_7_when_input_7() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String actualResult = fizzbuzz.say(7);
		assertEquals("KBTG", actualResult);
	}
	@Test
	public void say_8_when_input_8() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String actualResult = fizzbuzz.say(8);
		assertEquals("8", actualResult);
	}
	@Test
	public void say_9_when_input_9() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String actualResult = fizzbuzz.say(9);
		assertEquals("Fizz", actualResult);
	}
	@Test
	public void say_10_when_input_10() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String actualResult = fizzbuzz.say(10);
		assertEquals("Buzz", actualResult);
	}
	@Test
	public void say_15_when_input_15() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String actualResult = fizzbuzz.say(15);
		assertEquals("FizzBuzz", actualResult);
	}
}
