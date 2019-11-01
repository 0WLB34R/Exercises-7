package VI_Decorator;

public class Client {
	public static void main(String[] args) {
		Component cuenta = new ConcreteComponentCuenta("Ricardo",40);
		cuenta = new ConcreteDecoratorSeguro(cuenta);
		cuenta = new ConcreteDecoratorBancaInternet(cuenta);
		cuenta = new ConcreteDecoratorPromo(cuenta);
		cuenta.activate();
		System.out.println();
		MontoHandler.invoke().showBalance();
	}
}
