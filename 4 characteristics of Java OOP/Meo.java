package entity;

public class Meo extends DongVat {
	public Meo(String ten) {
		super(ten);
		System.out.println("Contructor Meo create");
		
	}
    public void keu() {
    	System.out.println("Con meo " + this.ten + " dang keu meow meow meow ! ");
    }
    @Override
    public void an() {
    	System.out.println("Meo" + this.ten +"dang an ca ran");
    }
}
