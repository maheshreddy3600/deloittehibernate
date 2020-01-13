package inheritance;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="JAVA")
public class JavaBook extends Book {
    @Column
	private double discount;
	
	
	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
