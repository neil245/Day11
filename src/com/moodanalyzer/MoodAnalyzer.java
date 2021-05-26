package com.moodanalyzer;

public class MoodAnalyzer {

	public String analyseMood(String message) {
		if(message.contains("sad")) {
		return "sad";
	}
		
		else if(message.contains("happy")) {
			return "happy";
		}return null;

}
}