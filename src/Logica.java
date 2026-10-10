import java.text.DecimalFormat;

//Añadir métodos para que funcioné la app
public class Logica {

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
        if (numeroActual.isEmpty()) return op;      //evita errores si se pulsa un operador sin número
        primerNumero = Double.parseDouble(numeroActual);
        //2. Guardar op en operador
        operador = op;
        //3. Vaciar numeroActual para poder escribir el segundo número
        numeroActual = "";
        return op;
    }

    //Método para calcular los números
    public String calcular() {
        if(numeroActual.isEmpty()) return "0";      //Evita errores si se presiona igual sin segundo número.

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
                if(segundoNumero == 0) {
                    return "No se puede dividir entre cero.";
                } else {
                    resultado = primerNumero / segundoNumero;
                }
                break;
            default:
                return numeroActual;    //Si no hay operador devuelve el número actual
        }
        //Aplicamos el formato aquí para eliminar el .0 de los enteros
        DecimalFormat formato = new DecimalFormat("#.######");

        //Guardo el reultado formateado en número actual si el usuario quiere seguir operando con este resultado
        numeroActual = formato.format(resultado);

        return numeroActual;
    }

    //Método para borrar todo con el boton C
    public String limpiar() {
        numeroActual = "";
        primerNumero = 0;
        operador = "";
        return "0";
    }
}
