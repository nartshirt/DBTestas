package com.asta.dbTest2;

import com.asta.dbTest2.data.Transaction;
import com.asta.dbTest2.data.User;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.asta.client.MongoObjectClientProvider;
import org.bson.types.ObjectId;

import java.util.Scanner;

public class BankAplication {
    private final MongoCollection<User> userCollection;
    private final MongoCollection<Transaction> transactionCollection;

    public BankAplication(MongoCollection<User> userCollection, MongoCollection<Transaction> transactionCollection) {
        this.userCollection = userCollection;
        this.transactionCollection = transactionCollection;
    }

    public static void main(String[] args) {
        MongoClient client = MongoObjectClientProvider.getClient();
        MongoDatabase database = client.getDatabase("Bank");
        BankAplication aplication = new BankAplication(database.getCollection("users", User.class),
                database.getCollection("transactions", Transaction.class));

        Scanner scanner = new Scanner(System.in);
        String action;
        do{
            aplication.menu();
            action = scanner.nextLine();
            aplication.userSelection(scanner,action);

        }while (!action.equals("4"));

    }

    private void login(Scanner scanner){
        System.out.println("Įveskite vardą: ");
        String name = scanner.nextLine();
        System.out.println("Įveskite pavardę: ");
        String surname = scanner.nextLine();


    }

    private void userSelection(Scanner scanner, String action) {

        switch (action) {
            case "1" -> login(scanner);
            case "2" -> sendMoney();
            case "3" -> showBalance();
            case "4" -> System.out.println("Jūs atsijungėte nuo programos");
            default -> System.out.println("Tokio veiksmo nėra");
        }
    }


    private void menu() {
        System.out.println("""
                1. Prisijungti
                2. Pervesti pinigus
                4. Parodyti sąskaitos balansą
                5. Atsijungti
                """);
    }
}