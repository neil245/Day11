package com.moodanalyzer;

import org.junit.Assert;

//import static org.junit.Test;

import org.junit.Test;

public class MoodAnalyzerTest {
	

	
	@Test
	public void test() {
		MoodAnalyzer ob = new MoodAnalyzer("I am super ");

		String var = ob.analyseMood();
		Assert.assertEquals("SAD",var);
		System.out.println(var);
	}
	@Test
	public void test1() {
		MoodAnalyzer ob = new MoodAnalyzer("I am super happy");
		String var = ob.analyseMood();
		Assert.assertEquals("HAPPY",var);
		System.out.println(var);
	}

}
