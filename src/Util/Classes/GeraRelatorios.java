package Util.Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class GeraRelatorios {

    PropertiesManager props;

    public boolean imprimirRelatorioSQLNoRelatorio(Map parametros, String diretorio, String titulo) {
        Connection conn = null;
        try {
            // Carrega conexão via JDBC
            props = new PropertiesManager();
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://" + props.ler("ip") + ":3306/" + props.ler("banco") + "?zeroDateTimeBehavior=convertToNull", 
                    props.ler("usuario"), props.ler("senha"));
            // Preenche o relatório com os dados
            JasperPrint print = JasperFillManager.fillReport(diretorio, parametros, conn);

            if (print == null) {
                JOptionPane.showMessageDialog(null, "Falha ao criar o relatório", "Erro Relatorio", JOptionPane.ERROR_MESSAGE);
                return false;
            } else {
                // verifica se tem alguma página  
                if (print.getPages().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Não há conteúdo no relatório. A visualização foi cancelada", "Relatório vazio", JOptionPane.INFORMATION_MESSAGE);
                    return false;
                } else {
                    // Exibe visualização dos dados
                    JasperViewer jv = new JasperViewer(print, false);
                    jv.setVisible(true);
                    jv.setTitle(titulo);
                    jv.setIconImage(null);
                    return true;
                }
            }

            //exportar pra pdf
            //            JasperExportManager.exportReportToPdfFile(print, "src/Relatorios/RelatorioEmPDF.pdf");
        } catch (JRException e) {
            System.out.println(e);
            return false;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
            return false;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o Banco de Dados.");
            }
        }
    }

    public boolean imprimirRelatorioEmCodigo(String query, String diretorio, Map parametros, String destino) {
        Connection conn = null;
        try {
            // Obtém o diretório da aplicação

            // Carrega conexão via JDBC
            props = new PropertiesManager();
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://" + props.ler("ip") + ":3306/" + props.ler("banco") + "?zeroDateTimeBehavior=convertToNull", props.ler("usuario"), props.ler("senha"));
            Statement sql = conn.createStatement();

            // Carrega fonte de dados
            ResultSet rs = sql.executeQuery(query);
            JRDataSource ds = new JRResultSetDataSource(rs);

            // Preenche o relatório com os dados
            JasperPrint print = JasperFillManager.fillReport(diretorio, parametros, ds);

            // Exibe visualização dos dados
//            JasperViewer.viewReport(print, false);
            JasperExportManager.exportReportToPdfFile(print, destino);
            return true;
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao localizar a classe responsável pela geração do relatório!\n" + ex.getMessage());
            return false;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao executar consulta no Banco de dados!\n" + ex.getMessage());
            return false;
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar relatório!\n" + ex.getMessage());
            return false;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o Banco de Dados.");
            }
        }
    }

//    public boolean imprimirByLista(String caminhoDoRelatorio, Map parametros, List<Etiqueta> etiquetas) {
//        try {
//            //compilação do JRXML
////            JasperReport report = JasperCompileManager.compileReport(caminhoDoRelatorio);
//
//            //preenchimento do relatório
//            //JRBeanCollectionDataSource 
//            JasperPrint print = JasperFillManager.fillReport(caminhoDoRelatorio, parametros, new JRBeanCollectionDataSource(etiquetas));
//
//            if (print == null) {
//                JOptionPane.showMessageDialog(null, "Falha ao criar o relatório", "Erro Relatorio", JOptionPane.ERROR_MESSAGE);
//                return false;
//            } else {
//                // verifica se tem alguma página  
//                if (print.getPages().isEmpty()) {
//                    JOptionPane.showMessageDialog(null, "Não há conteúdo no relatório. A visualização foi cancelada", "Relatório vazio", JOptionPane.INFORMATION_MESSAGE);
//                    return false;
//                } else {
//                    JasperViewer jv = new JasperViewer(print, false);
//                    jv.setVisible(true);
//                    jv.setTitle("Pedido Personalizado");
//                    jv.setIconImage(null);
//                    return true;
//                }
//            }
//
//            //exportar pra pdf
//            //            JasperExportManager.exportReportToPdfFile(print, "src/Relatorios/RelatorioEmPDF.pdf");
//        } catch (JRException e) {
////            JOptionPane.showMessageDialog(null, "Erro ao gerar relatório!\n" + e.getMessage());
//            return false;
//        }
//    }
}
