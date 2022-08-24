/*
* Car.java
* Simon Dionne-Couture
*
* Car Class, parent constructor for NewCar() and UsedCar() passing cost
*/

public class Car {
	//Variables
	double price;
	double cost;

	public Car (double cost) {
		this.price = cost * 2;
	}

	public double getPrice() {
		return this.price;
	}
}
