package com.moodanalyzer;

//import static org.junit.Test;

import org.junit.Test;

public class MoodAnalyzerTest {
	
MoodAnalyzer ob = new MoodAnalyzer();

	
	@Test
	public void test() {
		String var = ob.analyseMood("I am super sad");
		System.out.println(var);
	}

}
