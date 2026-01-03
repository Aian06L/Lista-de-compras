package application;

import entities.Compra;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Compra> lista = new ArrayList<>();

        System.out.println("-------------Seja Bem-vindo-------------");
        System.out.println("Informe o numero de quantas coisas para comprar será listadas");
        int list = sc.nextInt();
        sc.nextLine();

        System.out.println("-------Informações-------");
        for (int i = 0; i < list; i++) {
            System.out.println("Digite o nome do " + (i + 1) + " Produto");
            String nomeP = sc.nextLine();

            System.out.println("Digite o valor do Produto");
            Double valorP = sc.nextDouble();
            sc.nextLine();

            Compra comp = new Compra(nomeP, valorP);

            lista.add(comp);
        }
        System.out.println("-------Atribuições-------");
        System.out.println("Deseja fazer alguma modificação??");
        char res = sc.next().charAt(0);
        System.out.println("-------Adicionais-------");
        if (res == 'y') {
            int req = 0;

            while (req != 4) {
                System.out.println("-------Escolhas da lista-------");
                System.out.println("1. Adicionar mais lista de compras");
                System.out.println("2. Ver lista");
                System.out.println("3. Remover lista");
                System.out.println("4. Sair da lista");
                req = sc.nextInt();
                sc.nextLine();

                if (req == 1) {
                    System.out.println("Digite o nome do produto");
                    String nomePr = sc.nextLine();
                    System.out.println("Digite o valor do produto");
                    Double valoPr = sc.nextDouble();

                    Compra novaComp = new Compra(nomePr, valoPr);
                    lista.add(novaComp);
                    System.out.println("Nova compra adicionada");
                } else if (req == 2) {
                    System.out.println("\n--- LISTA ATUAL ---");
                    for (Compra c : lista) {
                        // Usando os métodos da sua classe Compra
                        System.out.println("- " + c.getNome() + ": R$ " + c.getValor());
                    }
                } else if(req == 3){
                    System.out.print("Digite o número da tarefa para remover: ");
                    int indice = sc.nextInt();
                    if (indice > 0 && indice <= lista.size()) {
                        lista.remove(indice - 1);
                        System.out.println("Tarefa removida!");
                    } else {
                        System.out.println("Número inválido.");
                    }
                }
            }
        }
        System.out.println("Finalizando a lista!");
        sc.close();
    }
}