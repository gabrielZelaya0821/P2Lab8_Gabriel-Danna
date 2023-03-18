
package p2lab8_gabrielzelaya.dannacasco.modelos;

import java.io.Serializable;
import java.util.ArrayList;


public class Universos implements Serializable {
    private String nombre;
    private ArrayList<SeresVivos> seresVivos = new ArrayList();

    public Universos() {
    }

    public Universos(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<SeresVivos> getSeresVivos() {
        return seresVivos;
    }

    public void setSeresVivos(ArrayList<SeresVivos> seresVivos) {
        this.seresVivos = seresVivos;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
