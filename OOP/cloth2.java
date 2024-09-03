public class Cloth2 {
    int size = 23;
    String color = "blue";
    String material = "cotton";

    public void displayCloth2(){
        System.out.println("The color of the cloth is " + color);
        System.out.println("The size of the cloth is " + size);
        System.out.println("The material of the cloth is " + material);
    }

    public static void main(String[] args) {
        Cloth2 cloth1 = new Cloth2();
        cloth1.displayCloth2();
    }
}
