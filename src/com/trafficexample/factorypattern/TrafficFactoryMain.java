package com.trafficexample.factorypattern;

public class TrafficFactoryMain {

	public static void main(String[] args) {
	TrafficPolice sbroker = new TrafficPolice();
	
    Traffic t1 = sbroker.getSignal("Yellow");

    
    t1.stop();

    
    Traffic t2 = sbroker.getSignal("Green");

 
    t2.stop();


    Traffic t3 = sbroker.getSignal("Red");


    t3.stop();
    }
}
