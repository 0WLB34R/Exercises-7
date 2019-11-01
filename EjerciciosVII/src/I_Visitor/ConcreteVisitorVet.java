package I_Visitor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConcreteVisitorVet implements IVisitorVet {

	@Override
	public void visit(ConcreteGato cat) {

		System.out.print("Vet applying treatment to cat for: ");
		switch (cat.getDisease()) {
		case DISEASE_A:
			System.out.println("Disease A");
			break;
		case DISEASE_B:
			System.out.println("Disease B");
			break;
		case DISEASE_C:
			System.out.println("Disease C");
			break;
		}
		getTime();
	}

	@Override
	public void visit(ConcretePerro dog) {
		System.out.print("Vet applying treatment to dog for: ");
		switch (dog.getDisease()) {
		case DISEASE_A:
			System.out.println("Disease A");
			break;
		case DISEASE_B:
			System.out.println("Disease B");
			break;
		case DISEASE_C:
			System.out.println("Disease C");
			break;
		}
		getTime();
	}

	@Override
	public void visit(ConcreteCaballo horse) {
		System.out.print("Vet applying treatment to horse for: ");
		switch (horse.getDisease()) {
		case DISEASE_A:
			System.out.println("Disease A");
			break;
		case DISEASE_B:
			System.out.println("Disease B");
			break;
		case DISEASE_C:
			System.out.println("Disease C");
			break;
		}
		getTime();
	}

	public void getTime() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Date and Time of visit: " + dtf.format(now)+"\n");
	}

}
