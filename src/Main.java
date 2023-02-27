import javax.swing.*;

public class Main {
    public static void main(String[] args) {


        //Variables
        int edad;
        String raza, tamano, color;

        //Entradas
        raza = JOptionPane.showInputDialog("Escribe la raza de tu perro:");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Captura la edad de tu perro:"));
        tamano = JOptionPane.showInputDialog("Captura el tamaño de tu perro:");
        color = JOptionPane.showInputDialog("Captura el color de tu perro:");


        //Crear el objeto
        Perro Gigi = new Perro(edad, raza, tamano, color);  //Instanciar una clase es contruir un objeto

        //Invocar comportamientos
        Gigi.comer();
        Gigi.dormir();
        Gigi.jugar();
        Gigi.correr();

        //Probar valores que se guardaron al crear el objeto
        System.out.println("La raza de tu perro es: " + Gigi.raza);
        System.out.println("El color de tu perro es: " + Gigi.color);
        System.out.println("El tamaño de tu perro es: " + Gigi.tamano);
        System.out.println("La edad de tu perro es: " + Gigi.edad);


    }
}