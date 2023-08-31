package Aula10.OgroEMaca;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Boolean> quests = new HashMap<>();

        quests.put("encontrar 10 maças douradas" , true);
        quests.put("derrote 1 ogro", false);

        if(quests.containsKey("derrote 1 ogro")){
            quests.replace("derrote 1 ogro", true);
            System.out.println(quests.get("derrote 1 ogro"));
        }


    }
}
