package batallanaval;

/**
 *
 * @author Alumnos
 */
public class Portaviones implements Barcos{
    
    int [] posiciones = new int [5];
    
    public boolean VerificarDisparo(Coordenada c) {
        return true;
    }

    public boolean VerificarHundimiento(Coordenada c) {
        return true;
    }
    
}
