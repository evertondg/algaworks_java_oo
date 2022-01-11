import java.util.Scanner;

public class OperadoresLogicos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = entrada.nextLine();

        System.out.println("Peso: ");
        double peso = entrada.nextDouble();

        System.out.println("Altura: ");
        double altura = entrada.nextDouble();

        System.out.println("Sexo (1 para 'M' ou outro numero para 'F'");
        char sexo = entrada.nextShort() == 1 ? 'M': 'F';

        double imc = peso / (altura * altura);

        
            if((sexo == 'F' && imc < 19.1) || (sexo == 'M' && imc < 20.7)) {
                System.out.println("Abaixo do peso ideal");
            }else if((sexo == 'F' && imc >= 19.1 && imc <= 25.8) || (sexo == 'M' && imc >= 20.7 && imc <= 26.4)){
                System.out.println("Peso ideal");
            }else if((sexo == 'F' && imc >= 25.9 && imc <= 27.3) || (sexo == 'M' && imc >= 26.5 && imc <= 27.8)){
                System.out.println("Acima do peso");
            }else if((sexo == 'F' && imc >= 27.4 && imc <= 32.3) || (sexo == 'M' && imc >= 27.9 && imc <= 31.1)){
                System.out.println("Obesidade grau 1 ou 2");
            }else{
                System.out.println("Obesidade grau 3");
                System.out.println("Muito cuidado com seu peso");
            }
    }
}
