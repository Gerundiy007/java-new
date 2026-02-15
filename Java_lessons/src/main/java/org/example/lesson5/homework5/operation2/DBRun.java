package org.example.lesson5.homework5.operation2;

import org.example.lesson5.step1.DBConnector;



public class DBRun {
    public static void main(String[] args) {
        final DBConnector cassandra = new CassandraDBConnector ("user",
                "MegaKiller123",
                "localhost",
                8080,
                "dictionary");

        DBConnector connector;

        System.out.println("Connecting to database CassandraDB");
        connector = cassandra;
        connector.connect();
        connector.disconnect();
    }
}