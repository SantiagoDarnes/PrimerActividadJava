
public class Lamparita {

    private boolean encendido = false;

    public Lamparita() {
    }

    public void encender() {
        this.encendido = true;
    }

    public void apagar() {
        this.encendido = false;
    }

    public void isEncendido() {
        if (encendido) {
            System.out.println("La lamparita esta encendida");
        }
        else {
            System.out.println("La lamparita esta apagada");
        }
    }

    public static void main(String[] args) {
        System.out.println("Vamos a programar una lamparita! ");
    }
}
