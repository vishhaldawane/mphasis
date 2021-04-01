//each class has business method, no main anywhere
//thought +felt (emotions) = action + result
class Cricket // my class name is incidently matching with .java file
{
  public static void main(String args[])  {
	System.out.println("Cricket started.....");
	People p = new People(); //this way thousands of objects 
	
	Umpire u1 = new Umpire(); //main umpire
	Umpire u2 = new Umpire(); //leg umpire

	Fielder f1 = new Fielder(); //this way 11 fielders
	Bowler b1 = new Bowler();

	Cricketer cr1 = new Cricketer(); //pair to play
	Cricketer cr2 = new Cricketer();
	
	p.shout();	b1.bowling();	cr1.hitSixer();
	p.clapOnSixer();

	System.out.println("----second ball..now..");
	b1.bowling();
	cr1.defend();
	b1.appeal();
	u1.decideOutOrNot();

	
	
	
  }
}

class People {
	void shout() {		System.out.println("Sachin...Sachin...Sachin...");	}
	void clapOnSixer() {	System.out.println("People are clapping on sixer....");		}
}
class Cricketer { // its wiring 
  void hitSixer()  {   System.out.println("Sachin is Hitting Sixer......");  }
  void defend() {     System.out.println("Sachin is defending ......");  }
}
class Bowler {
  void appeal()  {    System.out.println("how is that???...out or not..");  }
  void bowling() {    System.out.println("Bowler is bowling....fastest.....one...");  }
}
class Fielder {
  void field()  {   System.out.println("what a nice fielding....boundry is stopped.."); }
}
class Umpire {
  void showSixer()  {    System.out.println("Thats a pretty high sixer....");  }
  void decideOutOrNot() {    System.out.println("Thats not out...");  }
}