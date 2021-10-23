package com.trafficexample.adapterpattern;

public class PayOffChallan implements Challan{

	@Override
	public void onlineChallan(String driverName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void offlineChallan(String driverName) {
		System.out.println("Auto driver "+driverName+" paid challan offline");
		
	}

}
