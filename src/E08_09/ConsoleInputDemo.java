package E08_09;

import java.util.Scanner;

public class ConsoleInputDemo {

    public static void main(String[] args) {

        System.out.print(" Pradedame! \n Iveskite Varda: ");
// \n reiskia pereinam i nauja eilute
        Scanner scanner = new Scanner(System.in);
        String vardas = scanner.nextLine();

        System.out.println("Koks tavo Amzius : ");
        int amzius = scanner.nextInt();

        System.out.println("Vardas = " + vardas);
        System.out.println("Amzius mano = " + amzius); }
}
