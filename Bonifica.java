import java.util.Scanner;

public class Bonifica {
	public static void main (String [] args){
		int funcionarios;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira a quantidade de funcionários que serão cadastrados ");
		funcionarios = scanner.nextInt();
		
		String[] nome = new String[funcionarios];
		double[] salarios = new double[funcionarios];
		double bonus = 0;
		
		for (int contador = 0; contador < funcionarios; contador++){
			
			System.out.println("Insira o nome do funcionario: ");
			nome[contador] = scanner.next();
			
			System.out.println("Insira o valor do salario: ");
			salarios[contador] = scanner.nextDouble();					
		}	
		
		scanner.close();
	
		for (int contador = 0; contador < funcionarios; contador++){
			if (salarios[contador] == 1000)
				bonus = salarios[contador]*0.20;	
			 else if (salarios[contador] >= 1000 && salarios[contador] < 2000) 
				bonus = salarios[contador]*0.10;	
			 else if (salarios[contador] >= 2000)
				bonus -= salarios[contador]*0.10;
				
			System.out.println("Funcionario: " + nome[contador]);
			System.out.println("Salario: " + salarios[contador]);
			System.out.println("Bonus/Desconto: " + bonus);	
			System.out.println("Salario liquido: " + (salarios[contador] + bonus));
} 
}
}
