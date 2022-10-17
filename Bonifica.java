import java.util.Scanner;

public class Bonifica {
	public static void main (String [] args){
		int funcionarios;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira a quantidade de funcionários que serao cadastrados ");
		funcionarios = scanner.nextInt();
		
		String[] nome = new String[funcionarios];
		double[] salarios = new double[funcionarios];
		double bonus = 0;
		
		for (int cont = 0; cont < funcionarios; cont++){
			
			System.out.println("Insira o nome do funcionario: ");
			nome[cont] = scanner.next();
			System.out.println("Insira o valor do salario: ");
			salarios[cont] = scanner.nextDouble();					
		
		}
		scanner.close();
	
		for (int cont = 0; cont < funcionarios; cont++){
			if (salarios[cont] == 1000)
				bonus = salarios[cont]*0.20;	
			 else if (salarios[cont] >= 1000 && salarios[cont] < 2000) 
				bonus = salarios[cont]*0.10;	
			 else if (salarios[cont] >= 2000)
				bonus -= salarios[cont]*0.10;
				
			System.out.println("Funcionario: " + nome[cont]);
			System.out.println("Salario: " + salarios[cont]);
			System.out.println("Bonus ou Desconto: " + bonus);	
			System.out.println("Salario liquido: " + (salarios[cont] + bonus));
} 
}
}
