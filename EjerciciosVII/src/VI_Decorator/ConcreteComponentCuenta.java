package VI_Decorator;

public class ConcreteComponentCuenta implements Component{
	private String nombre;
	private int monto;
	
	public ConcreteComponentCuenta(String nombre, int monto) {
		this.nombre = nombre;
		this.monto = monto;
		MontoHandler.invoke().setTotal(monto);
	}


	@Override
	public void activate() {
		System.out.println("Nombre de Cuenta: "+nombre);
		System.out.println("Monto inicial: "+monto+"\n");
	}

}
