package com.trafficexample.adapterpattern;

public class TrafficSignalAdapter implements Traffic{

	Challan ch;
	
	public TrafficSignalAdapter(String signalType) {
		if(signalType.equalsIgnoreCase("Green")) {
			ch = new PayOffChallan();
		}else if(signalType.equalsIgnoreCase("Red")) {
			ch = new PayOlChallan();
		}
	}

	@Override
	public void crossSignal(String driverName, String signalType) {
		
		if(signalType.equalsIgnoreCase("Green")){
	         ch.offlineChallan(driverName);
	      }
	      else if(signalType.equalsIgnoreCase("Red")){
	         ch.onlineChallan(driverName);
	      }
		
	}
	

}
