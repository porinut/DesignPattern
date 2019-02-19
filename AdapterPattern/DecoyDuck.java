
public class DecoyDuck extends Duck {
	
	public DecoyDuck() {
		this.quackBehavior = new MuteQuack();
		this.flyBehavior = new FlyNoWay();
	}

	@Override
	public void display() {
		System.out.println("I am a DecoyDuck.");
	}
	

}
