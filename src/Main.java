import javax.xml.xpath.XPath;
import java.io.IOException;
import java.util.IllegalFormatException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.nio.file.Path;
import java.lang.Math;

public class Main {
    public static void main(String[] args) throws IOException {
//        Scanner scanner new Scanner(Path.of("test.txt"));
//        int[] tab = {1,2,3};
//        for (int i =0; i<10; i++){
//            System.out.println(tab[i]);
//        }
//
//        StosWyjatkow stosWyjatkow = new StosWyjatkow();
//
//        try{
//            stosWyjatkow.metoda1();
//        }catch (IllegalFormatException e){
//            System.out.println(e.getMessage());
//        }
//
//        System.out.println("i tak was lubie");

/*
Napisz program, który pobierze od
użytkownika liczbę i wyświetli jej pierwiastek.
Do obliczenia pierwiastka możesz użyć istniejącej metody java.lang.Math.sqrt().
 Jeśli użytkownik poda liczbę ujemną rzuć wyjątek java.lang.IllegalArgumentException.
 Obsłuż sytuację, w której użytkownik poda ciąg znaków,
który nie jest liczbą.
 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe wieksza od zera: ");
        try{
            double user = scanner.nextDouble();
            if (user <= 0){
                throw new IllegalArgumentException("Nie mozna 0");
            }
            else {
                System.out.println(Math.sqrt(user));
            }
        }
        catch (IllegalFormatException e){
            System.out.println("Podaj liczbe");
        }
        catch (InputMismatchException a){
            System.out.println("zle");
        }
    }
}