package menu;

import java.util.Scanner;

public class Menu {

    private String nameFirstCoin;
    private String nameSecundCoin;
    private double valueToConvert = 0;
    Scanner scanner = new Scanner(System.in);

    public void menu(){
        System.out.println("------------------------------------------------");
        System.out.println("Seja bem-vindo/a ao Conversor de Moeda");
        System.out.println("Digite o nome da moeda base: ");
        nameFirstCoin = scanner.nextLine().toUpperCase();
        System.out.println("Digite o nome da moeda a ser convertida:");
        nameSecundCoin = scanner.nextLine().toUpperCase();
        System.out.println("Digite o valor a ser convertido: ");
        valueToConvert = scanner.nextDouble();
        scanner.nextLine();
    }

    public String getNameFirstCoin() {
        return nameFirstCoin;
    }

    public String getNameSecundCoin() {
        return nameSecundCoin;
    }

    public double getValueToConvert() {
        return valueToConvert;
    }

}
