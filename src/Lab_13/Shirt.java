package Lab_13;

public class Shirt {
    private String code;
    private String description;
    private String color;
    private String size;

    public Shirt(String code, String description, String color, String size) {
        this.code = code;
        this.description = description;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Code: " + code + "\nDescription: " + description + "\nColor: " + color + "\nSize: " + size + "\n";
    }

    public static void main(String[] args) {
        // Создание массива строк с данными
        String[] shirtsData = {
                "S001,Black Polo Lab_13.Shirt,Black,XL",
                "S002,Black Polo Lab_13.Shirt,Black,L",
                "S003,Blue Polo Lab_13.Shirt,Blue,XL",
                "S004,Blue Polo Lab_13.Shirt,Blue,M",
                "S005,Tan Polo Lab_13.Shirt,Tan,XL",
                "S006,Black T-Lab_13.Shirt,Black,XL",
                "S007,White T-Lab_13.Shirt,White,XL",
                "S008,White T-Lab_13.Shirt,White,L",
                "S009,Green T-Lab_13.Shirt,Green,S",
                "S010,Orange T-Lab_13.Shirt,Orange,S",
                "S011,Maroon Polo Lab_13.Shirt,Maroon,S"
        };

        // Создание массива объектов Lab_13.Shirt
        Shirt[] shirts = new Shirt[shirtsData.length];

        // Заполнение массива объектов данными из строк
        for (int i = 0; i < shirtsData.length; i++) {
            String[] shirtInfo = shirtsData[i].split(",");
            String code = shirtInfo[0];
            String description = shirtInfo[1];
            String color = shirtInfo[2];
            String size = shirtInfo[3];

            shirts[i] = new Shirt(code, description, color, size);
        }

        // Вывод данных на консоль
        for (Shirt shirt : shirts) {
            System.out.println(shirt.toString());
        }
    }
}
