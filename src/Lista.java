import java.util.LinkedList;
import java.util.Scanner;

public class Lista {

    public static void main(String[] args) {

        LinkedList<Integer> names = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        Integer liczba = 0;
        int licznik = 0;
        do {
            System.out.println("Wpisz kolejną liczbę do listy: ");
            liczba = scanner.nextInt();

            if (liczba >= 0) {
                names.add(liczba);
                licznik++;
            }
            if (liczba >= 0) {
                sum = sum + liczba;
            }
        } while (liczba >= 0);

        //SUMA PONIZEJ
        int x = 0;
        System.out.print("\nSuma wprowadzonych liczb: ");
        for (int i = 0; i < names.size() ; i++) {
            if((i == (names.size()-1))){
            System.out.print(names.get(i));
            }
            else {
            System.out.print(names.get(i) + "+");
            }
        }
        System.out.println("=" + sum);

        //WYSWIETLANIE W ODWROTNEJ KOLEJNOSCI

        System.out.print("Podane liczby w odwrotnej kolejności to: ");
        while (licznik > 0) {
            System.out.print(names.get(licznik-1) + " ");
            licznik--;
        }

        // NAWIĘKSZA WARTOSC
        int max = names.get(0);
        for (int i = 0; i < (names.size()); i++) {
            if((names.get(i) > max)) {
                max = names.get(i);
            }
        }
        System.out.println("\nNajwiększa wartość z listy wynosi: " + max);

        // NAJMNIEJSZA WARTOSC
        int min = names.get(0);
        for (int i = 0; i < (names.size()); i++) {
            if((names.get(i) < min)) {
                min = names.get(i);
            }
        }
        System.out.println("Najmniejsza wartość z listy wynosi: " + min);

        // WYSWIETLENIE ROZMIARU LISTY
        System.out.print("\nRozmiar stworzonej listy wynosi aktualnie: ");
        int size= names.size();
        System.out.print(size);

    }
}
