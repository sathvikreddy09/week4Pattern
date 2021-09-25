package week4Pattern;

public class Brands implements Battery {

String listOfBrands[] = {"Rayovac","Energizer","Duracell","Eveready","Panasonic"};
	
	@Override
	public Iterator getBatteries() {
		return new Itr();
	}
	

	private class Itr implements Iterator{
 
		int index =0;
		
		@Override
		public boolean hasNext() {
			if(index < listOfBrands.length)
				return true;
			return false;
		}
 
		@Override
		public Object next() {
			if(this.hasNext())
				return listOfBrands[index++];
			return null;
		}
	}

}
