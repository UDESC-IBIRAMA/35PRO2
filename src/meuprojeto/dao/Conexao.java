/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meuprojeto.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author farah
 */
public class Conexao {
    
    public Conexao(){
        try {   
            System.out.println("classe conexao");
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/meudb1", "postgres", "post1313");
            JOptionPane.showMessageDialog(null, "Conexão estabelecida com sucesso!");
            String sql = "INSERT INTO tabela VALUES (1, 'D')";
            Statement stmt = conexao.createStatement();
            stmt.executeUpdate(sql);
            stmt.close();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
