
package p2lab8_gabrielzelaya.dannacasco.modelos;

public class SeresVivos {
  private String nombre,raza;
  private Universos universo;
  private int anios,poder;

    public SeresVivos() {
    }

    public SeresVivos(String nombre, Universos universo, String raza, int anios,int poder) {
        this.nombre = nombre;
        this.universo = universo;
        this.raza = raza;
        this.anios = anios;
        this.poder = poder;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Universos getUniverso() {
        return universo;
    }

    public void setUniverso(Universos universo) {
        this.universo = universo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getAños() {
        return anios;
    }

    public void setAños(int años) {
        this.anios = años;
    }

    @Override
    public String toString() {
        return  " nombre:" + nombre + " universo:" + universo + " raza:" + raza + " anios:" + anios;
    }
  
    
  
}
