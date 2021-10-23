package com.trafficexample.facadepattern;

public class RedLight implements Traffic{

	@Override
	public void stop() {
		System.out.println(" Stop the vehicles");
		
	}

}
