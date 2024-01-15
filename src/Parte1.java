import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Parte1 {
    public static void main(String[] args) {
        listaNomesOrdenada();
    }

    private static void listaNomesOrdenada() {

        System.out.println("Insira 3 nomes para serem ordenados em ordem alfabética:");
        Scanner primeiro = new Scanner(System.in);
        String nome1 = primeiro.nextLine();
        Scanner segundo = new Scanner(System.in);
        String nome2 = segundo.nextLine();
        Scanner terceiro = new Scanner(System.in);
        String nome3 = terceiro.nextLine();

        System.out.println("Lista de Nomes em Ordem alfabética:");
        List<String> lista = new ArrayList<String>();
        lista.add(nome1);
        lista.add(nome2);
        lista.add(nome3);
        Collections.sort(lista);
        System.out.println(lista);
    }
}
