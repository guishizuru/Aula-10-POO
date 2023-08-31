package ListaCircular;

public class ListaCircular <T> {

    private No<T> primeiroNo;
    private int numeroItens;

    public ListaCircular(){
        numeroItens = 0;
    }
    public void adicionarelemento(T elemento){
        if(numeroItens == 0){
            primeiroNo = new No<>();
            primeiroNo.setElemento(elemento);
            primeiroNo.setAnterior(primeiroNo);
            primeiroNo.setProximo(primeiroNo);

            numeroItens++;
            return;
        }
        No<T> aux = primeiroNo;
        while (aux.getProximo() != primeiroNo){
            aux = aux.getProximo();
        }
        do {
            System.out.println(aux.getElemento());
            aux =  aux.getProximo();
        }while(aux.getProximo() != primeiroNo);

        aux.setProximo(new No<>(elemento));
        aux.getProximo().setProximo(primeiroNo);
        primeiroNo.setAnterior(aux);
        numeroItens ++;
    }
    public void imprimirLista(){
        if(numeroItens == 0){
            return;
        }
    }
    public ListaCircular (No<T> primeiroNo, int numeroItens){
        this.numeroItens = numeroItens;
        this.primeiroNo = primeiroNo;
    }

    public int getNumeroItens() {
        return numeroItens;
    }

    public void setNumeroItens(int numeroItens) {
        this.numeroItens = numeroItens;
    }

    public No<T> getPrimeiroNo() {
        return primeiroNo;
    }

    public void setPrimeiroNo(No<T> primeiroNo) {
        this.primeiroNo = primeiroNo;
    }
}
