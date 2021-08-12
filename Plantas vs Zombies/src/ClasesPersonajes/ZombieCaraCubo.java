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
public class ZombieCaraCubo extends Zombie {
    private final JLabel zombieCaraCuboImg;
    private final File ruta;
    
    public ZombieCaraCubo() {
        //frecuenciaMov,resistencia,daño,rango 
        super(4, 8, 1, 1);
        zombieCaraCuboImg = new JLabel();
        ruta = new File("ZombieCaraCubo.png");
         zombieCaraCuboImg.setIcon(new ImageIcon(ruta.getAbsolutePath()));
    }

    @Override
    public JLabel crearImagen(int i, int j) { 
        zombieCaraCuboImg.setBounds(i * 130 + 34, j * 40, 69, 40);
        return zombieCaraCuboImg;
    }

    @Override
    public JLabel getImagen() {
        return zombieCaraCuboImg;
    }

}
