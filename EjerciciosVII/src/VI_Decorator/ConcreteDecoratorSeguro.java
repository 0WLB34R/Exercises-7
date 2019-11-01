package VI_Decorator;

public class ConcreteDecoratorSeguro extends Decorator {
	public ConcreteDecoratorSeguro(Component component) {
		super(component);
	}

	@Override
	public void activate() {
		super.activate();
		System.out.println("Seguro habilitado: ");
		System.out.println("Seguro actual 30\n");
		MontoHandler.invoke().setTotal(MontoHandler.invoke().getTotal()-30);
	}

}
