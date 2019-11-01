package I_Visitor;

public interface IVisitorVet {
	public void visit(ConcreteGato cat);
	public void visit(ConcretePerro dog);
	public void visit(ConcreteCaballo horse);
}
