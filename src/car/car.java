package car;

public class car {
	engine e1;
	
	public car(int cap) {
		engine e=new engine();
		e.setCapacity(cap);
		this.e1=e;
	}
	public int getCar(){
		return this.e1.capacity;
	}
}
