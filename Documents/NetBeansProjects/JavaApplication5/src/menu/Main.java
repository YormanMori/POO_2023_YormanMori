package menu;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static int select = -1;
    static int num1 = 0, num2 = 0;

    public static void main(String[] args) {

        while (select != 0) {

            try {
                System.out.println(""
                        + "1.- Sumar\n"
                        + "2.- Restar\n"
                        + "3.- Multiplicar\n"
                        + "4.- Dividir\n"
                        + "0.- Salir");
                System.out.print("Elige opcion:");
                select = Integer.parseInt(scanner.nextLine());

                switch (select) {
                    case 1:
                        pideNumeros();
                        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                        break;
                    case 2:
                        pideNumeros();
                        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                        break;
                    case 3:
                        pideNumeros();
                        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                        break;
                    case 4:
                        pideNumeros();
                        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                        break;
                    case 0:
                        System.out.println("Adios!");
                        break;
                    default:
                        System.out.println("Número no reconocido");
                        break;
                }

                System.out.println("\n");

            } catch (Exception e) {
                System.out.println("Uoop! Error!"+e);
            }
        }

    }

    public static void pideNumeros() {
        System.out.println("Introduce número 1:");
        num1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Introduce número 2:");
        num2 = Integer.parseInt(scanner.nextLine());

        System.out.println("\n");
    }
}
