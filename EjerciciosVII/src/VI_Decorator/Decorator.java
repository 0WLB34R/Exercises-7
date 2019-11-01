package VI_Decorator;

public abstract class Decorator implements Component{
	
	private Component component;
	
	
	public Decorator(Component component) {
		this.component = component;
	}
	
	public void activate() {
		component.activate();
	}
}
