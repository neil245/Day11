package com.moodanalyzer;

public class MoodAnalyzer {

	String message;
	public MoodAnalyzer(String message) {
		this.message=message;
	}

	public String analyseMood() {
		
		if(this.message.contains("sad")) {
			return "SAD";
		}else  {
			return "HAPPY";
		}
	}
		


}
