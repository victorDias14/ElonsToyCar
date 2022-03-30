package entities;

public class Car {
	
	private int distance;
	private int battery;
	
	
	public Car() {
		this.distance = 0;
		this.battery = 100;
	}
	
	public String distanceDisplay() {
		return String.format("Dirigiu %d metros", distance);
	}
	
	public String batteryDisplay() {
		if (this.battery == 0) {
			return "Bateria vazia";
		}
		
		return String.format("Bateria em %d porcento", battery);
	}
	
	public void drive() {
		if (this.distance < 2000 && this.battery > 0) {
			this.distance += 20;
			this.battery--;
		}
	}
}
