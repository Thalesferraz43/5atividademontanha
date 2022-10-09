import java.util.Scanner;
public class App { 
    public static void main(String []args) {
        double valor, result;
        Scanner sc = new Scanner(System.in);
        System.out.print("digite o valor em metro");
        valor = sc.nextDouble();
        result = valor/100;
        System.out.printf("em centímetros é: %.2f",result);
    }
}




