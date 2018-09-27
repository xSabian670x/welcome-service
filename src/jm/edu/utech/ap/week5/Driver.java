package jm.edu.utech.ap.week5;

public class Driver implements Drivable{
	
	public void drive(float numberOfMiles)
	{
		System.out.println(String.format("Jovi has Driven" + "%.2f miles", numberOfMiles));
	}
	

}
