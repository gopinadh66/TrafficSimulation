package com.trafficexample.factorypattern;

public class GreenLight implements Traffic{

	@Override
	public void stop() {
		System.out.println("Move the vehicles");
		
	}

	

}
