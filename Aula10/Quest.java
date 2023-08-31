package Aula10;

public class Quest {
    private String area;
    private int recompensa;

    public Quest(String area, int recompensa){
        this.area = area;
        this.recompensa = recompensa;
    }

    public int getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(int recompensa) {
        this.recompensa = recompensa;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}


