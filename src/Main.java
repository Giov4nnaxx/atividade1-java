import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static ArrayList<String> lista = new ArrayList<>();

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        System.out.println("***********Menu***********");
        System.out.println("1- Cadastrar um aluno \n" +
                "2- Listar um aluno \n" +
                "3- Editar um aluno \n" +
                "4- Deletar um aluno \n" +
                "5- Sair \n");
        Scanner sc = new Scanner(System.in);


        System.out.println("O que você deseja fazer: ");

        int input = Integer.parseInt(sc.nextLine());

        if (input == 1) {
            System.out.println("Digite o nome do aluno: ");
            String nome = sc.nextLine();
            System.out.println();
            lista.add(nome);
            System.out.println("Aluno cadastrado");
            menu();
        }

        else if (input == 2) {
            System.out.println("Lista de Nomes:");
            listar(lista);
            menu();
        }

        else if (input == 3) {
            System.out.println("Lista de Nomes\n");
            listar(lista);
            System.out.println("Qual aluno vc deseja editar? ");
            int indice = Integer.parseInt(sc.nextLine());
            System.out.println("Digite o nome do aluno");
            String novoNome = sc.nextLine();
            lista.set(indice, novoNome);
            menu();
        }

        else if (input == 4) {
            System.out.println("Lista de Nomes\n");
            listar(lista);
            System.out.println("Qual aluno vc deseja remover? ");
            int indice = Integer.parseInt(sc.nextLine());
            if (indice >= 0 && indice < lista.size()) {
                lista.remove(indice);
                System.out.println("Aluno removido!");
                menu();
            } else {
                System.out.println("Índice inválido!");
                return;
            }
        }
    }

    public static void listar(ArrayList<String> lista) {
            for (int i = 0; i < lista.size(); i++) {
                System.out.println(i + " - " + lista.get(i));
            }
    }
}
