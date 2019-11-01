package II_Adapter;

public class Client {

	public static void main(String[] args) {
		
		AdapteeFridge fridge = new AdapteeFridge();
		AdapteeTele tele = new AdapteeTele();
		AdapteeWasher washer = new AdapteeWasher();
		ConcreteElecAComputer comp = new ConcreteElecAComputer();
		ConcreteElecAPhone phone = new ConcreteElecAPhone();
		ConcreteElecATablet tablet = new ConcreteElecATablet();
		
		comp.show();
		phone.show();
		tablet.show();
		
		ConcreteAdapterTele teleAdapter = new ConcreteAdapterTele(tele);
		ConcreteAdapterFridge fridgeAdapter = new ConcreteAdapterFridge(fridge);
		ConcreteAdapterWasher washerAdapter = new ConcreteAdapterWasher(washer);
		
		teleAdapter.show();
		fridgeAdapter.show();
		washerAdapter.show();


	}

}
