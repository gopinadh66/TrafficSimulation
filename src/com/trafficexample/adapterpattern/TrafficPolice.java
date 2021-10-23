package com.trafficexample.adapterpattern;

public class TrafficPolice implements Traffic {

	TrafficSignalAdapter tsadapter;
	@Override
	public void crossSignal(String signalType, String driverName) {
		
		//inbuilt support to play mp3 music files
	      if(signalType.equalsIgnoreCase("Green")){
	         System.out.println("Green Signal followed by driver Name: " + driverName);			
	      } 
	      
	      //mediaAdapter is providing support to play other file formats
	      else if(signalType.equalsIgnoreCase("Green") || signalType.equalsIgnoreCase("Red")){
	    	  tsadapter = new TrafficSignalAdapter(signalType);
	    	  tsadapter.crossSignal(signalType, driverName);
	      }
	      
	      else{
	         System.out.println("Expired License driver. " + driverName + "  not allowed to drive");
	      }
		
	}

}
