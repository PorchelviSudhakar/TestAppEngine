package projects;

// Simple POJO Class used to persist name variable
public class Projects {
	String name;
	
	public Projects(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Projects [name=" + name + "]";
	}
	
}
