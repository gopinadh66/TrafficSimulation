Adapter Design Pattern - 
I have created Adapter design pattern where Challan and Traffic are the Interfaces, TrafficPolice is concrete classes, TrafficSignalAdapter is adapter class implementing the Traffic interface. My main class is TrafficMainAdapter.

Command Design Pattern - 
I have created Command Design Pattern where Traffic is the interface, Signal is the request class, NoChallan and PayChallan is a concrete class implements Traffic, TrafficPolic is the broker class. The TrafficCommandMain is the main class. In result we can see if there is a challan or not.

Facade Design Pattern - 
I have created TrafficFacadeMain as the main class, Traffic as interface, YellowLight, GreenLight and RedLight as concrete classes implementing the same interface and TrafficPolice as facade class.

Factory Design Pattern - 
I have created TrafficFactoryMain as the main class, Traffic as interface, YellowLight, GreenLight and RedLight as concrete classes implementing the same interface and TrafficPolice as factory class to generate object of concrete class.