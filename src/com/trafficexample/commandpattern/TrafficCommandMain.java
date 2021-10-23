package com.trafficexample.commandpattern;

public class TrafficCommandMain {

	public static void main(String[] args) {
		 Signal signal1 = new Signal("Maruti","Mark",100);
		 Signal signal2 = new Signal("Vista","Jack",400);
		 Signal signal3 = new Signal("Audi","Peter",7000);

	      PayChallan payc1 = new PayChallan(signal1);
	      PayChallan payc2 = new PayChallan(signal2);
	      PayChallan payc3 = new PayChallan(signal3);
	      NoChallan npayc1 = new NoChallan(signal1);
	      NoChallan npayc2 = new NoChallan(signal2);

	      TrafficPolic trafficPolice = new TrafficPolic();
	      trafficPolice.addVehicle(payc1);
	      trafficPolice.addVehicle(payc2);
	      trafficPolice.addVehicle(payc3);
	      trafficPolice.addVehicle(npayc1);
	      trafficPolice.addVehicle(npayc2);

	      trafficPolice.proceesChallan();
	   }

	}


