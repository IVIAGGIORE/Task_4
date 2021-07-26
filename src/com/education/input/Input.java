package com.education.input;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import com.education.bean.TrainData;

public class Input {
	private List<String> lines;
	private String[] arrOfStr;
		
	{
		lines = null;
	}
	
	public List <TrainData> inputFileTrain (String file, List<TrainData> trainData ) {
		
		try {
			lines = Files.readAllLines(Paths.get(file), StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for (int i = 0; i < lines.size(); i++) {
			arrOfStr = lines.get(i).split(";");
			
			trainData.add(new TrainData(arrOfStr[0],Integer.parseInt(arrOfStr[1]), Time.valueOf(arrOfStr[2])));
		}
		
		return trainData;
	}

}
