public class Programm{
    public static void main(String[] args) {
        Obst apfel = new Obst("apfel");
        apfel.name = ("apfel");
        apfel.setFarbe("rot");
        apfel.setGewicht(200);
        apfel.setReif(true);

        System.out.println(apfel.getName());
        apfel.setFarbe("rot");
        System.out.println("Der apfel ist " + apfel.getFarbe());
        System.out.println("Der apfel wiegt" +apfel.getGewicht() + "Gramm");
        System.out.println( apfel.reif );

    }
}

