
public abstract class Duck {
	
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	public abstract void display();
	
	public void	swim(){
		System.out.println("Swimming");
	}
	
	public void performFly(){
		flyBehavior.fly();
	}
	
	public void performQuack(){
		quackBehavior.quack();
	}
	
	public void setFlyBehavior(FlyBehavior fb){
		flyBehavior = fb;
	}
	
	public void quackBehavior(QuackBehavior qb){
		quackBehavior = qb;
	}
	
}
