package com.trafficexample.commandpattern;

public class NoChallan implements Traffic {

	 private Signal JubileeHills;

	   public NoChallan(Signal JubileeHills){
	      this.JubileeHills = JubileeHills;
	   }

	   public void execute() {
		   JubileeHills.nochallan();
	   }
}
