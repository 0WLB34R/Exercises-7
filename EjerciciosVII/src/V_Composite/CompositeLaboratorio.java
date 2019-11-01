package V_Composite;
import java.util.ArrayList;

public class CompositeLaboratorio extends Component{

	private ArrayList<Component> list = new ArrayList<>();

	public CompositeLaboratorio(String name) {
		this.setName(name);
	}
	
	@Override
	public void operation() {
		
		System.out.println("\t"+this.getName());
		for (Component comp : list) {
			comp.operation();
			this.setPrice(comp.getPrice()+this.getPrice());
		}
		System.out.println("\tPrice: "+this.getPrice());

	}

	@Override
	public void add(Component component) {
		list.add(component);

	}

	@Override
	public void remove(Component component) {
		list.remove(component);

	}

}
