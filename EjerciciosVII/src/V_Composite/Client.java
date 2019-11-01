package V_Composite;

public class Client {
	public static void main(String[] args) {
		CompositeLaboratorio labA = new CompositeLaboratorio("Lab A");
		CompositeLaboratorio labB = new CompositeLaboratorio("Lab B");
		CompositeLaboratorio labC = new CompositeLaboratorio("Lab C");
		
		CompositeContenedor container = new CompositeContenedor("Container");
		
		labA.add(new LeafComputer("Comp A"));
		labA.add(new LeafComputer("Comp B"));
		labA.add(new LeafComputer("Comp C"));
		
		labB.add(new LeafComputer("Comp D"));
		labB.add(new LeafComputer("Comp E"));
		labB.add(new LeafComputer("Comp F"));
		
		labC.add(new LeafComputer("Comp G"));
		labC.add(new LeafComputer("Comp H"));
		labC.add(new LeafComputer("Comp I"));
		
		container.add(labA);
		container.add(labB);
		container.add(labC);
		
		
		container.operation();
		
		System.out.println("\nPrice of container: "+container.getPrice());
	}
}
