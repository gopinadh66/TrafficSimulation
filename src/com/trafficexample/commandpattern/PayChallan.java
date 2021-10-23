package com.trafficexample.commandpattern;

public class PayChallan implements Traffic {

	 private Signal madhapur;

	   public PayChallan(Signal madhapur){
	      this.madhapur = madhapur;
	   }

	   public void execute() {
		   madhapur.challan();
	   }
}
