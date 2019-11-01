package VI_Decorator;

public class ConcreteDecoratorBancaInternet extends Decorator {
	public ConcreteDecoratorBancaInternet(Component component) {
		super(component);
	}

	@Override
	public void activate() {
		super.activate();
		System.out.println("Banca por Internet Activa\n");
	}
	
	

}
