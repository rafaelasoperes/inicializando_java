import java.util.Arrays;

public class aula5 {

    public static void main(String[] args) {
        
        //Exemplo quando só a quantidade do array está definido;
        //String[] letras = new String [5];
        //letras[0] = "A";
        //letras[1] = "B";
        //letras[2] = "C";
        //letras[3] = "J";
        //letras[4] = "X";

        //for (int i = 0; i < letras.length; i++) {
        //    System.out.println(letras[i]);
        //}

        //exemplo com o array ja definido
        String[] letras = {"A", "B", "C", "J", "X"};
        for (int i = 0; i <letras.length; i++) {
            System.out.println(letras[i]);
        }

        System.out.println(Arrays.toString(letras));

    }
    
}
