package com.education.view;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import com.education.bean.TrainData;

public class TrainView {
	
	
	public String print(List <TrainData> trainData) {
		String sr = "\n";
		
		for (TrainData s : trainData) {
			sr = sr + s.toString() + "\n";
		}
		return sr;
	}
	public String print(TrainData trainNimber) {
		
		String sr = trainNimber.toString();
		return sr;
	}
	
	
	
}
