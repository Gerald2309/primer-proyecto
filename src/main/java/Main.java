import javax.swing.*;


public class Main {

    public static void main(String[] args) {
        String nombre;
        nombre = JOptionPane.showInputDialog("Ingrese su nombre por favor.");

        Integer edad;
        edad = Integer.valueOf(JOptionPane.showInputDialog("Ingrese su edad por favor."));

        String celular;
        celular = JOptionPane.showInputDialog("Ingrese su número de celular por favor.");


        System.out.println("Bienvenido/a señor/a "+ nombre +", es un placer para nosotros contar con una persona de "+ edad+" años.\n" +
                "\n" +
                "Próximamente nos comunicaremos con usted al numero "+ celular +".\n" +
                "\n" +
                "Feliz día");

    }
}
