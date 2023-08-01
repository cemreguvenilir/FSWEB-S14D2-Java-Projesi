import model.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Bed bed1 = new Bed("double", 4, 180, 1, 2);
        Wall wall1 = new Wall("north");
        Wall wall2 = new Wall("south");
        Wall wall3 = new Wall("east");
        Wall wall4 = new Wall("west");

        Lamp lamp1 = new Lamp(LampType.LED, true, 15);
        Wardrobe wardrobe1 = new Wardrobe(170, 180, 30.5);
        Carpet carpet1 = new Carpet(100, 130, PaintColor.PINK);
        Bedroom bedroom = new Bedroom("Cemre's bedroom", wall1, wall2, wall3, wall4, new Ceiling(200, PaintColor.BLUE), bed1, lamp1, wardrobe1, carpet1);
        System.out.println(bedroom);
        bedroom.getCarpet().lying();
        bedroom.getBed().make();
        bedroom.getName();
        bedroom.getCeiling().create();
        bedroom.getWall1().create();
        bedroom.getLamp().turnOn();
        bedroom.getWardrobe().add();

    }
}