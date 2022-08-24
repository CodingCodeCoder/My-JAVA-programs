/*
* NewCar.java
* Simon Dionne-Couture
*
* NewCar Class w/ display(), constructor and @override equals()
*/
import java.util.Objects;
public class NewCar extends Car{
	String color;

  // Constructor using parents variable super(cost)
	public NewCar (double cost, String color) {
		super(cost);
		this.color = color;
	}


	public void display() {

		System.out.println("price = $"+ getPrice() + ", color = " + this.color);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (obj == null)
			return false;

		if (getClass() != obj.getClass())
			return false;

		NewCar other = (NewCar) obj;
		return Objects.equals(color, other.color)
				&& this.price == other.price;
	}
}
