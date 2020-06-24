package HomeTask5.Colors;

public class Color {
    private final int RED = 1;
    private final int ORANGE = 2;
    private final int YELLOW = 3;
    private final int GREEN = 4;
    private final int LIGHT_BLUE = 5;
    private final int BLUE = 6;
    private final int PURPLE = 7;
    private int name;

    public Color(int name){
        this.name = name;
    }

    public int getNumber(){
        return this.name;
    }


    public String getName(){
        switch (name){
            case RED:
                return "Красный";
            case ORANGE:
                return "Оранжевый";
            case YELLOW:
                return "Жёлтый";
            case GREEN:
                return "Зелёный";
            case LIGHT_BLUE:
                return "Голубой";
            case BLUE:
                return "Синий";
            case PURPLE:
                return "Фиолетовый";
            default:
                return "Неизвестный";
        }
    }
}