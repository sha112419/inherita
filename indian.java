package inheritance1;

public class indian  extends bank{
	int rateofinterest() {
		return 5;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	bank s ;
	s=new indian();
	System.out.println(s.rateofinterest());
	s=new hdfc();
	System.out.println(s.rateofinterest());
	s=new sbi();
    System.out.println("SBI INTERSET IS:"+s.rateofinterest());
   
  }


}
