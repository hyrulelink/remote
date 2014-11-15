
public abstract class Duck {

	QuackBehaviour quackBehaviour;
	FlyingBehaviour flyingBehaviour;
	
	public Duck()
	{
		
	}
	
	public void setFlyBehaviour(FlyingBehaviour fb)
	{
		flyingBehaviour=fb;
	}
	
	
	public void setQuackBehaviour(QuackBehaviour qb)
	{
		quackBehaviour=qb;
		
	}
	
	public void performQuack() {
		quackBehaviour.quack();
	}

	public void swim()
	{
		System.out.println("I'm swimming! :D");
	}
	
	public abstract void display();
	
	public void performFly() {
		flyingBehaviour.fly();
	}

}
