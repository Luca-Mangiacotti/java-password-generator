package org.lesson.java.security;

import java.util.Scanner;

public class PasswordGenerator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci il tuo Nome: ");
        String userName = input.nextLine();
        System.out.println("Inserisci il tuo Cognome: ");
        String userSurname = input.nextLine();
        System.out.println("Inserisci il tuo Colore preferito: ");
        String userColor = input.nextLine();
        System.out.println("Inserisci il tuo Giorno di nascita: ");
        int userDay = input.nextInt();
        System.out.println("Inserisci il tuo Mese di nascita: ");
        int userMonth = input.nextInt();
        System.out.println("Inserisci il tuo Anno di nascita: ");
        int userYear = input.nextInt();

        int sumForPass = userDay + userMonth + userYear;
        String userPassword = userName + "-" + userSurname + "-" + userColor + "-" + sumForPass;
        System.out.println("La tua password è: " + userPassword);
        input.close();
    }
}