/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util.Classes;

/**
 *
 * @author Tadeu
 */
import java.util.*;

import java.io.File;

import javax.swing.JOptionPane;

public class MySQLBackup {

    public MySQLBackup(String usuario, String senha, String nomeBanco, String caminhoMySQLdump,String destino) {

        ProcessBuilder pb = new ProcessBuilder(
                caminhoMySQLdump,
                "--user="+usuario,
                "--password="+senha,
                nomeBanco,
//                "--result-file=" + "."+File.separator+"Backup"+File.separator + nomeBanco ++ ".sql");
                "--result-file=" + destino + nomeBanco+" "+Data.getData("dd-MM-yyyy") + ".sql");
        try {
            pb.start();
            JOptionPane.showMessageDialog(null, "Backup realizado com sucesso.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao realizar o backup do banco" + nomeBanco + "!\n\n" + e);
        }
    }

}
