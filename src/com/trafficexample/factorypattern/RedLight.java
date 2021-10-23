package com.trafficexample.factorypattern;

public class RedLight implements Traffic {

	@Override
	public void stop() {
		System.out.println("Stop the vehicles");
		
	}

	

}
