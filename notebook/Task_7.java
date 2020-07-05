package notebook;

public class Task_7 {
    public static void main(String[] args) {
        int house1_length = 5, house1_width = 10;
        int house2_length = 7, house2_width = 5;
        int place_length = 11, place_width = 9;
        int house1_area = house1_length * house1_width;
        int house2_area = house2_length * house2_width;
        int total_house_area = house1_area + house2_area;
        int place_area = place_length * place_width;

        System.out.println("Площадь двух домов - " + total_house_area);
        System.out.println("Площадь занимаего участка - " + place_area);

        if (place_area < total_house_area){
            System.out.println("Дома не поместятся");
        }
        else if (place_area > total_house_area){
            System.out.println("Дома поместятся");
        }
    }
}