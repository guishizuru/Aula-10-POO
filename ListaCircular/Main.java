package ListaCircular;

public class Main {
    public static void main(String[] args) {
        ListaCircular<String> listaCircular = new ListaCircular<>();
        listaCircular.adicionarelemento("Pavi");
        listaCircular.adicionarelemento("Ramos");
        listaCircular.adicionarelemento("Jose");
        listaCircular.adicionarelemento("Josefa");
        listaCircular.adicionarelemento("Maria");
        listaCircular.adicionarelemento("Clara");

        listaCircular.imprimirLista();
    }
}
