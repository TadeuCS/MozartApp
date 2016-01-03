package Util.Classes;

import java.sql.Connection;
import java.sql.Statement;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Conexao {

    PropertiesManager prop;
    Connection con;
    Statement st;
    protected Query query;
    protected EntityManagerFactory emf=Persistence.createEntityManagerFactory("LocaSYSPU");
    protected EntityManager em=emf.createEntityManager();

//    public Conexao() {
//        prop = new PropertiesManager();
//        start();
//    }
//
//    private Map getParametros() {
//        Map map = new HashMap();
//        map.put("javax.persistence.jdbc.url", "jdbc:mysql://" + prop.ler("ip") + ":3306/" + prop.ler("banco") + "?zeroDateTimeBehavior=convertToNull");
//        map.put("javax.persistence.jdbc.user", prop.ler("usuario"));
//        map.put("javax.persistence.jdbc.password", prop.ler("senha"));
//        return map;
//    }
//
//    public Statement getConexao(String ip, String banco, String usuario, String senha) {
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            con = DriverManager.getConnection(
//                    "jdbc:mysql://" + ip + ":3306/" + banco + "?zeroDateTimeBehavior=convertToNull",
//                    usuario,
//                    senha);
//            st = con.createStatement();
//            return st;
//        } catch (Exception e) {
//            return null;
//        }
//    }
//
//    private void start() {
//        if (getConexao(prop.ler("ip"), prop.ler("banco"), prop.ler("usuario"), prop.ler("senha")) != null) {
//            emf = Persistence.createEntityManagerFactory("CorujaAppPU", getParametros());
//            em = emf.createEntityManager();
//        } else {
//            JOptionPane.showMessageDialog(null, "Erro ao conectar no banco de dados neste IP: " + prop.ler("ip"));
//        }
//    }
}
