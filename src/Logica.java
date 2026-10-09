//Añadir métodos para que funcioné la app
public class Logica {
    //Metodo para guardar los números que se pulsan
    private String numeroActual = "";

    //Método que se llama cuando se presiona un botón
    public String pulsarNumero(String digito) {
        numeroActual += digito;
        return numeroActual;
    }
}
