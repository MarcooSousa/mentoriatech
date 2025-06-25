package praticas;

import java.util.Scanner;

public class Pratica2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a temperatura em Celsius
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        // Converte para Fahrenheit e Kelvin
        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;

        // Exibe os resultados formatados
        System.out.printf("Temperatura em Celsius: %.2f °C\n", celsius);
        System.out.printf("Temperatura em Fahrenheit: %.2f °F\n", fahrenheit);
        System.out.printf("Temperatura em Kelvin: %.2f K\n", kelvin);

        scanner.close();
    }
}
