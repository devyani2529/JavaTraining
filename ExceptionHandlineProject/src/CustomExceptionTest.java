public class CustomExceptionTest {
	public static void main(String[] args) throws CarLicenceNotFoundException, CarFuelNotFoundException 
	{
		System.out.println("MAIN started...\n");
		
		try {
			Car myCar = new Car();
			myCar.longDrive();
		
		}
		catch(CarKeyNotFoundException ex1) {
			System.out.println("Key Issue : "+ex1);
		}
		catch(CarLicenceNotFoundException ex2) {
			System.out.println("Key Issue : "+ex2);
		}
		System.out.println("\nMAIN finished...\n");
		
	}
}

class CarKeyNotFoundException extends Exception
{
	CarKeyNotFoundException(String msg) {
		super(msg);
	}
}
class CarLicenceNotFoundException extends Exception
{
	CarLicenceNotFoundException(String msg) {
		super(msg);
	}
}
class CarFuelNotFoundException extends Exception
{
	CarFuelNotFoundException(String msg) {
		super(msg);
	}
}
class RedSignalDishnouredException extends RuntimeException
{
	RedSignalDishnouredException(String msg) {
		super(msg);
	}
}
class TyrePunctureException extends RuntimeException
{
	TyrePunctureException(String msg) {
		super(msg);
	}
}
class CarTrafficException extends RuntimeException
{
	CarTrafficException(String msg) {
		super(msg);
	}
}
class Car
{
	boolean keyFound=false;
	boolean Licence =false;
	float FuelLevel=0;
	
	Car() throws CarKeyNotFoundException,CarLicenceNotFoundException,CarFuelNotFoundException
	{
		double value = Math.random()%10;
		
		if(value>=0.80) {
			keyFound=true;
		}
		if(value>=0.20) {
			Licence=true;
		}
		if(keyFound==true) {
			System.out.println("Car is started....");
			
		}
		else {
			//System.out.println("Car Key Not Found....");
			throw new CarKeyNotFoundException("Hey...Where is the Car Key? im not getting it...");
			
		}
		if(Licence==true) {
			System.out.println("Licence is found..");
		}
		else {
			//System.out.println("Car Key Not Found....");
			throw new CarLicenceNotFoundException ("Hey...Where is the Car license? im not getting it...");
			
		}
	}
	
	public void longDrive() {
		for (int i = 1; i <=30; i++) {
			System.out.println(i+" kms driven....");
			double value = Math.random()%10;
			if(value>0.95) {
				RedSignalDishnouredException ex1 = new RedSignalDishnouredException("Oh No!!! Red signal is dishonoured....");
				throw ex1;
			}
			if(value>0.50) {
				TyrePunctureException ex2 = new TyrePunctureException("Oh No!!! tyre is puncture....");
				throw ex2;
			}
			if(value>0.40) {
				CarTrafficException ex3 = new CarTrafficException("Oh No!!! Traffic ....");
				throw ex3;
			}
			
		}
	}
}