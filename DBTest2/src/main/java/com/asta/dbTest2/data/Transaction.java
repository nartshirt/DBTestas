package com.asta.dbTest2.data;

import org.bson.types.ObjectId;

public class Transaction {
    private ObjectId id;
    private double amount;

    public Transaction() {
    }

    public Transaction(ObjectId id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", amount=" + amount +
                '}';
    }
}
