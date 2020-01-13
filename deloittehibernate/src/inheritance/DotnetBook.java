package inheritance;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@DiscriminatorValue(value="DOTNET")
public class DotnetBook extends Book {
   
	@Column
	private double cds;
	
	public double getCds() {
		return cds;
	}



	public void setCds(double cds) {
		this.cds = cds;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
