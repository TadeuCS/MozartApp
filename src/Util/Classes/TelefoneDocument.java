/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util.Classes;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;

public class TelefoneDocument extends NormalDocument {

    public TelefoneDocument(int maxlen) {
        super(maxlen);
    }

    @Override
    public void insertString(int offset, String str, AttributeSet attr)
            throws BadLocationException {
        if (str == null) {
            return;
        }

        try {
            Integer.parseInt(str);
        } catch (Exception e) {
            return;
        }

        super.insertString(offset, str, attr);
    }

    public static void trataTelefone(JTextField telefone) {
        if (telefone.getText().replace("(", "").replace(")", "").replace("-", "").trim().replace("(", "").replace(")", "").replace("-", "").trim().length() == 8) {
            telefone.setText("(34) " + telefone.getText().replace("(", "").replace(")", "").replace("-", "").trim().substring(0, 4) + "-" + telefone.getText().replace("(", "").replace(")", "").replace("-", "").trim().substring(4, 8));
        } else {
            if (telefone.getText().replace("(", "").replace(")", "").replace("-", "").trim().trim().length() == 9) {
                telefone.setText("(34) " + telefone.getText().replace("(", "").replace(")", "").replace("-", "").trim().substring(0, 5) + "-" + telefone.getText().replace("(", "").replace(")", "").replace("-", "").trim().substring(5, 9));
            } else {
                if (telefone.getText().replace("(", "").replace(")", "").replace("-", "").trim().length() == 10) {
                    telefone.setText("(" + telefone.getText().replace("(", "").replace(")", "").replace("-", "").trim().substring(0, 2) + ") " + telefone.getText().replace("(", "").replace(")", "").replace("-", "").trim().substring(2, 6) + "-" + telefone.getText().replace("(", "").replace(")", "").replace("-", "").trim().substring(6, 10));
                } else {
                    if (telefone.getText().replace("(", "").replace(")", "").replace("-", "").trim().length() == 11) {
                        telefone.setText("(" + telefone.getText().replace("(", "").replace(")", "").replace("-", "").trim().substring(0, 2) + ") " + telefone.getText().replace("(", "").replace(")", "").replace("-", "").trim().substring(2, 7) + "-" + telefone.getText().replace("(", "").replace(")", "").replace("-", "").trim().substring(7, 11));
                    }else{
                        JOptionPane.showMessageDialog(null, "Erro ao tratar o Telefone: '"+telefone.getText()+"'!");
                    }
                }
            }
        }
    }
}
