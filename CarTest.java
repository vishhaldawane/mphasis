public class CarTest {
	public static void main(String[] args) {
		System.out.println("Begin main");
		Car myCar = new Car();
		try {			
			myCar.start(); //without key how come this is started..
			myCar.shortDrive();		
			}
		catch(TyrePuncturedException e) {		
			System.out.println("ohk..lets repair the tyre..."+e); 	
		}
		catch(RedSignalDishonouredException e) {		
			System.out.println("ohk..paying the challan..:"+e);
		}
		catch(SpeedBreakerDishonouredException e) {		
			System.out.println("oh...my vehile damanged on speed breaker : "+e);
		} catch (CarKeyException e) {
			System.out.println("oh...where have I kept the car keys??? "+e);
			
		}
		System.out.println("End main");
	}
}
class CarKeyException extends Exception { //This is checked exception one
	CarKeyException(String msg) {		super(msg); 	}
}
class Car {
	void start() throws CarKeyException // this clause is mandatory for checked one 
	{
		double d = Math.random()%10;
		if(d>0.75) { // if my memory is more than 80%
			System.out.println("Found the Car key...");	System.out.println("Starting the car...");
		}
		else {
			CarKeyException cke = new CarKeyException("Car Key Not Finding...");
			throw cke;
		}
	}
	
	void shortDrive() {
		System.out.println("Begin Short Drive");
		for (int i = 1; i <= 5; i++) {
			System.out.println("Completed "+i+" kms");	double d = Math.random()%10;
			if(d<0.10) {
				TyrePuncturedException r3 = new TyrePuncturedException("Ohhh!!! tyre punctured.....");
				throw r3;
			}
			if(d>0.85) {
				RedSignalDishonouredException r1 = new RedSignalDishonouredException("Ohhh!!! Dishonoured the red signal.....");
				throw r1;
			}
			if(d<0.20) {
				SpeedBreakerDishonouredException r2 = new SpeedBreakerDishonouredException("Ohh!!! Dishonoured the speed breaker.....");
				throw r2;
			}
		}
		System.out.println("End Short Drive");
	}
}
class TyrePuncturedException extends RuntimeException {
	TyrePuncturedException(String msg) {		super(msg);	}
}
class RedSignalDishonouredException extends RuntimeException{
	RedSignalDishonouredException(String msg) {		super(msg);	}
}
class SpeedBreakerDishonouredException extends RuntimeException{
	SpeedBreakerDishonouredException(String msg) {		super(msg);	}
}




