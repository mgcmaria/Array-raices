
public class ArrayRaices {
	
	public static void main(String[] args) {
	{
		int [] numero = new int [10];
		double [] raiz = new double [10];
		int i;
		
		for (i=0; i<numero.length; i++)
				{
					numero[i]=i+1;
					raiz[i]=Math.sqrt(numero[i]);
					System.out.println(numero[i] + " : " + raiz [i]);	
				}
		System.out.println("---------------");	
		
		int [] numero1 = new int [10];
		
		for (i=0; i<numero.length; i++)
		{
			numero1[i]=i+1;
			raiz[i]=Math.sqrt(numero[i]);
			System.out.println(numero[i] + " : " + raiz [i]);
}
}
}
}
