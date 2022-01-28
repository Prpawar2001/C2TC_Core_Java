class College{
	int id = 2021;
	void clgid() {
		System.out.println("College ID is " + id);
	}	
}

class Computer extends College {
	void compid() {
		int idext = 10;
		System.out.println("Computer Department ID is " + id + idext);
	}
}

class Mechanical extends College {
	void mechid() {
		int idext = 20;
		System.out.println("Mechanical Department ID is " + id + idext);
	}
}

class Civil extends College {
	
	void civilid() {
		int idext = 30;
		System.out.println("Civil Department ID is " + id + idext);
	}
}

public class Hierarchical1 {

	public static void main(String[] args) {
		Computer co = new Computer();
		Mechanical m = new Mechanical();
		Civil ci = new Civil();
		co.clgid();
		co.compid();
		m.clgid();
		m.mechid();
		ci.clgid();
		ci.civilid();
	}
}
