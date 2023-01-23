public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("margarita", "familiar");
        System.out.println("Pizza 1: " + pizza1);
        pizza1.sirve();
        Pizza pizza2 = new Pizza("funghi", "mediana");
        System.out.println("Pizza 2: " + pizza2);
        pizza2.sirve();

        Pizza pizza3 = new Pizza("Dos quesos", "petita");
        System.out.println("Pizza 3: " + pizza3);

        System.out.println("Pedidas: " + Pizza.getTotalDemanades());
        System.out.println("Servidas: " + Pizza.getTotalServides());
    }
}