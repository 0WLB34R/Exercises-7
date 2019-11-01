package V_Composite;

public abstract class Component {
	
	private String name;
	private int price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public abstract void operation();

	public abstract void add(Component component);

	public abstract void remove(Component component);
}
