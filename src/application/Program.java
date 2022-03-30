package application;

import entities.Car;

public class Program {

	public static void main(String[] args) {
		var car = new Car();
		
		String distance = car.distanceDisplay();
		System.out.println(distance);
		
		String battery = car.batteryDisplay();
		System.out.println(battery);
		
		car.drive();
		car.drive();
		
		distance = car.distanceDisplay();
		System.out.println(distance);
		
		battery = car.batteryDisplay();
		System.out.println(battery);

	}

}
