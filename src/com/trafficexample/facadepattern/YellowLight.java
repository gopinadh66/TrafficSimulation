package com.trafficexample.facadepattern;

public class YellowLight implements Traffic {

	@Override
	public void stop() {
		System.out.println(" Start the vehicles");
		
	}

}
