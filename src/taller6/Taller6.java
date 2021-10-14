package taller6;

import javax.swing.JOptionPane;
public class Taller6 {

    public static void main(String[] args) {
        int dd = 0, mm = 0, aa = 0;
        Fecha F = new Fecha();
        do {
            dd = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite Día:"));
            mm = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite Mes:"));

            do {
                aa = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite Año desde 1963:"));
            } while (aa < 1963);

            try {
                F.comprobar(dd, mm, aa);
            } catch (ExceptoFecha e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
                dd = mm = aa = 0;
            }

        } while (dd == 0 && mm == 0 && aa == 0);
        System.exit(0);
    }

}
