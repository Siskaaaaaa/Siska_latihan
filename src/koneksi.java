
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import static java.lang.Class.forName;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class koneksi {
    Connection con;
    Statement stm;
    
    public void config() throws ClassNotFoundException{
        try{
        Class.forName("com.mysql.Jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://'localhost/siska_login","root","");
        stm= (Statement) con.createStatement();
    }   catch (SQLException ex) {
            Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
catch (Exception e){
        JOptionPane.showMessageDialog(null,"koneksi gagal"+e.getMessage());
    }
    
}

    private static class e {

        private static String getMessage() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public e() {
        }
    }

    private static class DriverManager {

        private static Connection getConnection(String jdbcmysqllocalhostsiska_login, String root, String string) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public DriverManager() {
        }
    }
}
