package II_Adapter;

public class ConcreteAdapterTele implements IAdapter{

	AdapteeTele adaptee = new AdapteeTele();
	
	public ConcreteAdapterTele(AdapteeTele adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void clase() {
		adaptee.clase();
	}
	@Override
	public void precio() {
		adaptee.costo();
		
	}
	@Override
	public void tiempoDeVida() {
		adaptee.tiempoDeGarantia();
		
	}
	
	@Override
	public void show() {
		clase();
		precio();
		tiempoDeVida();
		System.out.println();
	}

}
