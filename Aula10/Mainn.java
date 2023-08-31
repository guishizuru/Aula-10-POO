package Aula10;

public class Mainn {
    public static void main(String[] args) {
        Heroi heroi = new Heroi(1, "Lyn");
        heroi.adicionarQuest("quest 1", new Quest("Colinas", 100));
        heroi.adicionarQuest("quest 2", new Quest("Masmorra", 1000));
        heroi.adicionarQuest("quest 3", new Quest("Castelo", 10000));
        System.out.println(heroi.getQuest("quest 2"));
    }
}
