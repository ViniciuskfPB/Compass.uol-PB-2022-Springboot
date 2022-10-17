import java.util.Scanner;

public class Perguntas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int contador = 0;
        int erros = 0;
        
        String nome = "Digite seu nome: ";       
        System.out.println(nome);
        String seuNome = scanner.nextLine();
        
        String primeira = "O gato do filme Shrek usava?";       
        System.out.println(primeira);
        System.out.println("[1] Luvas");
        System.out.println("[2] Botas");
        System.out.println("Digite o numero: ");
        String resposta = scanner.nextLine();
        if (resposta.equals("2")) {
            System.out.println("Acertou!");
            contador = contador + 1;
        }else {
            System.out.println("Errou");
            erros = erros + 1;
        }
        
        String segunda = "Qual desses usou uma armadura do homem de ferro?";       
        System.out.println(segunda);
        System.out.println("[1] Groot");
        System.out.println("[2] Hulk");
        System.out.println("Digite o numero: ");
        String respostaDois = scanner.nextLine();
        if (respostaDois.equals("2")) {
            System.out.println("Acertou!");
            contador = contador + 1;
        }else {
            System.out.println("Errou");
            erros = erros + 1;
        }
        
        String terceira = "Quem fez o Fury ficar sem o olho??";       
        System.out.println(terceira);
        System.out.println("[1] Um Flerken");
        System.out.println("[2] Um Gato");
        System.out.println("Digite o numero: ");
        String respostaTres = scanner.nextLine();
        if (respostaTres.equals("1")) {
            System.out.println("Acertou!");
            contador = contador + 1;
        }else {
            System.out.println("Errou");
            erros = erros + 1;
        }
            
        String[] guardaRes = {primeira,resposta,segunda,respostaDois,terceira,respostaTres};
        
        
        System.out.println("Nome: "+ seuNome);
        System.out.println("Acertos: "+ contador);
        System.out.println("Erros: "+ erros);
}
}