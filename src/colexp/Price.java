package colexp;

public class Price {

	private String item;
	private int price;
	
	public Price(String item, int pr) {
		this.item = item;
		this.price = pr;
	}
	public int hashCode() {
		System.out.println("In hashcode");
		int hashcode = 0;
		hashcode = price*20;
		hashcode += item.hashCode();
		return hashcode;
	}
//	public boolean equals(Object obj) {
//		System.out.println("In equal");
//		if(obj instanceof Price) {
//			Price pp = (Price) obj;
//			
//		}
//	}
}
