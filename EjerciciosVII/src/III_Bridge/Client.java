package III_Bridge;

public class Client {
	public static void main(String[] args) {
		
		ConcreteImplementorEur eur = new ConcreteImplementorEur(12);
		ConcreteImplementorDol dol = new ConcreteImplementorDol(10);
		ConcreteImplementorBol bol = new ConcreteImplementorBol(15);
		
		ConcreteAbsAhorro ahorro = new ConcreteAbsAhorro(eur);
		ConcreteAbsCredito credito = new ConcreteAbsCredito(dol);
		ConcreteAbsPlazoFijo fijo = new ConcreteAbsPlazoFijo(bol);
		
		ahorro.showInfo();
		credito.showInfo();
		fijo.showInfo();
	}
}
