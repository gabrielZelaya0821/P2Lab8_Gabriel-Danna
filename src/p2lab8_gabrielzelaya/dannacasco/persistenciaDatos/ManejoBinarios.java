package p2lab8_gabrielzelaya.dannacasco.persistenciaDatos;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author gabri
 * @param <T>
 */
public class ManejoBinarios<T> {

    private File archivo;
    private ArrayList datos;

    public ManejoBinarios(String nombre){
        this.archivo = new File("./data/" + nombre + ".lab8");
        this.datos = new ArrayList<>();
    }

    public ManejoBinarios(File archivo) throws Exception {
        this.archivo = archivo;
        this.datos = new ArrayList<>();
        obtenerDatos();
    }

    public void escribirBinario(T data) {
        try {
            FileOutputStream fos = new FileOutputStream(archivo, true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(data);
            oos.flush();

            oos.close();
            fos.close();
        } catch (IOException e) {
            e.getMessage();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private void obtenerDatos() throws Exception {
        T elemento;
        if (archivo.exists()) {
            try ( ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
                while (true) {
                    try {
                        elemento = (T) ois.readObject();
                        System.out.println(elemento);
                        datos.add(elemento);
                    } catch (Exception e) {
                        if (e instanceof EOFException) {
                            break;
                        } else {
                            e.printStackTrace();
                        }
                    }
                }
            } catch (FileNotFoundException e) {
                e.getMessage();
            }catch (IOException e) {
                e.getMessage();
            }
        } else {
            throw new Exception("No existe el archivo");
        }
    }

    public void eliminarDato(T dato) throws Exception {
        if (datos.remove(dato)) {
            ArrayList<T> copia = datos;
            eliminarArchivo();
            for (T t : copia) {
                escribirBinario(t);
            }
        }
    }

    public void eliminarArchivo() throws Exception {
        if (archivo.exists()) {
            archivo.delete();
        } else {
            throw new Exception("No existe el archivo");
        }
    }

    public void eliminarDato() {

    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<T> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<T> datos) {
        this.datos = datos;
    }

}
