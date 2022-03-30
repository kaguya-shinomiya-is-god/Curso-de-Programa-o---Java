import java.util.Scanner;

public class retangulo {
        public static void main (String[] args){
      
            float base;
            float altura;
            //criei as variáveis e falei qual tipo de caractere ela aceitava, no caso, números decimais.

            Scanner input = new Scanner(System.in);

            System.out.println("Digite a base do retângulo:    ");
            base = input.nextFloat();
            //pedi pra quem tá acessando colocar qual é a base do retângulo e coloquei um espaço pra ele digitar
         
            System.out.println ("Digite a altura do retângulo:    ");
            altura = input.nextFloat();
            //pedi pra quem tá acessando colocar qual é a altura do retângulo e coloquei um espaço pra ele digitar

            System.out.println ("A área desse retângulo é: " + (base * altura) + " e o seu perímetro é: " + (base * 2 + altura * 2));
            
            /*coloquei um texto padrão pra ficar mais organizado, concatenei com a conta que vai ser feita automaticamente pelo programa,
             se adaptando com os valores que colocarem, coloquei outra frase e a conta do perímetro que também será feita automaticamente.*/
                }
}