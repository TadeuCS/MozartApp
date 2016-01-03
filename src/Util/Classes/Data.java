package Util.Classes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class Data {

    private String data;
    private int dia;
    private int mes;
    private int ano;
    static SimpleDateFormat format;

     public static int getDiferencaEntreDatas(String dataInicial, String dataFinal) {
        int qtdeDias = 0;
        try {
            GregorianCalendar ini = new GregorianCalendar();
            GregorianCalendar fim = new GregorianCalendar();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            ini.setTime(sdf.parse(dataInicial));
            fim.setTime(sdf.parse(dataFinal));
            long dt1 = ini.getTimeInMillis();
            long dt2 = fim.getTimeInMillis();
            qtdeDias = (int) (((dt2 - dt1) / 86400000));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao calcular os dias entre duas datas!");
        }
        return qtdeDias;
    }

    public static String getDataByStringSemBarras(String data) {
        return data.substring(0, 2) + "/" + data.substring(2, 4) + "/" + data.substring(4, 8);
    }

    public static String getIdade(Date dataNascimento) {
        GregorianCalendar hj = new GregorianCalendar();
        GregorianCalendar nascimento = new GregorianCalendar();
        nascimento.setTime(dataNascimento);
        int idade = hj.get(Calendar.YEAR) - nascimento.get(Calendar.YEAR);
        return idade + "";
    }

    public static Date getDataByTexto(String data, String formato) {
        try {
            Date date = null;
            DateFormat formatter = new SimpleDateFormat(formato);
            date = (java.util.Date) formatter.parse(data);
            return date;
        } catch (Exception e) {
            return null;
        }
    }

    public static String getData(String formato) {
        SimpleDateFormat sdf = new SimpleDateFormat(formato);
        Date data = new Date();
        return sdf.format(data);
    }

    public static String getDataByDate(Date data, String formato) {
        SimpleDateFormat sdf = new SimpleDateFormat(formato);
        return sdf.format(data);
    }

    public String completaData(String texto, String formato) {
        if (texto.contains("  /  /    ")) {
            texto = getData(formato);
        } else {
            if (texto.endsWith("/  /    ")) {
                String dataAtual = getData(formato);
                texto = dataAtual.replace(dataAtual.substring(0, 2), texto.substring(0, 2));
            } else {
                if (texto.endsWith("/    ")) {
                    String dataAtual = getData(formato);
                    texto = texto.replaceAll("    ", dataAtual.substring(6, 10));
                } else {
                    if ("  ".equals(texto.substring(8, 10))) {
                        String dataAtual = getData(formato);
                        texto = texto.replaceAll(texto.substring(6, 8) + "  ", dataAtual.substring(6, 8) + texto.substring(6, 8));
                    }
                }
            }
        }
        return validaData(texto);
    }

    public String validaData(String dataTemp) {

        int mesTemp;
        int diaTemp;
        data = dataTemp.replace("/", "");
        dia = Integer.parseInt(data.trim().substring(0, 2));
        mes = Integer.parseInt(data.trim().substring(2, 4));
        ano = Integer.parseInt(data.trim().substring(4, 8));
        mesTemp = checaMes(mes);
        if (mesTemp != -1) {
            mes = mesTemp;
            diaTemp = checaDia(dia);
            if (diaTemp != -1) {
                dia = diaTemp;
            } else {
                JOptionPane.showMessageDialog(null, "Data Inválida");
                dataTemp = null;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Data Inválida!");
            dataTemp = null;
        }
        return dataTemp;
    }

    public int checaMes(int mesTemp) {

        if (mesTemp > 0 && mesTemp <= 12) {
            return mesTemp;
        } else {
            return -1;
        }
    }

    public int checaDia(int diaTemp) {
        int ultimoDiaMes[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (diaTemp > 0 && diaTemp <= ultimoDiaMes[mes]) {
            return diaTemp;
        } else if ((mes == 2 && diaTemp == 29) && (ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))) {
            return diaTemp;
        } else {
            return -1;
        }
    }

    public static String addDayOfDate(Date data, int dias) {
        Calendar c = Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            c.setTime(data);
            c.add(Calendar.DATE, +dias);
        } catch (Exception e) {
            System.out.println("Erro ao adicionar " + dias + " a data de valide: " + e.getMessage());
        }
        return format.format(c.getTime());
    }

    public static String addMes(Date data, int mes, String formato) {
        Calendar c = Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat(formato);
        try {
            c.setTime(data);
            c.add(Calendar.MONTH, +mes);
        } catch (Exception e) {
            System.out.println("Erro ao adicionar " + mes + "\n" + e.getMessage());
        }
        return format.format(c.getTime());
    }

    public static boolean comparaDatas(Date dataSistema, Date dataValidade) {
        boolean retorno = false;
        //se retorno igual a true, a data de validade está posterior a data do sistema
        format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            dataValidade = new Date(format.parse(format.format(dataValidade)).getTime());
            dataSistema = new Date(format.parse(format.format(dataSistema)).getTime());
            if ((dataValidade.after(dataSistema)) || (dataValidade.getTime() == dataSistema.getTime())) {
                retorno = true;
            } else {
                retorno = false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao comparar as datas!\n" + e);
        }
        return retorno;
    }
}
