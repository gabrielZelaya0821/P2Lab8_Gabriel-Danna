package p2lab8_gabrielzelaya.dannacasco;

import java.awt.Color;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import p2lab8_gabrielzelaya.dannacasco.modelos.SeresVivos;
import p2lab8_gabrielzelaya.dannacasco.modelos.Universos;
import p2lab8_gabrielzelaya.dannacasco.persistenciaDatos.Dba;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import p2lab8_gabrielzelaya.dannacasco.modelos.JBar;
import p2lab8_gabrielzelaya.dannacasco.persistenciaDatos.ManejoBinarios;

/**
 *
 * @author Danna Casco
 */
public class mainLab8 extends javax.swing.JFrame {

    /**
     * Creates new form mainLab8
     */
    public mainLab8() {
        initComponents();
        btn_eliminarLista.setVisible(false);
        Dba db = new Dba("./db_lab8.accdb");
        db.conectar();
        try {
            db.query.execute("select Nombre,Poder,Años,Universo,Raza from table_vivo");
            ResultSet rs = db.query.getResultSet();
            while (rs.next()) {
                SeresVivos servivo = new SeresVivos(
                        rs.getString(1),
                        new Universos(rs.getString(4)),
                        rs.getString(5),
                        Integer.parseInt(rs.getString(3)),
                        Integer.parseInt(rs.getString(2))
                );
                seresVivos.add(servivo);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();
        if (binario!=null) {
            System.out.println(binario.getDatos());
            ArrayList<Universos> universosLocal = binario.getDatos();
            DefaultComboBoxModel modeloCombo = (DefaultComboBoxModel) cb_universo.getModel();
            modeloCombo.addAll(universosLocal);
            cb_universo.setModel(modeloCombo);
            cb_universo1.setModel(modeloCombo);
        }

        bg_agregar.setVisible(false);
        bg_modificar.setVisible(false);
        mostrar_vivos.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_principal = new javax.swing.JPanel();
        bg_crudVivo = new javax.swing.JPanel();
        btn_agregar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_crearUniverso = new javax.swing.JButton();
        bg_agregar = new javax.swing.JPanel();
        txt_agregar = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        txt_poder = new javax.swing.JLabel();
        txt_raza = new javax.swing.JLabel();
        txt_años = new javax.swing.JLabel();
        txt_Universo = new javax.swing.JLabel();
        spinner_años = new javax.swing.JSpinner();
        spinner_poder = new javax.swing.JSpinner();
        cb_universo = new javax.swing.JComboBox<>();
        cb_raza = new javax.swing.JComboBox<>();
        btn_agregarVivo = new javax.swing.JButton();
        bg_modificar = new javax.swing.JPanel();
        txt_modificar = new javax.swing.JLabel();
        tf_nombre1 = new javax.swing.JTextField();
        txt_poder1 = new javax.swing.JLabel();
        txt_raza1 = new javax.swing.JLabel();
        txt_años1 = new javax.swing.JLabel();
        txt_Universo1 = new javax.swing.JLabel();
        spinner_años1 = new javax.swing.JSpinner();
        spinner_poder1 = new javax.swing.JSpinner();
        cb_universo1 = new javax.swing.JComboBox<>();
        cb_raza1 = new javax.swing.JComboBox<>();
        btn_modificarVivo = new javax.swing.JButton();
        mostrar_vivos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista_vivos = new javax.swing.JList<>();
        btn_listaMod = new javax.swing.JButton();
        btn_atras = new javax.swing.JButton();
        btn_eliminarLista = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg_principal.setBackground(new java.awt.Color(255, 255, 255));

        bg_crudVivo.setBackground(new java.awt.Color(255, 255, 255));
        bg_crudVivo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_agregar.setBackground(new java.awt.Color(0, 153, 204));
        btn_agregar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_agregar.setForeground(new java.awt.Color(255, 255, 255));
        btn_agregar.setText("Agregar ser vivo");
        btn_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_agregarMouseClicked(evt);
            }
        });
        bg_crudVivo.add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 140, 30));

        btn_eliminar.setBackground(new java.awt.Color(0, 153, 204));
        btn_eliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_eliminarMouseClicked(evt);
            }
        });
        bg_crudVivo.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 140, 30));

        btn_modificar.setBackground(new java.awt.Color(0, 153, 204));
        btn_modificar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_modificar.setForeground(new java.awt.Color(255, 255, 255));
        btn_modificar.setText("Modificar");
        btn_modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_modificarMouseClicked(evt);
            }
        });
        bg_crudVivo.add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 140, 30));

        btn_crearUniverso.setBackground(new java.awt.Color(0, 153, 204));
        btn_crearUniverso.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_crearUniverso.setForeground(new java.awt.Color(255, 255, 255));
        btn_crearUniverso.setText("Crear Universo");
        btn_crearUniverso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_crearUniversoMouseClicked(evt);
            }
        });
        bg_crudVivo.add(btn_crearUniverso, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 140, 30));

        bg_agregar.setBackground(new java.awt.Color(241, 237, 237));

        txt_agregar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_agregar.setForeground(new java.awt.Color(0, 153, 204));
        txt_agregar.setText("Agregar ser vivo");

        tf_nombre.setForeground(new java.awt.Color(228, 223, 223));
        tf_nombre.setText("Nombre");
        tf_nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_nombreMouseClicked(evt);
            }
        });

        txt_poder.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_poder.setForeground(new java.awt.Color(0, 153, 204));
        txt_poder.setText("Poder:");

        txt_raza.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_raza.setForeground(new java.awt.Color(0, 153, 204));
        txt_raza.setText("Raza:");

        txt_años.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_años.setForeground(new java.awt.Color(0, 153, 204));
        txt_años.setText("Años:");

        txt_Universo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_Universo.setForeground(new java.awt.Color(0, 153, 204));
        txt_Universo.setText("Universo:");

        cb_raza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Humano", "Amanto", " " }));

        btn_agregarVivo.setBackground(new java.awt.Color(0, 153, 204));
        btn_agregarVivo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_agregarVivo.setForeground(new java.awt.Color(255, 255, 255));
        btn_agregarVivo.setText("Agregar");
        btn_agregarVivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_agregarVivoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bg_agregarLayout = new javax.swing.GroupLayout(bg_agregar);
        bg_agregar.setLayout(bg_agregarLayout);
        bg_agregarLayout.setHorizontalGroup(
            bg_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_agregarLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(bg_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg_agregarLayout.createSequentialGroup()
                        .addComponent(txt_poder)
                        .addGap(60, 60, 60)
                        .addComponent(spinner_poder, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_agregarLayout.createSequentialGroup()
                        .addGroup(bg_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_años)
                            .addComponent(txt_Universo)
                            .addComponent(txt_raza))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(bg_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spinner_años)
                            .addComponent(cb_universo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_raza, 0, 178, Short.MAX_VALUE)))
                    .addComponent(tf_nombre))
                .addGap(53, 53, 53))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_agregarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bg_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_agregarLayout.createSequentialGroup()
                        .addComponent(txt_agregar)
                        .addGap(133, 133, 133))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_agregarLayout.createSequentialGroup()
                        .addComponent(btn_agregarVivo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120))))
        );
        bg_agregarLayout.setVerticalGroup(
            bg_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_agregarLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(txt_agregar)
                .addGap(99, 99, 99)
                .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bg_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_poder)
                    .addComponent(spinner_poder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bg_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_años)
                    .addComponent(spinner_años, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(bg_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_Universo)
                    .addComponent(cb_universo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(bg_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg_agregarLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(txt_raza))
                    .addGroup(bg_agregarLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_raza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(btn_agregarVivo)
                .addGap(57, 57, 57))
        );

        bg_crudVivo.add(bg_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, -1, 390, 460));

        bg_modificar.setBackground(new java.awt.Color(241, 237, 237));

        txt_modificar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_modificar.setForeground(new java.awt.Color(0, 153, 204));
        txt_modificar.setText("Modificar ser vivo");

        tf_nombre1.setForeground(new java.awt.Color(228, 223, 223));
        tf_nombre1.setText("Nombre");
        tf_nombre1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_nombre1MouseClicked(evt);
            }
        });

        txt_poder1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_poder1.setForeground(new java.awt.Color(0, 153, 204));
        txt_poder1.setText("Poder:");

        txt_raza1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_raza1.setForeground(new java.awt.Color(0, 153, 204));
        txt_raza1.setText("Raza:");

        txt_años1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_años1.setForeground(new java.awt.Color(0, 153, 204));
        txt_años1.setText("Años:");

        txt_Universo1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_Universo1.setForeground(new java.awt.Color(0, 153, 204));
        txt_Universo1.setText("Universo:");

        cb_raza1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Humano", "Amanto", " " }));

        btn_modificarVivo.setBackground(new java.awt.Color(0, 153, 204));
        btn_modificarVivo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_modificarVivo.setForeground(new java.awt.Color(255, 255, 255));
        btn_modificarVivo.setText("Modificar");
        btn_modificarVivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_modificarVivoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bg_modificarLayout = new javax.swing.GroupLayout(bg_modificar);
        bg_modificar.setLayout(bg_modificarLayout);
        bg_modificarLayout.setHorizontalGroup(
            bg_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_modificarLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(bg_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg_modificarLayout.createSequentialGroup()
                        .addComponent(txt_poder1)
                        .addGap(60, 60, 60)
                        .addComponent(spinner_poder1, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_modificarLayout.createSequentialGroup()
                        .addGroup(bg_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_años1)
                            .addComponent(txt_Universo1)
                            .addComponent(txt_raza1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(bg_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spinner_años1)
                            .addComponent(cb_universo1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_raza1, 0, 178, Short.MAX_VALUE)))
                    .addComponent(tf_nombre1))
                .addGap(53, 53, 53))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_modificarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bg_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_modificarLayout.createSequentialGroup()
                        .addComponent(txt_modificar)
                        .addGap(133, 133, 133))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_modificarLayout.createSequentialGroup()
                        .addComponent(btn_modificarVivo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120))))
        );
        bg_modificarLayout.setVerticalGroup(
            bg_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_modificarLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(txt_modificar)
                .addGap(105, 105, 105)
                .addComponent(tf_nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bg_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_poder1)
                    .addComponent(spinner_poder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bg_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_años1)
                    .addComponent(spinner_años1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(bg_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_Universo1)
                    .addComponent(cb_universo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(bg_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg_modificarLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(txt_raza1))
                    .addGroup(bg_modificarLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_raza1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(btn_modificarVivo)
                .addGap(57, 57, 57))
        );

        bg_crudVivo.add(bg_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, -1, 390, 460));

        lista_vivos.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(lista_vivos);

        btn_listaMod.setText("Modificar");
        btn_listaMod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_listaModMouseClicked(evt);
            }
        });

        btn_atras.setText("X");
        btn_atras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_atrasMouseClicked(evt);
            }
        });

        btn_eliminarLista.setText("Eliminar");
        btn_eliminarLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_eliminarListaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mostrar_vivosLayout = new javax.swing.GroupLayout(mostrar_vivos);
        mostrar_vivos.setLayout(mostrar_vivosLayout);
        mostrar_vivosLayout.setHorizontalGroup(
            mostrar_vivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mostrar_vivosLayout.createSequentialGroup()
                .addGroup(mostrar_vivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mostrar_vivosLayout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(btn_listaMod)
                        .addGap(110, 110, 110)
                        .addComponent(btn_eliminarLista))
                    .addGroup(mostrar_vivosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_atras)
                        .addGap(53, 53, 53)
                        .addGroup(mostrar_vivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE))))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        mostrar_vivosLayout.setVerticalGroup(
            mostrar_vivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mostrar_vivosLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(mostrar_vivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_atras)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(mostrar_vivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_listaMod)
                    .addComponent(btn_eliminarLista))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bg_principalLayout = new javax.swing.GroupLayout(bg_principal);
        bg_principal.setLayout(bg_principalLayout);
        bg_principalLayout.setHorizontalGroup(
            bg_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_principalLayout.createSequentialGroup()
                .addComponent(bg_crudVivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(bg_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bg_principalLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(mostrar_vivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        bg_principalLayout.setVerticalGroup(
            bg_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_crudVivo, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
            .addGroup(bg_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bg_principalLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(mostrar_vivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_principal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarVivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarVivoMouseClicked
        SeresVivos vivo = new SeresVivos(
                tf_nombre.getText(),
                (Universos) cb_universo.getSelectedItem(),
                String.valueOf(cb_raza.getSelectedItem()),
                (int) spinner_años.getValue(),
                (int) spinner_poder.getValue()
        );
        seresVivos.add(vivo);

        //agrega a la base de datos
        Dba db = new Dba("./db_lab8.accdb");
        db.conectar();
        try {
            db.query.execute("INSERT INTO table_vivo"
                    + " (Nombre,Poder,Años,Universo,Raza)"
                    + " VALUES ('" + vivo.getNombre() + "', '"
                    + vivo.getPoder() + "', '" + vivo.getAños() + "', '" + vivo.getUniverso() + "','" + vivo.getRaza() + "')");

            db.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();

        //agregar a la lista
        DefaultListModel modelo = (DefaultListModel) lista_vivos.getModel();
        modelo.addElement(vivo);
        JOptionPane.showMessageDialog(this, "¡Agregado exitosamente!");
    }//GEN-LAST:event_btn_agregarVivoMouseClicked

    private void tf_nombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_nombreMouseClicked
        tf_nombre.setText("");
        tf_nombre.setForeground(Color.black);
    }//GEN-LAST:event_tf_nombreMouseClicked

    private void tf_nombre1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_nombre1MouseClicked
        tf_nombre1.setText("");
        tf_nombre1.setForeground(Color.black);
    }//GEN-LAST:event_tf_nombre1MouseClicked

    private void btn_modificarVivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modificarVivoMouseClicked
        bg_crudVivo.setVisible(false);

        DefaultListModel modelo = (DefaultListModel) lista_vivos.getModel();
        SeresVivos vivo = (SeresVivos) modelo.getElementAt(lista_vivos.getSelectedIndex());

        vivo.setNombre(tf_nombre1.getText());
        vivo.setUniverso((Universos) cb_universo1.getSelectedItem());
        vivo.setRaza(String.valueOf(cb_raza1.getSelectedItem()));
        vivo.setAños((int) spinner_años1.getValue());
        vivo.setPoder((int) spinner_poder1.getValue());

        mostrar_vivos.setVisible(true);
    }//GEN-LAST:event_btn_modificarVivoMouseClicked

    private void btn_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarMouseClicked
        bg_agregar.setVisible(true);
    }//GEN-LAST:event_btn_agregarMouseClicked

    private void btn_modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modificarMouseClicked
        bg_agregar.setVisible(false);
        mostrar_vivos.setVisible(true);
        bg_crudVivo.setVisible(false);

        JBar barra = new JBar(jProgressBar1, seresVivos.size(), seresVivos, lista_vivos);
        barra.start();

    }//GEN-LAST:event_btn_modificarMouseClicked

    private void btn_listaModMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_listaModMouseClicked
        bg_modificar.setVisible(true);
        bg_crudVivo.setVisible(true);
        mostrar_vivos.setVisible(false);
        DefaultListModel modelo = (DefaultListModel) lista_vivos.getModel();
        SeresVivos element = (SeresVivos) modelo.getElementAt(lista_vivos.getSelectedIndex());

        tf_nombre1.setText(element.getNombre());
        spinner_poder1.setValue(element.getPoder());
        spinner_años1.setValue(element.getAños());
        cb_universo1.setSelectedItem(element.getUniverso());
        cb_raza1.setSelectedItem(element.getRaza());
    }//GEN-LAST:event_btn_listaModMouseClicked

    private void btn_crearUniversoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_crearUniversoMouseClicked
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del universo");
        Universos u = new Universos(nombre);
        universos.add(u);
        try {
            binario = new ManejoBinarios(nombre);
            //agrega al binario
            binario.escribirBinario(u);
            DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_universo.getModel();
            modelo.addElement(u);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }//GEN-LAST:event_btn_crearUniversoMouseClicked

    private void btn_atrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_atrasMouseClicked
        mostrar_vivos.setVisible(false);
        bg_crudVivo.setVisible(true);

        DefaultListModel modelo = (DefaultListModel) lista_vivos.getModel();
        modelo.removeAllElements();
    }//GEN-LAST:event_btn_atrasMouseClicked

    private void btn_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarMouseClicked
        bg_crudVivo.setVisible(false);
        mostrar_vivos.setVisible(true);
        btn_eliminarLista.setVisible(true);
        btn_listaMod.setVisible(false);
    }//GEN-LAST:event_btn_eliminarMouseClicked

    private void btn_eliminarListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarListaMouseClicked
        bg_modificar.setVisible(false);
        bg_crudVivo.setVisible(true);
        mostrar_vivos.setVisible(false);
        btn_listaMod.setVisible(false);

        DefaultListModel modelo = (DefaultListModel) lista_vivos.getModel();
        SeresVivos element = (SeresVivos) modelo.getElementAt(lista_vivos.getSelectedIndex());
        modelo.remove(lista_vivos.getSelectedIndex());
        seresVivos.remove(element);

        Dba db = new Dba("./db_lab8.accdb");
        db.conectar();
        try {
            System.out.println(lista_vivos.getSelectedIndex());
            db.query.execute("delete from table_vivo where Id=" + lista_vivos.getSelectedIndex());
            db.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();
    }//GEN-LAST:event_btn_eliminarListaMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new mainLab8().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg_agregar;
    private javax.swing.JPanel bg_crudVivo;
    private javax.swing.JPanel bg_modificar;
    private javax.swing.JPanel bg_principal;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_agregarVivo;
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_crearUniverso;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_eliminarLista;
    private javax.swing.JButton btn_listaMod;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_modificarVivo;
    private javax.swing.JComboBox<String> cb_raza;
    private javax.swing.JComboBox<String> cb_raza1;
    private javax.swing.JComboBox<String> cb_universo;
    private javax.swing.JComboBox<String> cb_universo1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lista_vivos;
    private javax.swing.JPanel mostrar_vivos;
    private javax.swing.JSpinner spinner_años;
    private javax.swing.JSpinner spinner_años1;
    private javax.swing.JSpinner spinner_poder;
    private javax.swing.JSpinner spinner_poder1;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_nombre1;
    private javax.swing.JLabel txt_Universo;
    private javax.swing.JLabel txt_Universo1;
    private javax.swing.JLabel txt_agregar;
    private javax.swing.JLabel txt_años;
    private javax.swing.JLabel txt_años1;
    private javax.swing.JLabel txt_modificar;
    private javax.swing.JLabel txt_poder;
    private javax.swing.JLabel txt_poder1;
    private javax.swing.JLabel txt_raza;
    private javax.swing.JLabel txt_raza1;
    // End of variables declaration//GEN-END:variables

    private ArrayList<SeresVivos> seresVivos = new ArrayList<>();
    private ArrayList<Universos> universos = new ArrayList<>();
    ManejoBinarios binario;
}
