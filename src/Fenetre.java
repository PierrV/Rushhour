/**
 * Created by valenza-manjaro on 21/11/16.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Fenetre extends JFrame{
    protected JPanel panelBouton = new JPanel(new GridLayout(4, 1, 2, 10));
    protected JPanel panelPrincipale = new JPanel();
    protected JButton bouton1 = new JButton("jouer");
    protected JButton bouton2 = new JButton("option");
    protected JButton bouton3 = new JButton("score");
    protected JButton bouton4 = new JButton("aides");
    public Fenetre(){
        setSize(400,590);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Rush Hour");
        creerMenu();
    }
    public void creerMenu(){
        panelBouton.add(bouton1);
        panelBouton.add(bouton2);
        panelBouton.add(bouton3);
        panelBouton.add(bouton4);
        panelPrincipale.add(panelBouton);
        setContentPane(panelPrincipale);
    }
    public void setButtonControler(ActionListener listener) {

        bouton1.addActionListener(listener);
        bouton2.addActionListener(listener);
        bouton3.addActionListener(listener);
        bouton4.addActionListener(listener);

    }


}
