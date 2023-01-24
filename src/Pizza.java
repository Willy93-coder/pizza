/*
* @author Willy
* @version 1.0.0
* */

public class Pizza {
    // Atributos
    private String ingrediente;
    private String tamanio;
    private String estado;
    private int servida;
    private static int pedidas;
    private static int servidas;

    // constructores
    public Pizza() {
    }

    public Pizza(String ingrediente, String tamanio) {
        comprobarIngredientes(ingrediente);
        comprobarTamanio(tamanio);
        this.estado = "demanada";
        this.pedidas += 1;
    }

    // Métodos

    /** Método para contar todas las pizzas servidas
     * */
    public void sirve() {
        this.servidas += 1;
        this.servida += 1;
        if (servida == 1) {
            System.out.println("Aquesta pizza ja s'ha servit");
        }
        if (servida > 1) {
            System.out.println("La pizza no es pot servir perque s'ha servit abans");
        }
    }

    public static int getTotalDemanades() {
        return pedidas;
    }

    public static int getTotalServides() {
        return servidas;
    }

    // Metodos de comprobacion

    /**Método para comprobar que el tamaño de la pizza es correcto
     * @param tamanio*/
    private void comprobarTamanio(String tamanio) {
        if (tamanio.equals("mitjana") || tamanio.equals("familiar")) {
             this.tamanio = tamanio;
        } else {
            this.tamanio =  "El tamaño de la pizza que ha pedido no lo tenemos";
        }
    }

    /**Método para comprobar que los ingredientes de la pizza son correctos
     * @param ingrediente*/
    private void comprobarIngredientes(String ingrediente) {
        switch (ingrediente) {
            case "margarita", "quatre formatges", "funghi" -> this.ingrediente = ingrediente;
            default -> this.ingrediente = "No tenemos ese ingrediente";
        }
    }

    // To string

    @Override
    public String toString() {
        return "Pizza " + ingrediente + " " + tamanio + ", " + estado;
    }
}
