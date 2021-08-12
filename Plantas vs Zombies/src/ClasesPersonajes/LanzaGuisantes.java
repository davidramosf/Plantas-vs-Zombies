/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesPersonajes;

import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author David Ramos y Sergio Sánchez
 */
public class LanzaGuisantes extends Planta {
    private final JLabel lanzaguisantesImg;
    private final File ruta;
    /**
     * Constructor
     */
    public LanzaGuisantes() {
        // (coste,frecuencia, resistencia,daño,rango)
        super(50, 1, 3, 1, 99);
        ruta = new File("Lanzaguistantes.png");
        lanzaguisantesImg = new JLabel();
        lanzaguisantesImg.setIcon(new ImageIcon(ruta.getAbsolutePath()));
    }

    @Override
    public JLabel crearImagen(int i, int j) {
        lanzaguisantesImg.setBounds(i * 130 + 34, j * 40, 69, 40);
        return lanzaguisantesImg;
    }

    @Override
    public JLabel getImagen() {
        return lanzaguisantesImg;
    }

}
