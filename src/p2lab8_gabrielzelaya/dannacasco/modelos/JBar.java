package p2lab8_gabrielzelaya.dannacasco.modelos;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JProgressBar;

/**
 *
 * @author gabri
 */
public class JBar extends Thread {

    private JProgressBar barra;
    private int largo;
    private ArrayList<SeresVivos> seresVivos;
    private JList lista;

    public JBar(JProgressBar barra, int largo, ArrayList<SeresVivos> seresVivos, JList lista) {
        this.barra = barra;
        this.largo = largo * 10;
        this.seresVivos = seresVivos;
        this.lista = lista;
    }

    @Override
    public void run() {
        int contador = 0;
        barra.setMaximum(largo);
        DefaultListModel modelo = (DefaultListModel) lista.getModel();
        while (contador < largo) {
            barra.setValue(contador);
            //agrega a la lista
            System.out.println(seresVivos);
            for (SeresVivos serVivo : seresVivos) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
                modelo.addElement(serVivo);
                contador += 10;
                barra.setValue(contador);
            }
        }

    }

}
