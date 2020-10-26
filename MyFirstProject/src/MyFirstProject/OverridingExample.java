package MyFirstProject;

public class OverridingExample {
	
	private int id;
	private String name;
	OverridingExample(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public boolean equals(Object o) {
		OverridingExample example = (OverridingExample) o;
		return id == example.id && name.equals(example.name);
	}
	
	
	@Override
	public String toString() {
		return "ID: " + id + "; Name: " + name;
	}
	
	public boolean equal(OverridingExample example) {
		return id == example.id && name == example.name;
	}
	
	public String tostring() {
		return "Name: " + name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverridingExample e1 = new OverridingExample(0, "oops");
		System.out.println("look:" + e1);
		System.out.println(e1.tostring());
	}

}
