/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util.Classes;

import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author Tadeu
 */
public class FileChoserManager {

    public static String open() {
        String diretorio = null;
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.CANCEL_OPTION) {
        } else {
            diretorio = fileChooser.getSelectedFile().getPath();
        }
        return diretorio;
    }

    public static String save() {
        String diretorio = null;
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int result = chooser.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            diretorio = chooser.getSelectedFile().getAbsolutePath()+File.separator;
        }
        return diretorio;
    }

}
