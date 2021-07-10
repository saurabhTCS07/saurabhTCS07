package singleton;

public class TestLogger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger obj1 =  Logger.getInstance();
		Logger obj2 =  Logger.getInstance();
		
		//Logger obj3 = new Logger(); // can't create
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		if(obj1.hashCode() == obj2.hashCode()) {
			System.out.println("Sigleton implemented");
		}

	}

}
