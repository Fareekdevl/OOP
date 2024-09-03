public class Cloth3 {
    static int size = 23;
    static String color = "blue";
    static String material = "cotton";

    public void displayCloth3() {
        System.out.println("The color of the cloth is " + color);
        System.out.println("The size of the cloth is " + size);
        System.out.println("The material of the cloth is " + material);
    }

    public static void main(String[] args) {
        Cloth3 cloth1 = new Cloth3();
        cloth1.displayCloth3();
    }
}
