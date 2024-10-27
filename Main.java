import java.util.Scanner;
class Main {
  public static void main(String[] args) {
     //===============VARIAVEIS==============//
        double aux = 0;
        double numero;
        double potencia = 0;
        double aproximacao = 0;
        double divisao0, media, divisao1, result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero");
        numero = in.nextDouble();
        //===============NEGATIVO-IMPOSSIVEL=========//
        if (numero <= 0) {
            System.out.println("A raiz de 0 e 0");
          //=============APROXIMAÇÃO================//
        } else { 
            while ((potencia * potencia) < numero) {
                aux = potencia;
                potencia = potencia + 0.0001;
                aproximacao = potencia;
            }
            if ((potencia * potencia) > numero) {
                aproximacao = aux;
            }
            //==========Metodo Babilonico============//
            divisao0 = numero / aproximacao;
            media = (aproximacao + divisao0) / 2;
            divisao1 = numero / media;
            result = (media + divisao1) / 2;
            System.out.println("o valor aproximado da raiz eh de " + result);
        }
    }
}