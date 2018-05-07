/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static jdk.nashorn.internal.objects.NativeMath.round;
import modele.Chambre;
import modele.ChambretDejaReserveException;
import modele.Client;
import modele.RegistreChambre;
import modele.RegistreClient;
import utils.IOFichierChambre;
import utils.IOFichierClient;
import vues.Identifier;

/**
 *
 * @author 1795530
 */
public class AppCtr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Identifier().setVisible(true);

            }
        });
    }
    
}
