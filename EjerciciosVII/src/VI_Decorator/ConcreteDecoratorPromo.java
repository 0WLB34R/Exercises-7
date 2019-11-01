package VI_Decorator;

public class ConcreteDecoratorPromo extends Decorator {
	public ConcreteDecoratorPromo(Component component) {
		super(component);
	}

	@Override
	public void activate() {
		super.activate();
		System.out.print("Promocion:...");
		if((int)(Math.random()*2+1 )== 2) {
			System.out.println("Gano!");
			System.out.println("Su saldo fue duplicado\n");
			MontoHandler.invoke().setTotal(MontoHandler.invoke().getTotal()*2);
		}else {
			System.out.println("Perdio...\n");
		}
	}
}
