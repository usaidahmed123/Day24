package day24;



abstract class ShopAcc {
	
	private int accNo;
	private String accNm;
	private float charges;
	
	
	public void setNo(int i) {       // getter and setter methods for private variable
		accNo = i;
	}
	
	public int getNo( ) {
		return accNo;
	}
	
	public void setNm(String j) {
		accNm = j;
	}
	
	public String getNm( ) {
		return accNm;
	}
	
	public void setch(float k) {
		charges = k;
	}
	
	public float getch( ) {
		return charges;
	}                                  // getter and setter end;
	
	
	abstract public void bookProduct(); 
		
	
	public void items()
	{
		
	}
		
	
	abstract public String toString();
	
}



abstract class PrimeAcc extends ShopAcc {
	
	private boolean isPrime;
	private float deliveryCharges;
	
	
	public void setPr(boolean l) {       // getter and setter methods for private variable
		isPrime = l;
	}
	
	public boolean getPr( ) {
		return isPrime;
	}
	
	
	public void setd(float m) {       
		deliveryCharges = m;
	}
	
	public float getd( ) {
		return deliveryCharges;
	}                                  // getter and setter methods end;
	
	
	abstract public void bookProduct();
	
	
	abstract public String toString();
	
}



abstract class NormalAcc extends ShopAcc {
	
	private float deliveryCharges;
	
	public void setd(float n) {       // getter and setter methods for private variable
		deliveryCharges = n;
	}
	
	public float getd( ) {
		return deliveryCharges;
	}
	
	
    abstract public void bookProduct();
	
	
	abstract public String toString();
	
}



class GSPrimeAcc extends PrimeAcc {
	
	static private float Charges; 
	
	public void setd(float o) {       // getter and setter methods for private variable
		Charges = o;
	}
	
	public float getd( ) {
		return Charges;
	}
	
	
	public void bookProduct() {
		
	}
	
	
	public String toString() {
		String demo = "demo";
		return demo;
	}
	
	
}



class GSNormalAcc extends NormalAcc {
	
	public void bookProduct() {
		
	}
	
	
	public String toString() {
		String demo2 = "demo_2";
		return demo2;
	}
	
}



// class GSShopFactory extends ShopFactory  {
	
/*	public  getNewPrimeAcc() {
		
		
		
	}     
	
	
	public  getNewNormalAcc() {
		
	
		
	} 
	
	
	
}  */



abstract public class Shopfactory {
	
	abstract public PrimeAcc getNewPrimeAcc();
	
	
	abstract public NormalAcc getNewNormalAcc();
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}