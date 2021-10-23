package com.trafficexample.factorypattern;

public class TrafficPolice {

	public Traffic getSignal(String signalType){
	      if(signalType == null){
	         return null;
	      }		
	      if(signalType.equalsIgnoreCase("Yellow")){
	         return new YellowLight();
	         
	      } else if(signalType.equalsIgnoreCase("Green")){
	         return new GreenLight();
	         
	      } else if(signalType.equalsIgnoreCase("Red")){
	         return new RedLight();
	      }
	      
	      return null;
	   }
}
