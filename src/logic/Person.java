package logic;

import java.util.Date;

/**
 * Clase que representa una persona con sus propiedades.
 *
 * @author Ronald Serramo
 */
public class Person {
    // Propiedades de una persona
    private String name;           // Nombre
    private String lastName1;      // Primer apellido
    private String lastName2;      // Segundo apellido
    private Date dateBirth;        // Fecha de nacimiento
    private float height;          // Altura en metros

    /**
     * Constructor por defecto que inicializa una persona con nombre, apellidos y fecha de nacimiento predeterminados.
     */
    public Person() {
        this.name = "Nicolas";
        this.lastName1 = "Serrano";
        this.lastName2 = "Serna";
        this.dateBirth = new Date(19, 01, 2002);
        this.height = 1.9f;
    }

    /**
     * Constructor que permite inicializar una persona con los valores especificados.
     *
     * @param name      Nombre de la persona
     * @param lastName1 Primer apellido de la persona
     * @param lastName2 Segundo apellido de la persona
     * @param dateBirth Fecha de nacimiento de la persona
     * @param height    Altura de la persona en metros
     */
    public Person(String name, String lastName1, String lastName2, Date dateBirth, float height) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
    }

    /**
     * Devuelve el nombre de la persona.
     *
     * @return Nombre de la persona
     */
    public String getName() {
        return name;
    }

    /**
     * Establece el nombre de la persona.
     *
     * @param name Nombre de la persona
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Devuelve el primer apellido de la persona.
     *
     * @return Primer apellido de la persona
     */
    public String getLastName1() {
        return lastName1;
    }

    /**
     * Establece el primer apellido de la persona.
     *
     * @param lastName1 Primer apellido de la persona
     */
    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    /**
     * Devuelve el segundo apellido de la persona.
     *
     * @return Segundo apellido de la persona
     */
    public String getLastName2() {
        return lastName2;
    }
}


