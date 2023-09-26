public class Arvore_Binaria {
    Node raiz;

    public Arvore_Binaria() {
        raiz = null;
    }

    // Insere um novo nó na árvore
    public void inserir(int info) {
        this.raiz = inserirRecursivamente(this.raiz, info);
    }

    private Node inserirRecursivamente(Node raiz, int info) {
        if (raiz == null) {
            return new Node(info);
        }

        if (info < raiz.info) {
            raiz.esquerda = inserirRecursivamente(raiz.esquerda, info);
        } else if (info > raiz.info) {
            raiz.direita = inserirRecursivamente(raiz.direita, info);
        }

        return raiz;
    }

    // Método para realizar uma busca na árvore
    public boolean busca(int data) {
        return buscaRec(raiz, data);
    }

    public boolean buscaRec(Node raiz, int info) {
        if (raiz == null) {
            return false;
        }

        if (raiz.info == info) {
            return true;
        }

        if (info < raiz.info) {
            return buscaRec(raiz.esquerda, info);
        } else {
            return buscaRec(raiz.direita, info);
        }
    }

    // Método para percorrer a árvore em ordem
    public void percorrer() {
        inorderRec(raiz);
    }

    private void inorderRec(Node raiz) {
        if (raiz != null) {
            inorderRec(raiz.esquerda);
            System.out.print(raiz.info + " ");
            inorderRec(raiz.direita);
        }
    }

    // Método para remover o maior elemento e retornar true se bem-sucedido
    public boolean removerMaior() {
        if (raiz == null) {
            System.out.println("A árvore está vazia.");
            return false;
        }

        // Encontrar o nó com o maior valor
        Node[] maiorNo = new Node[1];
        raiz = removerMaiorRec(raiz, maiorNo);

        return maiorNo[0] != null;
    }

    private Node removerMaiorRec(Node raiz, Node[] maiorNo) {
        if (raiz.direita == null) {
            maiorNo[0] = raiz;
            return raiz.esquerda;
        }

        raiz.direita = removerMaiorRec(raiz.direita, maiorNo);
        return raiz;
    }

     // Método para remover o menor elemento e retornar true se bem-sucedido
     public boolean removerMenor() {
        if (raiz == null) {
            System.out.println("A árvore está vazia.");
            return false;
        }

        // Encontrar o nó com o menor valor
        Node[] menorNo = new Node[1];
        raiz = removerMenorRec(raiz, menorNo);

        return menorNo[0] != null;
    }

    private Node removerMenorRec(Node raiz, Node[] menorNo) {
        if (raiz.esquerda == null) {
            menorNo[0] = raiz;
            return raiz.direita;
        }

        raiz.esquerda = removerMenorRec(raiz.esquerda, menorNo);
        return raiz;
    }

    // Método para percorrer a árvore na forma pré-ordem
    public void percorrerPreOrdem() {
        preOrdemRec(raiz);
    }

    private void preOrdemRec(Node raiz) {
        if (raiz != null) {
            System.out.print(raiz.info + " ");
            preOrdemRec(raiz.esquerda);
            preOrdemRec(raiz.direita);
        }
    }

     // Método para percorrer a árvore na forma pós-ordem
     public void percorrerPosOrdem() {
        posOrdemRec(raiz);
    }

    private void posOrdemRec(Node raiz) {
        if (raiz != null) {
            posOrdemRec(raiz.esquerda);
            posOrdemRec(raiz.direita);
            System.out.print(raiz.info + " ");
        }
    }
}
