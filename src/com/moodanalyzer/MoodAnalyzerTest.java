package com.moodanalyzer;

import org.junit.Assert;

//import static org.junit.Test;

import org.junit.Test;

public class MoodAnalyzerTest {
	
MoodAnalyzer ob = new MoodAnalyzer();

	
	@Test
	public void test() {
		String var = ob.analyseMood("I am super ");
		Assert.assertEquals("SAD",var);
		System.out.println(var);
	}
	@Test
	public void test1() {
		String var = ob.analyseMood("I am gladiator");
		Assert.assertEquals("HAPPY",var);
		System.out.println(var);
	}

}
