package logic;
/**

 Clase que representa un auto.
 @author Ronald serrano
 */
public class Car {
    private String brand; // marca del auto
    private String model;// modelo del auto
    private  int year; // año de fabricacion
    protected  int numberOfDoors; // numero de puertas

    /**
     Constructor por defecto. Inicializa los atributos a valores por defecto.
     */
    public Car() {
        this.brand = "toyota";
        this.model = "Hilux";
        this.year = 2021;
        this.numberOfDoors = 4;
    }
    /**
     Constructor que inicializa los atributos a los valores pasados como parámetros.
     @param brand Marca del auto.
     @param model Modelo del auto.
     @param year Año de fabricación del auto.
     @param numberOfDoors Número de puertas del auto.
     */

    public Car(String brand, String model, int year, int numberOfDoors) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.numberOfDoors = numberOfDoors;
    }
    /**
     Devuelve la marca del auto.
     @return Marca del auto.
     */
    public String getBrand() {
        return brand;
    }
    /**
     Establece la marca del auto.
     @param brand Marca del auto.
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }
    /**
     Devuelve el modelo del auto.
     @return Modelo del auto.
     */
    public String getModel() {
        return model;
    }
    /**
     Establece el modelo del auto.
     @param model Modelo del auto.
     */
    public void setModel(String model) {
        this.model = model;
    }
    /**
     Devuelve el año de fabricación del auto.
     @return Año de fabricación del auto.
     */

    public int getYear() {
        return year;
    }
    /**
     Establece el año de fabricación del auto.
     @param year Año de fabricación del auto.
     */
    public void setYear(int year) {
        this.year = year;
    }
    /**
     Devuelve el número de puertas del auto.
     @return Número de puertas del auto.
     */
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    /**
    Establece el número de puertas del auto.
    @param numberOfDoors Número de puertas del auto.
     */
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
