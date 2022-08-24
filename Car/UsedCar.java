/*
* UsedCar.java
* Simon Dionne-Couture
*
* UsedCar Class w/ display(), constructor and @override equals()
*/
import java.util.Objects;
public class UsedCar extends Car {
	int mileage;

	public UsedCar(double cost, int mileage) {
		super(cost);
		this.mileage = mileage;
	}
	public void display() {
		System.out.println("price = $" + getPrice() + ", mileage = " + this.mileage);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsedCar other = (UsedCar) obj;
		return Objects.equals(mileage, other.mileage)
				&& this.price == other.price;
	}
}
