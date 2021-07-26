package com.education.bean;

import java.sql.Time;
import java.util.Comparator;

public class TrainData {
	private String destination;
	private int numberTrain;
	private Time timeTrain;
	
	
	public TrainData() {
		serDestination(destination);
		setNumberTrain(numberTrain);
		setTimeTrain(timeTrain);
	}
	
	public TrainData(String destination, int numberTrain, Time timeTrain) {
		serDestination(destination);
		setNumberTrain(numberTrain);
		setTimeTrain(timeTrain);
	}
		

	public void serDestination(String destination) {
		this.destination = destination;
	}
	public void setNumberTrain(int numberTrain) {
		this.numberTrain = numberTrain;
	}
	public void setTimeTrain(Time timeTrain) {
		this.timeTrain = timeTrain;
	}
	
	public String getDestination() {
		return this.destination;
	}
	public int getNumberTrain() {
		return this.numberTrain;
	}
	public Time getTimeTrain() {
		return this.timeTrain;
	}
	
	@Override
	public String toString() {
		return "TrainData [destination=" + destination + ", numberTrain=" + numberTrain + ", timeTrain=" + timeTrain
				+ "]";
	}



}
