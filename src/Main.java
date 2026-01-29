import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Object> lista = new ArrayList<>();
        System.out.println("***********Listinha de Nomes***********");

        while(!lista = "sair") {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite seu nome: ");

            lista.add(sc.nextLine());

            System.out.println(lista);
        }
    }
}