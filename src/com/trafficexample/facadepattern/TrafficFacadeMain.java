package com.trafficexample.facadepattern;

public class TrafficFacadeMain {

	public static void main(String[] args) {
		
		TrafficPolice br = new TrafficPolice();
		
		br.getGreenSignal();
		br.getYellowSignal();
		br.getRedSignal();

	}

}
