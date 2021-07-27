
public class Main {

	public static void main(String[] args) {
		int a = 1;
		int b = a;
		
		System.out.println("Valor a: " + a + " valor b: " + b);
		a = 2;
		System.out.println("Valor a: " + a + " valor b: " + b);
		//Aqui vemos que em um tipo primitivo, o valor é copiado a partir da atribuição do momento
		
		MeuObjeto objeto1 = new MeuObjeto(20);
		MeuObjeto objeto2 = objeto1;
		
		System.out.println("objeto1: " + objeto1 + " objeto2: " + objeto2);
		objeto2.setNum(40);
		System.out.println("objeto1: " + objeto1 + " objeto2: " + objeto2);
		//Aqui vemos que objetos, apontam para referência, ou seja, onde ficam guardadas as informações
		
	}

}
