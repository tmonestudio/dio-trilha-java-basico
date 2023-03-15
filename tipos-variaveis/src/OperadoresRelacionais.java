public class OperadoresRelacionais {
    public static void main(String[] args) {
        String nomeUm = "Gleyson";
        //String nomeDois = "Gleyson";
        String nomeDois = new String("Gleyson");

        System.out.println(nomeUm.equals(nomeDois) );



        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if (numero1 < numero2){
            System.out.println("a nossa condiçao e verdadeira");
        }

        /*if (numero1 == numero2){
            System.out.println("a nossa condiçao e verdadeira");
        }*/

        System.out.println("numeroum e igual a numerodois? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("numeroum e diferente a numerodois? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("numeroum e maior a numerodois? " + simNao);



    }
}
