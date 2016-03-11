
public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallarDuck();
		mallard.performQuack();
		mallard.performFly();
		mallard.display();
		mallard.setFlyBehavior(new FlyRocketPowered());
		mallard.performFly();
		
		System.out.println("========================");
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
		
		System.out.println("========================");
		
		Duck hunter = new Hunter();
		hunter.performQuack();
	}
}
