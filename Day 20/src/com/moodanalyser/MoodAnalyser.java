package com.moodanalyser;
public class MoodAnalyser {
	
private String message;
	

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalysisException {
        try {
            if (message.length()==0)
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY,"Please enter proper mood");
            if (message.contains("Sad"))
                return "SAD";
            return "HAPPY";
        } catch (NullPointerException e) {
        	return "HAPPY";
        }
    }

}