package logic;
/**

 Clase Fruit que representa un objeto fruta
 @author Ronald Serramo
 */

import java.util.ArrayList;

public class Fruit {
    private String name;
    // Nombre de la fruta
    private float averageWeight;
    // Peso promedio de la fruta
    protected ArrayList<String> colors;
    // Colores de la fruta

    /**
     * Constructor sin parámetros que inicializa los valores por defecto
     */
    public Fruit() {
        this.name = "banana";
        this.averageWeight= 85;
        this.colors= new ArrayList<String>();
        this.colors.add("yellow");
    }

    /**
     * Constructor con parámetros que permite inicializar los valores de nombre, peso promedio y colores de la fruta
     * @param name nombre de la fruta
     * @param averageWeight peso promedio de la fruta
     * @param colors colores de la fruta
     */
    public Fruit(String name, float averageWeight, ArrayList<String> colors) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = colors;
    }

    /**
     * Método para obtener el nombre de la fruta
     * @return nombre de la fruta
     */
    public String getName() {
        return name;
    }

    /**
     * Método para establecer el nombre de la fruta
     * @param name nombre de la fruta
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método para obtener el peso promedio de la fruta
     * @return peso promedio de la fruta
     */
    public float getAverageWeight() {
        return averageWeight;
    }

    /**
     * Método para establecer el peso promedio de la fruta
     * @param averageWeight peso promedio de la fruta
     */
    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }

    /**
     * Método para obtener los colores de la fruta
     * @return colores de la fruta
     */
    public ArrayList<String> getColors() {
        return colors;
    }

    /**
     * Método para establecer los colores de la fruta
     * @param colors colores de la fruta
     */
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
}
