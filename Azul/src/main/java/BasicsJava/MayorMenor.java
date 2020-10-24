package BasicsJava;

public class MayorMenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero1=30;
		int numero2=6;
		
		
		if(numero1>=numero2) {
			
			if(numero1==numero2) {
				
				System.out.println("el numero 1 " + numero1 + "y el numero 2: " + numero2 + "son iguales");
				
				
			}//end if
			
			else {
				System.out.println("el numero 1 es mayor " + numero1 + "que el numero 2: " + numero2);
			}
		}//end
		
		else {
			System.out.println("el numero 2: " + numero2 + "es mayor que el numero 1: " + numero1);
			
		}
		
		}

}
