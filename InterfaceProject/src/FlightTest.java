
public class FlightTest {

	public static void main(String[] args) {
		CommercialFlight commFlight = new CommercialFlight();
		commFlight.checkTicket();
		commFlight.checkIdentityOfCPassengers();
		commFlight.fly();
		commFlight.land();
		
		System.out.println("-----------");
		
		FighterFlight fightFlight = new FighterFlight();
		fightFlight.armMissiles();
		fightFlight.fly();
		fightFlight.fireMissile();
		fightFlight.land();
		
		System.out.println("-----------");
		
		CargoFlight cargoFlight = new CargoFlight();
		cargoFlight.checkTheCapacity();
		cargoFlight.carryGoods();
		cargoFlight.fly();
		cargoFlight.land();
		

		
	}

}
interface Flying{
	void fly();
}
interface Landing{
	void land();
}
interface Ticketing {
	void checkTicket();
}
interface Fighting {
	void fireMissile();
}
interface Carrying {
	void carryGoods();
}
abstract class Flight implements Flying,Landing{
	
}
class CommercialFlight extends Flight{

	@Override
	public void fly() {
		System.out.println("Commercial Flight is flying :");		
	}

	@Override
	public void land() {
		System.out.println("Commercial flight is landing :");
		
	}
	public void checkTicket() {
		System.out.println("Commercial Flight ...checking tickets....");		
	}
	
	void checkIdentityOfCPassengers() {
		System.out.println("Commercial Flight is checking identities of passengers...");
	}
	
}
class FighterFlight extends Flight implements Fighting {

	@Override
	public void fly() {
		System.out.println("FighterFlight Flight is flying");
		
	}

	@Override
	public void land() {
		System.out.println("FighterFlight Flight is landing");
		
	}

	@Override
	public void fireMissile() {
		System.out.println("FighterFlight  ... firing missile....");		
	}
	
	public void armMissiles() {
		System.out.println("Fighter Flight is arming the missiles...");
	}
	
}

class CargoFlight extends Flight implements Carrying {

	@Override
	public void fly() {
		System.out.println("CargoFlight Flight is flying");
		
	}

	@Override
	public void land() {
		System.out.println("CargoFlight Flight is landing");
		
	}

	@Override
	public void carryGoods() {
		System.out.println("CargoFlight  ... carrying goods....");		
	}
	
	void checkTheCapacity() {
		System.out.println("CargoFlight is checking the carriage capacity ");
	}
	
}