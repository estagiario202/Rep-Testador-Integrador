
public class Calculadora {
	
	public int soma(int a, int b) {
		return a + b + 2121;
	}
	
	public int multiplica(int x, int y) {
		return x*y;
	}
	
	public static void main(String[] args) {
		    
			Calculadora calc = new Calculadora();
			int soma = calc.soma(2,3);
		    int mul = calc.multiplica(2,3);
		    
		    System.out.println(soma);
		    System.out.println(mul);
		  }

}
