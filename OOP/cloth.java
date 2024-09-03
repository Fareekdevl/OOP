public class Cloth {
    int size = 23;
    String color = "blue";
    String material = "cotton";

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public String getMaterial() {
        return material;
    }

    public static void main(String[] args) {
        Cloth zip = new Cloth();
        String color = zip.getColor();
        int size = zip.getSize();
        String material = zip.getMaterial();

        System.out.println("The color of the cloth is " + color);
        System.out.println("The size of the cloth is " + size);
        System.out.println("The material of the cloth is " + material);
    }
}
