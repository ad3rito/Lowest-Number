import java.util.Scanner;

class MenorNumero {
    public static void main(String[] args){
        double num1,num2,num3,num4,num5,soma;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o numero 1 : ");
        num1 = entrada.nextDouble();

        System.out.println("Digite o numero 2 : ");
        num2 = entrada.nextDouble();

        System.out.println("Digite o numero 3 : ");
        num3 = entrada.nextDouble();

        System.out.println("Digite o numero 4 : ");
        num4 = entrada.nextDouble();

        System.out.println("Digite o numero 5 : ");
        num5 = entrada.nextDouble();

        if( num1 <= num2 && num1 <= num3 && num1 <= num4 && num1 <= num5)
        System.out.println(num1 + " foi o menor numero introduzido pelo utilizador.");

    else if (num2 <= num1 && num2 <= num3 && num2 <= num4 && num2 <= num5)
        System.out.println(num2 + " foi o menor numero introduzido pelo utilizador.");

    else if (num3 <= num1 && num3 <= num2 && num3 <= num4 && num3 <= num5)
        System.out.println(num3 + " foi o menor numero introduzido pelo utilizador.");

    else if (num4 <= num1 && num4 <= num2 && num4 <= num3 && num4 <= num5)
        System.out.println(num4 + " foi o menor numero introduzido pelo utilizador.");
        
    else
        System.out.println(num5 + " foi o menor numero introduzido pelo utilizador.");


    }
}