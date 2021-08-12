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
public class ZombieComun extends Zombie {

    private final JLabel zombieComunImg;
    private final File ruta;

    /**
     * Constructor
     */
    public ZombieComun() {
        //(frecuenciaMov, resistencia, daño,rango)
        super(2, 5, 1, 1);
        ruta = new File("ZombieComun.png");
        zombieComunImg= new JLabel();
        zombieComunImg.setIcon(new ImageIcon(ruta.getAbsolutePath()));
        
    }

    @Override
    public JLabel crearImagen(int i, int j) {
        zombieComunImg.setBounds(i * 130 + 34, j * 40, 69, 40);
        return zombieComunImg;
    }

    @Override
    public JLabel getImagen() {
        return zombieComunImg;
    }

}
