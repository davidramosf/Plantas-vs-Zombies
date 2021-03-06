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
public class FrutaEstrella extends Planta {
    private final JLabel frutaEstrellaImg;
    private final File ruta;
    public FrutaEstrella() {
        //(coste,frecuencia,resistencia,daño,rango)
        super(125, 3, 2, 2, 999);
        frutaEstrellaImg = new JLabel();
        ruta = new File("FrutaEstrella.png");
    }

    @Override
    public JLabel crearImagen(int i, int j) {
        frutaEstrellaImg.setIcon(new ImageIcon(ruta.getAbsolutePath()));
        frutaEstrellaImg.setBounds(i * 130 + 34, j * 40, 69, 40);
        return frutaEstrellaImg;
    }

    @Override
    public JLabel getImagen() {
        return frutaEstrellaImg;
    }

}
