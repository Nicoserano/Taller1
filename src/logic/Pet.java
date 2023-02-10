package logic;

/**
 Clase Pet que representa una mascota.

 @author Ronald Serrano
 */
public class Pet {
    // Nombre de la mascota
    private String name;
    // Raza de la mascota
    private String race;
    // Color de la mascota
    private String color;
    // Edad de la mascota
    private int age;

    /**
     Constructor por defecto que establece el nombre en "pepito", la raza en "rottweiler", el color en "negro" y la edad en 5.
     */
    public Pet() {
        this.name = "pepito";
        this.race= "rottweiler";
        this.color= "negro";
        this.age= 5;
    }
    /**
     Constructor que permite establecer el nombre, la raza, el color y la edad de la mascota.
     @param name nombre de la mascota
     @param race raza de la mascota
     @param color color de la mascota
     @param age edad de la mascota
     */
    public Pet(String name, String race , String color, int age) {
        this.name = name;
        this.race = race;
        this.color = color;
        this.age = age;
    }
    /**
     Devuelve el nombre de la mascota.
     @return nombre de la mascota
     */
    public String getName() {
        return name;
    }
    /**
     Establece el nombre de la mascota.
     @param name nombre de la mascota
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     Devuelve la raza de la mascota.
     @return raza de la mascota
     */
    public String getRace() {
        return race;
    }
    /**
     Establece la raza de la mascota.
     @param race raza de la mascota
     */
    public void setRace(String race) {
        this.race = race;
    }
    /**
     Devuelve el color de la mascota.
     @return color de la mascota
     */
    public String getColor() {
        return color;
    }
    /**
     Establece el color de la mascota.
     @param color color de la mascota
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     Devuelve la edad de la mascota.
     @return edad de la mascota
     */
    public int getAge() {
        return age;
    }
    /**
     Establece la edad de la mascota.
     @param age edad de la mascota
     */
    public void setAge(int age) {
        this.age = age;
    }
}
