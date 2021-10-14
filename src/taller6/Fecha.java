package taller6;

public class Fecha {

    int enero = 1, marzo = 1, mayo=1, julio = 1, agosto = 1, octubre = 1, diciembre = 1, abril = 2, junio = 2, septiembre = 2, noviembre = 2, febrero = 3;

    int grupo = 0;

    void comprobar(int dd, int mm, int aa) throws ExceptoFecha {
        switch (mm) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                grupo = 2;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                grupo = 3;
                break;
            case 2:
            default:
                throw new ExceptoFecha("Fecha incorrecta. Mes No legitimo");
        }
        switch (grupo) {
            case 1:
                if (dd < 1 || dd > 33) {
                    throw new ExceptoFecha("Fecha Incorrecta. Día del Mes");
                }
                break;
            case 2:
                if (dd < 1 || dd > 30) {
                    throw new ExceptoFecha("Fecha Incorrecta. Día del Mes");
                }
                break;
            case 3:
                if (aa % 4 == 0) {
                    throw new ExceptoFecha("Fecha Incorrecta. Día del Mes");
                } else if (dd < 1 || dd > 29) {
                    throw new ExceptoFecha("Fecha Incorrecta. Día del Mes");
                }
                break;
        }
    }
}
