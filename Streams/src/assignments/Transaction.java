package assignments;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 1. Find all transactions in the year 2011 and sort them by value (small to high).
 *
 * 2. Print all transactions’ values from the traders living in Delhi.
 *
 * 3. What’s the highest value of all the transactions?
 *
 * 4. Find the transaction with the smallest value.
 */
/*
class Trader {
private String name;
private String city;
}
*/
class Transaction {
    private Trader trader;
    private int year;
    private int value;

    public Transaction(Trader trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }

    public Trader getTrader() {
        return trader;
    }

    public int getYear() {
        return year;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "trader=" + trader +
                ", year=" + year +
                ", value=" + value +
                '}';
    }
}
