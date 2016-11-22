public class Appli {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater( new Runnable() {
            public void run() {
                Fenetre fenetre=new Fenetre();
                fenetre.setVisible(true);

            }
        });
    }
}