package com.education.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.education.bean.TrainData;
import com.education.input.Input;
import com.education.logic.TrainLogic;
import com.education.view.TrainView;

public class TrainMain {

	public static void main(String[] args) {
		
		List <TrainData> trainData = new ArrayList<TrainData>();
		
		Input input = new Input();
		input.inputFileTrain("input.txt", trainData);
		
		TrainView view = new TrainView();
		
		
		System.out.print("_");
		System.out.print(view.print(trainData));
		System.out.print("_");
		
		TrainLogic trainLogic = new TrainLogic();
		trainLogic.sortNumberTrain(trainData);
		
		System.out.print("_sort 1");
		System.out.print(view.print(trainData));
		System.out.println("_");
		
		System.out.print("Pleas input search Number Train ");
		Scanner sc = new Scanner(System.in);
		int searchNumber = sc.nextInt();
		TrainData trainNumber = new TrainData();
		
		System.out.print(searchNumber);
		
		
		trainNumber = trainLogic.searchNumberTrain(trainData, searchNumber); 
		System.out.println(view.print(trainNumber));
		
		trainLogic.sortTrain(trainData);
		System.out.print("_sort 2");
		System.out.print(view.print(trainData));
		System.out.println("_");

	}


}
