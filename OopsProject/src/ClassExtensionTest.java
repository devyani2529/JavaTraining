
public class ClassExtensionTest {
	public static void main(String args[]) {
		Doctor X=new  HeartSurgeon();
		//Surgeon X=new Surgeon ();
		//HeartSurgeon X=new HeartSurgeon();

		
		
//if(X instanceof Doctor) {
//	System.out.println("its doctor object");
//}
//else {
	//System.out.println("its not  doctor object");
//}
		
//ystem.out.println("------------");
	
//if( X instanceof Surgeon) {
//	System.out.println("its Surgeon object");
//}
//else {
//	System.out.println("its not  Surgeon object");
//}
		
//ystem.out.println("------------");	
	
//if( X instanceof HeartSurgeon) {
//	System.out.println("its HeartSurgeon object");
//}
//else {
//	System.out.println("its not HeartSurgeon object");
//}
		
	}
}
class Doctor{
	void diagnosis() {//exclusive function
		System.out.println("Doctor: is diagnosing....ENT checkup");
	}
	void prescribe() {
		System.out.println("Doctor: is prescribe....RGB pills");
		
	}
    void charging() {
    	System.out.println("Doctor: is charging...500rs");
    }
}
 class Surgeon extends Doctor{
	 void diagnosis() {
		 System.out.println("Surgeon: is diagnosis..CT scan/MRI scan");
	
	 }
	 void prescribe() {
		 System.out.println("Surgeon: is prescribing....expensive pills.");
		 
	 }
	 void  charging() {
		 System.out.println("Surgeon: is charging...1000rs");
		 
	 }
	 void  cut() {
		 System.out.println("Surgeon: is cutting...");
		 
	 }
	 void  stitch() {
		 System.out.println("Surgeon: is stitching...");
		 
	 }
 }
 class HeartSurgeon extends Surgeon{
	 void diagnosis() {
			 
 }
	 void prescribe() {
			System.out.println("HeartSurgeon: is prescribing...expensive pills....plus yoga..plus exercises");
		}
		void charge() {
			System.out.println("HeartSurgeon: is charging...3000/- ...");
		}
 }
 