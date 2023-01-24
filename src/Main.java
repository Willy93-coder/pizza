public class Main {
    public static void main(String[] args) {
        Pizza p1 = new Pizza("margarita", "mitjana");
        Pizza p2 = new Pizza("funghi", "familiar");
        p2.sirve();
        Pizza p3 = new Pizza("quatre formatges", "mitjana");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        p2.sirve();
        System.out.println("Pedidas: " + Pizza.getTotalDemanades());
        System.out.println("Servidas: " + Pizza.getTotalServides());
    }
}