package I_Visitor;

public class Client {

	public static void main(String[] args) {
		ConcreteCaballo horse = new ConcreteCaballo();
		ConcreteGato cat = new ConcreteGato();
		ConcretePerro dog = new ConcretePerro();
		
		horse.setDisease(Disease.DISEASE_A);
		cat.setDisease(Disease.DISEASE_B);
		dog.setDisease(Disease.DISEASE_C);
		
		ConcreteVisitorVet vet = new ConcreteVisitorVet();
		
		horse.accept(vet);
		cat.accept(vet);
		dog.accept(vet);

	}

}
