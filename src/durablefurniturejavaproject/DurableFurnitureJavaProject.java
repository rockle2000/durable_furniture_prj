/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package durablefurniturejavaproject;

import de.javasoft.synthetica.simple2d.SyntheticaSimple2DLookAndFeel;
import durablefurniturejavaproject.Common.LoginFrame;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;

/**
 *
 * @author Redmibook 14
 */
public class DurableFurnitureJavaProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           try {
            UIManager.setLookAndFeel(new SyntheticaSimple2DLookAndFeel());
        } catch (Exception ex) {
            Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }
    
}
