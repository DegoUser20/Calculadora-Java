//Añadir métodos para que funcioné la app
public class Logica {
    //Metodo para guardar los números que se pulsan
    private String numeroActual = "";
    private double primerNumero = 0;
    private String operador = "";

    //Metodo que se llama cuando se presiona un número
    public String pulsarNumero(String digito){
        numeroActual += digito;
        return numeroActual;
    }

    //Método que se llama cuando se presiona un botón de operador
    public String pulsarOperador(String op) {
        //1. Convertir numeroActual (texto) a un número y guardarlo en primer número
        primerNumero = Double.parseDouble(numeroActual);
        //2. Guardar op en operador
        operador = op;
        //3. Vaciar numeroActual para poder escribir el segundo número
        numeroActual = "";
        return op;
    }

    //Método para calcular los números
    public String calcular() {
        double segundoNumero = Double.parseDouble(numeroActual);
        double resultado = 0;

        switch (operador) {
            case "+":
                resultado = primerNumero + segundoNumero;
                break;
            case "-":
                resultado = primerNumero - segundoNumero;
                break;

            case "*":
                resultado = primerNumero * segundoNumero;
                break;

            case "/":
                resultado = primerNumero / segundoNumero;
                break;
        }
        return String.valueOf(resultado);
    }

    //Método para borrar todo con el boton C
    public String limpiar() {
        numeroActual = "";
        primerNumero = 0;
        operador = "";
        return "0";
    }
}
