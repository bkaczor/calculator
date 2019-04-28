package pl.edu.agh.mwo.calculator;

/**
 * Hello world!
 *
 */
public class Calculator
{
    public int sum(int a, int b) {
        //System.out.println("Wynik dodawania: ");
        return a+b;
    }

    public int sub(int a, int b) {
        //System.out.println("Wynik odejmowania: ");
        return a-b;
    }

    public int mult(int a, int b) {
        //System.out.println("Wynik mnozenia: ");
        return a*b;
    }

    public int div(int a, int b) {
        //System.out.println("Wynik dzielenia: ");
        return a/b;
    }

    public int avg(int a, int b) {
        //System.out.println("Srednia: ");
        return (a+b)/2;
    }
}
