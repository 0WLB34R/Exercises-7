package I_Visitor;

public class ConcretePerro implements IAnimal {

	private Disease disease;

	public Disease getDisease() {
		return disease;
	}

	public void setDisease(Disease disease) {
		this.disease = disease;
	}

	@Override
	public void accept(IVisitorVet visitor) {
		visitor.visit(this);
	}

}
