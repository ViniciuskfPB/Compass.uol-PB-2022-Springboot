import java.util.Scanner;

import java.time.LocalDateTime;

public class Hora {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        System.out.println("Usuario: ");
        String usuario = scanner.nextLine();
        
        System.out.println("Senha: ");
        String senha = scanner.nextLine();
    
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();
                
        if(usuario.equals("Vini") && senha.equals("123")){
            System.out.printf("Usuario %s logado com sucesso.", usuario);
            
            
            if (agora.getHour() >= 6 && agora.getHour() < 12) {
                saudacao = "Bom Dia!";
            } else if (agora.getHour() >= 12 && agora.getHour() < 18) {
                saudacao = "Boa Tarde!";
            } else if (agora.getHour() >= 18 && agora.getHour() < 24){
                    saudacao = "Boa Noite!";
            } else {
                saudacao = "Boa Madrugada!";
            }
            System.out.printf(saudacao.toUpperCase());
           
        }else{
            System.out.println("Usuario e/ou senha incorretos");
        }      
	}
}
