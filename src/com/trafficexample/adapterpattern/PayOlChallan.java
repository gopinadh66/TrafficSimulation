package com.trafficexample.adapterpattern;

public class PayOlChallan implements Challan{

	@Override
	public void onlineChallan(String driverName) {
		System.out.println("Audi Car driver "+driverName+" paid challan online");
		
	}

	@Override
	public void offlineChallan(String driverName) {
		// TODO Auto-generated method stub
		
	}

}
