import logic.*;

public class Main {
    public static void main(String[] args) {
        // Imprimimos un mensaje
        System.out.println("This is an example bank account class:");
        // Creamos un objeto de la clase BankAccount
        BankAccount account = new BankAccount();
        // Imprimimos el número de cuenta y si está activa
        System.out.println("your number of account is:"+ account.getAccountNumber());
        System.out.println("your account is active:"+ account.isActivated());
        System.out.println("----------------------------------------------------");
        // Imprimimos un mensaje
        System.out.println("This is an example of the book class:");
        // Creamos un objeto de la clase Book
        Book book1= new Book();
        // Imprimimos el título, autor, categoría y número de páginas del libro
        System.out.println("Title:"+ book1.getTitle());
        System.out.println("Author:"+ book1.getAuthor());
        System.out.println("Category:"+book1.getCategory());
        System.out.println("Number of page:"+book1.getNumberOfPage());
        System.out.println("-----------------------------------------------------");
        // Imprimimos un mensaje
        System.out.println("This is an example of the car class");
        // Creamos un objeto de la clase Car
        Car car1= new Car();
        // Imprimimos la marca, modelo, año y número de puertas del coche
        System.out.println("Brand:"+car1.getBrand());
        System.out.println("Model:"+ car1.getModel());
        System.out.println("Year:"+car1.getYear());
        System.out.println("Number of doors:"+car1.getNumberOfDoors());
        System.out.println("-----------------------------------------------------");
        // Imprimimos un mensaje
        System.out.println("This is an example of the fruit class:");
        // Creamos un objeto de la clase Fruit
        Fruit fruit1 = new Fruit();
        // Imprimimos el nombre, peso y color del fruto
        System.out.println("your fruit is:"+ fruit1.getName() );
        System.out.println("the weight of its fruit is:"+fruit1.getAverageWeight());
        System.out.println("the color of its fruit is:"+fruit1.getColors().get(0));
        System.out.println("-----------------------------------------------------");
        // Imprimimos un mensaje
        System.out.println("This is an example of the person class");
        // Creamos un objeto de la clase Person
        Person person1 = new Person();
        // Imprimimos el nombre, apellidos y fecha de nacimiento de la persona
        System.out.println("Name:"+person1.getName());
        System.out.println("Last name 1:"+person1.getLastName1());
        System.out.println("Last name 2:"+ person1.getLastName2());
        System.out.println("Date:"+person1.getDateBirth().toString());
        System.out.println("Height:"+person1.getHeight()+"m");
        System.out.println("-----------------------------------------------------");
        // Imprimimos un mensaje
        System.out.println("This is an example of the pet class:");
        // Creamos un objeto de la clase Pet
        Pet pet1= new Pet();
        //Imprimimos el nombre, raza ,color y edad de la mascota
        System.out.println("Name:"+pet1.getName());
        System.out.println("Race:"+pet1.getRace());
        System.out.println("Color:"+pet1.getColor());
        System.out.println("Age:"+pet1.getAge());
        System.out.println("-----------------------------------------------------");


    }
}