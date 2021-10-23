package com.trafficexample.commandpattern;

public class Signal {

	private String vehicleName;
	private String driverName;
	   private int fine;

	   
	  
	public Signal(String vehicleName, String driverName, int fine) {
		
		this.vehicleName = vehicleName;
		this.driverName = driverName;
		this.fine = fine;
	}
	public void challan(){
	      System.out.println("Driver "+driverName+", crossed signal with vehicle "+vehicleName+" and paid challan of: " + fine);
	   }
	   public void nochallan(){
	      System.out.println("Driver "+driverName+", followed signals correctly with vehicle "+vehicleName);
	   }
}
