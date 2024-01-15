import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Parte2 {
    public static void main(String[] args) {
        separacaoMasculinoFeminino();
    }

    private static void separacaoMasculinoFeminino() {

        List<String> masculino = new ArrayList<String>();
        List<String> feminino = new ArrayList<String>();

        System.out.println("Insira 4 nomes para serem ordenados em masculino/feminino usando uma vírugla após o nome e indicando \"M\" ou \"F\":");

        Scanner primeiro = new Scanner(System.in);
        String nome1 = primeiro.nextLine();
        String[] arrayTemp1 = nome1.split(",");
        if (arrayTemp1[1].equals("M")){
            masculino.add(arrayTemp1[0]);
        }else{
            feminino.add(arrayTemp1[0]);
        }

        Scanner segundo = new Scanner(System.in);
        String nome2 = segundo.nextLine();
        String[] arrayTemp2 = nome2.split(",");
        if (arrayTemp2[1].equals("M")){
            masculino.add(arrayTemp2[0]);
        }else{
            feminino.add(arrayTemp2[0]);
        }

        Scanner terceiro = new Scanner(System.in);
        String nome3 = terceiro.nextLine();
        String[] arrayTemp3 = nome3.split(",");
        if (arrayTemp3[1].equals("M")){
            masculino.add(arrayTemp3[0]);
        }else{
            feminino.add(arrayTemp3[0]);
        }

        Scanner quarto = new Scanner(System.in);
        String nome4 = quarto.nextLine();
        String[] arrayTemp4 = nome4.split(",");
        if (arrayTemp4[1].equals("M")){
            masculino.add(arrayTemp4[0]);
        }else{
            feminino.add(arrayTemp4[0]);
        }

        Collections.sort(masculino);
        Collections.sort(feminino);

        System.out.println("Lista de nomes do sexo masculino:");
        System.out.println(masculino);
        System.out.println("Lista de nomes do sexo feminino:");
        System.out.println(feminino);
    }
}
