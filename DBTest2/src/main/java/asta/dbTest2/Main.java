package asta.dbTest2;

import java.util.Scanner;

public class Main {

    private void userSelection(Scanner scanner, String action) {

        switch (action) {
            case "1" -> login();
            case "2" -> sendMoney();
            case "3" -> receiveMoney();
            case "4" -> showBalance();
            case "5" -> System.out.println("Jūs atsijungėte nuo programos");
            default -> System.out.println("Tokio veiksmo nėra");
        }
    }
}