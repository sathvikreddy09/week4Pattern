package week4Pattern;

public class TestBattery {

	public static void main(String[] args) {
	Battery collection = new Brands();
		
		Iterator iterator = collection.getBatteries();
		
	
		while (iterator.hasNext()) {
			Object object = iterator.next();
			String name =(String)object;
			System.out.println("Different Battery Brands : "+name);
		}
	}
}
