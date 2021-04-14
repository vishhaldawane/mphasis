public class CarTest {
	public static void main(String[] args) {
		System.out.println("Begin main");
		Car myCar = new Car();
		try {			
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
		}
		System.out.println("End main");
	}
}
class Car {
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




