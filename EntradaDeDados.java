import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Nome:");
        String nome = entrada.nextLine();

        System.out.println("Peso:");
        int peso = entrada.nextInt();       
        
        System.out.println("Altura:");
        double altura = entrada.nextDouble();           

        double imc   = peso / (altura * altura);
        
        System.out.println(nome + " seu imc é " + imc);

        if(imc < 18.5){
            System.out.println("Abaixo do peso ideal");
        }else if(imc < 25){
            System.out.println("Peso ideal");
        }else if(imc < 30){
            System.out.println("Acima do peso");
        }else if(imc < 40){
            System.out.println("Obesidade grau 1 ou 2");
        }else{
            System.out.println("Obesidade grau 3");
            System.out.println("Muito cuidado com seu peso");
        }
    }
}
