package logic;

/**
 * La clase Book representa un libro con título, autor, categoría y número de páginas.
 */
public class Book {
    private String title; // Título del libro
    private String author; // Autor del libro
    private String category; // Categoría del libro
    private int numberOfPage; // Número de páginas del libro

    /**
     * Constructor sin parámetros que inicializa los atributos con valores por defecto.
     */
    public Book() {
        this.title = "Nada";
        this.author = "Carmen Laforet";
        this.category = "ficcion literaria";
        this.numberOfPage = 368;
    }

    /**
     * Constructor con parámetros que inicializa los atributos con los valores recibidos.
     *
     * @param title Título del libro
     * @param author Autor del libro
     * @param category Categoría del libro
     * @param numberOfPage Número de páginas del libro
     */
    public Book(String title,String author , String category, int numberOfPage) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.numberOfPage = numberOfPage;
    }

    /**
     * Devuelve el título del libro.
     *
     * @return Título del libro
     */
    public String getTitle() {
        return title;
    }

    /**
     * Establece el título del libro.
     *
     * @param title Título del libro
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Devuelve el autor del libro.
     *
     * @return Autor del libro
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Establece el autor del libro.
     *
     * @param author Autor del libro
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Devuelve la categoría del libro.
     *
     * @return Categoría del libro
     */
    public String getCategory() {
        return category;
    }

    /**
     * Establece la categoría del libro.
     *
     * @param category Categoría del libro
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Devuelve el número de páginas del libro.
     *
     * @return Número de páginas del libro
     */
    public int getNumberOfPage() {
        return numberOfPage;
    }

    /**
     * Establece el número de páginas del libro.
     *
     * @param numberOfPage Número de páginas del libro
     */
    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }
}
