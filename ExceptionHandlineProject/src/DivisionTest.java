
public class DivisionTest {

	public static void main(String[] args) {
		System.out.println("BEGIN OF MAIN");
		try {
			Calculator.divide(100,30);
		}
		catch(Exception e){
			System.out.println("Exception :"+e);
		}
		
		try {
			Calculator.divide(50,30);
		}
		catch(Exception e1){
			System.out.println("Exception :"+e1);
		}
		
		try {
			Calculator.divide(70,30);
		}
		
		catch(Exception e2){
		System.out.println("Exception :"+e2);
		}
		}

}
class Calculator{
	static void divide(int num,int demo) throws Exception {
		System.out.println("BEGIN OF DIVIDE");
		System.out.println("Numerator :"+num);
		System.out.println("Denominator:"+demo);
		System.out.println("Trying to divide "+num  +demo);
		
		 
		int division  = num / demo ;
		System.out.println("Division    : "+division);
		if(10>50){
			throw new Exception("some problem....");
		}
		
		System.out.println("END of divide\n");
	}
}
