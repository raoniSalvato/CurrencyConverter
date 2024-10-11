package application;

import menu.Menu;
import service.CoinConversionService;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        CoinConversionService coinConversionService = new CoinConversionService();
        String resp = "";

        while (!Objects.equals(resp, "n")){
            menu.menu();
            coinConversionService.getConversions(menu);
            System.out.printf("Conversão realizada com sucesso: " + menu.getNameFirstCoin() + " -> " + menu.getNameSecundCoin() + " = %.2f%n", coinConversionService.getConvertedCoin());
            System.out.println("Dejesa continuar? (s/n)");
            resp = scanner.nextLine();
        }
        scanner.close();
    }
}