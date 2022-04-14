package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        // Exercise№1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = "Ivanov Ivan Ivanovich";
        fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);
        // Exercise№2
        String i = fullName.toUpperCase();
        System.out.println(i);
        // Exercise№3
        fullName = "Иванов Семён Семёнович";
        String w = fullName.replace("ё","е");

        // Задачи повышеной сложности Условные операторы
        // Exercise№6
        int age = 19;
        int salary = 58_000;
        double credit = 0;
        if (age >= 23) {
            credit = salary * 3;
        } else if (age < 23) {
            credit = salary * 2;
        }
        if (salary >= 50_000) {
            credit = credit * 1.2;
        } else if (salary >= 80_000) {
            credit = credit * 1.5;
        }
        System.out.println("We are ready give you credit in " + credit + " rubles.");
        // Exercise№7
        age = 25;
        salary = 60_000;
        int wantedSum = 330_000;
        double basedPercent = 0.1;
        int year = 12;
        int maxPayment = salary / 2;
        double payment = 0;
        if (age <= 23) {
            basedPercent = basedPercent + 0.01;
        } else if (age <= 30) {
            basedPercent = basedPercent + 0.5;
        }
        if (salary >= 80_000) {
            basedPercent = basedPercent - 0.7;
        }
        payment = (wantedSum + wantedSum * basedPercent) / year;
        if (payment > maxPayment) {
            System.out.println("Maximum payment " + maxPayment + " if your salary is " + salary + " rubles. Payment for credit " + payment + " rubles. Credit denied.");
        } else {
            System.out.println("Maximum payment " + maxPayment + " if your salary is " + salary + " rubles. Payment for credit " + payment + " rubles. Credit approved.");
        }
        // Задачи повышеной сложности циклы
        // Exercise№4
        for (int a = 1; a <= 30; a++) {
            if (a % 3 == 0 && a % 5 == 0) {
                System.out.println(a + ":" + " ping pong");
            } else if (a % 3 == 0) {
                System.out.println(a + ":" + " ping");
            } else if (a % 5 == 0) {
                System.out.println(a + ":" + " pong");
            } else {
                System.out.println(a + ":");
            }
        }
        // Exercise№5
        System.out.println();
            int n0 = 0;
            int n1 = 1;
            int n2;
            System.out.print(n0 + " " + n1 + " ");
            for (int e = 3; e < 11; e++) {
                n2 = n0 + n1;
                System.out.print(n2 + " ");
                n0=n1;
                n1=n2;
            }
    }
}

