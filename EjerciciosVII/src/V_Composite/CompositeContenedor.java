package V_Composite;
import java.util.ArrayList;

public class CompositeContenedor extends Component{

	private ArrayList<Component> list = new ArrayList<>();

	public CompositeContenedor(String name) {
		setName(name);
	}
	
	@Override
	public void operation() {
		
		System.out.println(this.getName());
		for (Component comp : list) {
			comp.operation();
			this.setPrice(comp.getPrice()+this.getPrice());
		}
		System.out.println("Price: "+this.getPrice());

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
