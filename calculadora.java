public class calculadora{
	public static void main(String[] args){
		if (args.length!=3){
			System.out.println("La calculadora necesita 3 parametros");
	 		System.out.println("USO: calculadora");
			System.exit(-1);
		}
	String operacion=args[0];
	double num1= Double.parseDouble(args[1]);
	double num2= Double.parseDouble(args[2]);

	double resultado = switch(operacion){
		case"add"->num1+num2;
		case"sub"->num1-num2;
		case"mul"->num1*num2;
		case"div"->num1/num2;
		default -> throw new RuntimeException("NOoooo");
	};
	System.out.printf("%.2f %s %.2f = %.2f\n",num1,operacion,num2, resultado);

	}
}
