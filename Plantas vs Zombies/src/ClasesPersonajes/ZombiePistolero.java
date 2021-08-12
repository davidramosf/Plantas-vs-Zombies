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
public class ZombiePistolero extends Zombie {

    private final JLabel zombiePistoleroImg;
    private final File ruta;

    public ZombiePistolero() {
        //(frecuenciaMov, resistencia, daño,rango)
        super(1, 3, 1, 3);
        ruta = new File("ZombiePistolero.png");
        zombiePistoleroImg = new JLabel();
        zombiePistoleroImg.setIcon(new ImageIcon(ruta.getAbsolutePath()));
    }

    @Override
    public JLabel crearImagen(int i, int j) {
        zombiePistoleroImg.setBounds(i * 130 + 34, j * 40, 69, 40);
        return zombiePistoleroImg;
    }

    @Override
    public JLabel getImagen() {
        return zombiePistoleroImg;
    }

}
