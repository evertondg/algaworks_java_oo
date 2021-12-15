public class PromocaoAritimetica {
    public static void main(String[] args) {
        int x = 10;
        long y = 5;
        /** int + long a variavel x é promovida a long. long + long = long e estamos tentando colocar esse resultado long em uma variavel do tipo int, logo o erro  */
        // int z = x + y; 
        long z = x + y;
        System.out.println(z);


        long a = 10;
        float b = 9.34f;
        /** Neste caso o a variavel a é promovida a float e o resultado da operação é float, se tentar colocar na variavel long podemos perder precisão */
        // long c = a * b;
        float c = a * b;
        System.out.println(c);



        int d = 3;
        int e = 2;
        /* neste caso d,e são inteiros, o resultado da operacao de dois inteiros é um inteiro, logo ele retorna só o inteiro do resultado 1.5 só vai funcionar se alterar alguma das variaveis para float seja em cima ou via casting como embaixo */
        float f = d / (float) e;
        System.out.println(f);

    }
}
