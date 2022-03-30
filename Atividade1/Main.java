import java.util.Scanner;
public class Main {

   /* Sobre mim:
   Meu nome e Enzo Rangel Dias Lima, tenho 14 e curto muito jogar e tecnologias eletronicas em geral, porem sou mais chegado a
   softwares e programaçao, e sonho trabalhar na area algum dia.
   */

   public static void main(String[] args) {
      
      //System.out.println("Hello World");
      
      //Codigo da situação problema
       
    Scanner input = new Scanner(System.in);
    
    System.out.println("Bem vindo a definidor de area e perimetro de um retangulo :)");
    System.out.println("Digite a base de seu retangulo em centimetros:");
    int base = input.nextInt(); //input do valor da base
    System.out.println("Digite a altura de seu retangulo em centimetros");
    int alt = input.nextInt(); //input no valor da altura
    System.out.println("O perimetro do retangulo e: " + ((base*2) + (alt*2)) + "cm");
    System.out.println("A area do retangulo e: " + base*alt + "cm²");
    
    input.close();
   }
}
