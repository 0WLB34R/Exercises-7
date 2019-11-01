package V_Composite;

public class LeafComputer extends Component {

	public LeafComputer(String name) {
		this.setName(name);
		this.setPrice(100);
	}

	@Override
	public void operation() {
		System.out.println("\t\t"+getName()+": " + getPrice());

	}

	@Override
	public void add(Component component) {
		System.out.println("Not applicable on Computer");

	}

	@Override
	public void remove(Component component) {
		System.out.println("Not applicable on Computer");

	}

}
