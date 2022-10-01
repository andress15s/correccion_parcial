// Define al paquete apropiado
package modelo;

// Crea la clase Modelo
public class Modelo {
    // Declara las variables vectorA y vectorB como publicas
    private static int[] vectorA = new int[10];
    private static int[] vectorB = new int[10];
    public static int productoEscalar;
    public static int resultado;

    // Crea el setter para la variable vectorA
    public void setvectorA(int[] vectorA) {
        Modelo.vectorA = vectorA;
    }

    // Crea el setter para la variable vectorB
    public void setvectorB(int[] vectorB) {
        Modelo.vectorB = vectorB;
    }

    // Crea el setter para la variable productoEscalar
    public void setProductoEscalar(int productoEscalar) {
        Modelo.productoEscalar = productoEscalar;
    }

    // Crea el getter para la variable productoEscalar
    public int getProductoEscalar() {
        return productoEscalar;
    }

    // Crea el método hallarProductoEscalar con UNICAMENTE el algoritmo a seguir
    public static void hallarProductoEscalar() {
        for (int i = 0; i < 10; i++) {
            resultado = vectorA[i] * vectorB[i];
            productoEscalar += resultado;
        }
    }
}