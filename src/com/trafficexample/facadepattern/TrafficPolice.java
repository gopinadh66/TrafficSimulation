package com.trafficexample.facadepattern;

public class TrafficPolice {

	private Traffic green;
	private Traffic red;
	private Traffic yellow;
	public TrafficPolice() {
		red = new RedLight();
		green = new GreenLight();
		yellow = new YellowLight();
		
	}
	
	public void getGreenSignal() {
		green.stop();
	}
	public void getYellowSignal() {
		yellow.stop();
	}
	public void getRedSignal() {
		red.stop();
	}
}
