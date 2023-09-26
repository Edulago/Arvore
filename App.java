import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Arvore_Binaria arvore = new Arvore_Binaria();
        Scanner sc = new Scanner(System.in);
    
        while (true) {
            System.out.println("\nDigite 1 para inserir na árvore:");
            System.out.println("Digite 2 para buscar na árvore:");
            System.out.println("Digite 3 para percorrer a árvore (inordem):");
            System.out.println("Digite 4 para percorrer a árvore (pré-ordem):");
            System.out.println("Digite 5 para percorrer a árvore (pós-ordem):");
            System.out.println("Digite 6 para remover o maior elemento:");
            System.out.println("Digite 7 para remover o menor elemento:");
            System.out.println("Digite 8 para sair:");
            
            int numero = sc.nextInt();
            
            if (numero == 1) {
                System.out.println("Digite o valor a ser inserido:");
                int info = sc.nextInt();
                arvore.inserir(info);
            } else if (numero == 2) {
                System.out.println("Digite o valor a ser buscado:");
                int info = sc.nextInt();
                if (arvore.busca(info)) {
                    System.out.println("O valor foi encontrado!");
                } else {
                    System.out.println("O valor não foi encontrado!");
                }
            } else if (numero == 3) {
                System.out.println("Valores na árvore (inordem):");
                arvore.percorrer();
                System.out.println();
            } else if (numero == 4) {
                System.out.println("Valores na árvore (pré-ordem):");
                arvore.percorrerPreOrdem();
                System.out.println();
            } else if (numero == 5) {
                System.out.println("Valores na árvore (pós-ordem):");
                arvore.percorrerPosOrdem();
                System.out.println();
            } else if (numero == 6) {
                boolean sucesso = arvore.removerMaior();
                if (sucesso) {
                    System.out.println("Maior elemento removido com sucesso.");
                } else {
                    System.out.println("A árvore está vazia, nenhum elemento removido.");
                }
            } else if (numero == 7) {
                boolean sucesso = arvore.removerMenor();
                if (sucesso) {
                    System.out.println("Menor elemento removido com sucesso.");
                } else {
                    System.out.println("A árvore está vazia, nenhum elemento removido.");
                }
            } else if (numero == 8) {
                break;
            }
        }
    }    
}
