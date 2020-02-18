package factorial;

public class Factorial {

		public int factorial(int num){
			int factorial= num;
			
			for (int i = 1; i < num;i++) {
				factorial= factorial*(num-i);
			
				
		}
			
		return factorial;
		

}
}
