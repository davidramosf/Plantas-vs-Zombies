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
 * @author david
 */
public class ColBoxeadora extends Planta {

    private final JLabel colBoxeadoraImg;
    private final File ruta;

    public ColBoxeadora() {
        //(coste,frecuencia,resistencia,daño,rango)
        super(75, 1, 4, 2, 2);
        colBoxeadoraImg = new JLabel();
        ruta = new File("ColBoxeadora.png");
    }

    @Override
    public JLabel crearImagen(int i, int j) {
        colBoxeadoraImg.setIcon(new ImageIcon(ruta.getAbsolutePath()));
        colBoxeadoraImg.setBounds(i * 130 + 34, j * 40, 69, 40);
        return colBoxeadoraImg;
    }

    @Override
    public JLabel getImagen() {
        return colBoxeadoraImg;
    }
}
