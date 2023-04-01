public class Operadores {

    public static void main (String[] args) {
        int numero = 5;

        //x repetição 
        numero ++;
        //numero = numero =1;
        System.out.println(numero);
        
        //inversão verificação logica.
        boolean variavel = false;

        variavel = !variavel;

        System.out.println(! variavel);

        int a,b;

        a = 5;
        b = 6;
        // operacdor ternario.
        String  resultado= a==b ?"verdadeiro" : "falso";

        //if(a==b)
         //resultado = "verdadeiro";
        //else 
         //resultado = "falso";
         
        // Operadores logicos.
        System.out.println(resultado);

        Boolean condicao1 = true;

        boolean condicao2 = false;

        if(condicao1 && ( 7 > 4 )){
            System.out.println("as duas condições são verdadeiras");
        }

        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }

        System.out.println("fim");



    }

}

    

