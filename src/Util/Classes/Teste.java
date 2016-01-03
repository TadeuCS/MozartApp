/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util.Classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Tadeu
 */
public class Teste {

    public static int DiferencaEntreDatas(String data1, String data2) {
        int qtdeDias = 0;
        try {
            GregorianCalendar ini = new GregorianCalendar();
            GregorianCalendar fim = new GregorianCalendar();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            ini.setTime(sdf.parse(data1));
            fim.setTime(sdf.parse(data2));
            long dt1 = ini.getTimeInMillis();
            long dt2 = fim.getTimeInMillis();
            qtdeDias = (int) (((dt2 - dt1) / 86400000));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao calcular os dias entre duas datas!");
        }
        return qtdeDias;
    }

    public static int difDatas(Date dt1, Date dt2) {
        long tempo1 = dt1.getTime();
        long tempo2 = dt2.getTime();
        long difTempo = tempo2 - tempo1;
        return (int) ((difTempo + 60L * 60 * 1000) / (24L * 60 * 60 * 1000)) + 1;
    }

    public static void main(String[] args) {
        System.out.println(Teste.DiferencaEntreDatas("22/11/2015", "25/11/2015"));
    }
}
