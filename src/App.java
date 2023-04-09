import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        double altura;
        double peso;

        Scanner input = new Scanner(System.in);
        System.out.print("Informe sua altura: ");
        altura = input.nextDouble();
        input.nextDouble();

         peso = (72.7 * altura) - 58;
         System.out.println("O seu peso ideal é : " + peso);

    }
    
}