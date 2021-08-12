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
public class ZombieGrandullon extends Zombie {
    private final JLabel zombieGrandullonImg;
    private final File ruta;
    
    public ZombieGrandullon() {
        //(frecuenciaMov, resistencia, daño,rango)
        super(5, 20, 3, 1);
        ruta = new File ("ZombieGrandullon.png");
        zombieGrandullonImg = new JLabel();
        zombieGrandullonImg.setIcon(new ImageIcon(ruta.getAbsolutePath()));
    }

    @Override
    public JLabel crearImagen(int i, int j) {
        zombieGrandullonImg.setBounds(i * 130 + 34, j * 40, 69, 40);
        return zombieGrandullonImg;
    }

    @Override
    public JLabel getImagen() {
        return zombieGrandullonImg;
    }

}
