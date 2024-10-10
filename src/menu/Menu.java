import service.CoinConversionService;

import java.util.Scanner;

public class Menu {

    private static final String option1 = "Dólar -> Peso argentino";
    private static final String option2 = "Peso argentino -> Dólar";
    private static final String option3 = "Dólar -> Real brasileiro";
    private static final String option4 = "Real brasileiro -> Dólar";
    private static final String option5 = "Dólar -> Peso colombiano";
    private static final String option6 = "Peso colombiano -> Dólar";

    public void menu(){
        System.out.println("------------------------------------------------");
        System.out.println("Seja bem-vindo/a ao Conversor de Moeda");
        System.out.println();
        System.out.println("1) " + option1);
        System.out.println("2) " + option2);
        System.out.println("3) " + option3);
        System.out.println("4) " + option4);
        System.out.println("5) " + option5);
        System.out.println("6) " + option6);
        System.out.println("7) Sair");
        System.out.println("Escolha uma opção válida");
        System.out.println("------------------------------------------------");
    }

    public void options(int resp, CoinConversionService coinConversionService) {
        Scanner scanner = new Scanner(System.in);

        switch (resp) {
            case 1:
                System.out.print("Digite o valor em Dólar (USD): ");
                double valorUSDparaARS = scanner.nextDouble();
                System.out.println(option1 + "  " + String.format("%.2f", (coinConversionService.getConvertedCoinUSDtoARS() * valorUSDparaARS)));
                break;
            case 2:
                System.out.print("Digite o valor em Peso argentino (ARS): ");
                double valorARSparaUSD = scanner.nextDouble();
                System.out.println(option2 + "  " + String.format("%.2f", (coinConversionService.getConvertedCoinARStoUSD() * valorARSparaUSD)));
                break;
            case 3:
                System.out.print("Digite o valor em Dólar (USD): ");
                double valorUSDparaBRL = scanner.nextDouble();
                System.out.println(option3 + "  " + String.format("%.2f", (coinConversionService.getConvertedCoinUSDtoBRL() * valorUSDparaBRL)));
                break;
            case 4:
                System.out.print("Digite o valor em Real brasileiro (BRL): ");
                double valorBRLparaUSD = scanner.nextDouble();
                System.out.println(option4 + "  " + String.format("%.2f", (coinConversionService.getConvertedCoinBRLtoUSD() * valorBRLparaUSD)));
                break;
            case 5:
                System.out.print("Digite o valor em Dólar (USD): ");
                double valorUSDparaCOP = scanner.nextDouble();
                System.out.println(option5 + "  " + String.format("%.2f", (coinConversionService.getConvertedCoinUSDtoCOP() * valorUSDparaCOP)));
                break;
            case 6:
                System.out.print("Digite o valor em Peso colombiano (COP): ");
                double valorCOPparaUSD = scanner.nextDouble();
                System.out.println(option6 + "  " + String.format("%.2f", (coinConversionService.getConvertedCoinCOPtoUSD() * valorCOPparaUSD)));
                break;
            case 7:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida, tente novamente.");
                break;
        }

    }
}
