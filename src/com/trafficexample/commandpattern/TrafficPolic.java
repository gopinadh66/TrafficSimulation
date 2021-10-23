package com.trafficexample.commandpattern;

import java.util.ArrayList;
import java.util.List;

public class TrafficPolic {

	private List<Traffic> orderList = new ArrayList<Traffic>(); 

	   public void addVehicle(Traffic order){
	      orderList.add(order);		
	   }

	   public void proceesChallan(){
	   
	      for (Traffic order : orderList) {
	         order.execute();
	      }
	      orderList.clear();
	   }
}
