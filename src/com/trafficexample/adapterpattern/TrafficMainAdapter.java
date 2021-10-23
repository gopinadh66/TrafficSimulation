package com.trafficexample.adapterpattern;

public class TrafficMainAdapter {

	public static void main(String[] args) {
		TrafficPolice tpolice = new TrafficPolice();

		tpolice.crossSignal("Green", "Mark");
		tpolice.crossSignal("Green", "Jones");
		tpolice.crossSignal("Red", "Lucy");
		tpolice.crossSignal("Yellow", "Parker");

	}

}
