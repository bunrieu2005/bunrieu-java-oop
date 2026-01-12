package entity;

public abstract class DongVat {
   protected String ten;
   public DongVat(String ten) {
	   this.ten=ten;
	   System.out.println("Contrucstor dong vat create !");
   }
   
   public abstract void an();
}
