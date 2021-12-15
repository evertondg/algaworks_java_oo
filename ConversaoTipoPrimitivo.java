public class ConversaoTipoPrimitivo {
    public static void main(String[] args) {
        // long x = 9300000035L;
        // // casting
        // int y = (int) x;
        // System.out.println(y);

        /** Não precisa do casting pq o int é menor que o long */
        // int y = 102344;
        // long x = y;
        // System.out.println(x);

        // double a = 20.5;
        // float b = (float) a;
        // System.out.println(a);        

        /** Não precisa do casting pq o double é menor que o float */
        // double c = 20.5;
        // float d = c;
        // System.out.println(d);          


        // double largura = 100;
        // int tamanho = (int) largura;
        // System.out.println(tamanho);

        /** O valor ficara truncado */
        double largura = 100.37;
        int tamanho = (int) largura;
        System.out.println(tamanho);        
    }
}
