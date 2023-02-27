public class Perro {

    //Atributos
    public int edad;
    public String raza;
    public String tamano;
    public String color;

    //Constructor
    public Perro(int a,String b,String c, String d){
        edad=a;
        raza=b;
        tamano=c;
        color=d;
    }
    //Comportamientos

    public void comer(){
        System.out.println("Tengo hambre,voy a comer...");
    }
    public void correr(){
        System.out.println("Tengo ganas de hacer ejercicio...voy a correr");
    }
    public void dormir(){
        System.out.println("Tengo ganas de una siesta...voy a dormir");
    }
    public void jugar(){
        System.out.println("Tengo ganas de jugar...voy a jugar con mis amigos perritos");
    }

}
