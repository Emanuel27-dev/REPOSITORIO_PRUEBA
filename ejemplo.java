
public class ejemplo{
	public static void main(String[] args){
		int variable = 10;


		switch(variable){
			case 10:
				variable = variable + 19;
				break;
			default:
			System.out.println("No ingresaste el numero correcto");
			break;
		}

		System.out.print(variable);
	}		
}
