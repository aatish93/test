package car;

public class car {
	engine e1;
	brake b1;
	public car(int cap,int i) {
		engine e=new engine();
		brake b=new brake();
		e.setCapacity(cap);
		b.setI(i);
		this.e1=e;
		this.b1=b;
	}
	public int getCar(){
		return this.e1.capacity;
	}
}
