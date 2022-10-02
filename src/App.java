import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        double raio, area;
        double pi = 3.141592;

        System.out.println("Digite o raio do circulo que ira ser convertido.");
        raio = console.nextDouble();
        area = pi * (raio * raio);

        System.out.println("A area do circulo é : " + area);
        console.close();

    }
}
