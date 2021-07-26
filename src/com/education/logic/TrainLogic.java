package com.education.logic;


import java.sql.Time;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.education.bean.TrainData;

public class TrainLogic {
	public void sortNumberTrain(List<TrainData> train) {
		int min, k;
		for(int i = 0; i < train.size(); i++) {
			k = i;
			min = train.get(i).getNumberTrain();
			for(int j = i; j < train.size(); j++) {
				if (train.get(j).getNumberTrain() < min) {
					min = train.get(j).getNumberTrain();
					k = j;
				}
			}
			Collections.swap(train, i, k);
		}	
	}

	public TrainData searchNumberTrain(List<TrainData> train, int number) {
		TrainData trainNumber = new TrainData();
		for(int i = 0; i < train.size(); i++) {
			if(train.get(i).getNumberTrain() == number) {
				trainNumber = train.get(i);
				break;
			}
		}
		return trainNumber;
	}
	public void sortTrain(List<TrainData> train) {
		
		Time timeMin;
		int k;
		for(int i = 0; i < train.size(); i++) {
			k = i;
			timeMin = train.get(i).getTimeTrain();
			for(int j = i; j < train.size(); j++) {
				if (train.get(j).getTimeTrain().before(timeMin)) {
					timeMin = train.get(j).getTimeTrain();
					k = j;
				}
			}
			Collections.swap(train, i, k);
		}
		

		for(int i = train.size() - 1; i >= 0; i--) {
			for(int j = 0; j < i; j++) {
				if (train.get(j).getDestination().compareTo(train.get(j + 1).getDestination()) > 0) {
					Collections.swap(train, j, j + 1);
				}
			}
		}		
	}	
}
