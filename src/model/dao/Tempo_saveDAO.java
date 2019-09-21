/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import com.mysql.jdbc.PreparedStatement;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Tempo_save;

/**
 *
 * @author Marcos Antonio
 */
public class Tempo_saveDAO {
    public void create(Tempo_save temp){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
         
            stmt = (PreparedStatement) con.prepareStatement("INSERT INTO Tempo (idTempo,Cliente_time,Segundos,"
                    + "Minutos,Horas,Nome,CPF,Tempo_limite)VALUES(?,?,?,?,?,?,?,?)");
            
            stmt.setInt(1,temp.getIdTempo());
            stmt.setString(2, temp.getCliente_time());
            stmt.setInt(3,temp.getSegundos());
            stmt.setInt(4,temp.getMinutos());
            stmt.setInt(5,temp.getHoras());
            stmt.setString(6, temp.getNome());
            stmt.setString(7,temp.getCPF());
            stmt.setInt(8,temp.getTempo_limite());
            stmt.executeUpdate();
            
            //JOptionPane.showMessageDialog(null,"Salvo com sucesso !");
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null,"Erro ao salvar !" + ex);
        }finally{
           ConnectionFactory.closeConnection(con, stmt);
        }
        
        
    }
    
    public List<Tempo_save> lista_tempo(int x){
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            ResultSet rs = null; 
            
            List<Tempo_save> lista = new ArrayList<>();
            
            try {
                stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM tempo WHERE idTempo = ?");
                stmt.setInt(1,x);
                rs = stmt.executeQuery();
                
                while(rs.next()){
                    
                  
                    Tempo_save time = new Tempo_save();
                    
                    time.setCliente_time(rs.getString("Cliente_time"));
                    time.setCliente_time(rs.getString("Cliente_time"));
                    time.setSegundos(rs.getInt("Segundos"));
                    time.setMinutos(rs.getInt("Minutos"));
                    time.setHoras(rs.getInt("Horas"));
                    time.setCPF(rs.getString("CPF"));
                    time.setNome(rs.getString("Nome"));
                    time.setTempo_limite(rs.getInt("Tempo_limite"));
                 
                    lista.add(time);
                }
                
            } catch (SQLException ex) {
               // Logger.getLogger(ProdutoDAO_Pao.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Deu erro");
            }finally{
                ConnectionFactory.closeConnection(con, stmt, rs);
            }
            return lista;
        }
    
    public String lista_Nome(int x){
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            ResultSet rs = null; 
            
            //List<Tempo_save> lista = new ArrayList<>();
            String Nome = null;
            
            try {
                stmt = (PreparedStatement) con.prepareStatement("SELECT Nome FROM tempo where idTempo = ?");
                stmt.setInt(1,x);
                rs = stmt.executeQuery();
                
               // while(rs.next()){
                    
                  
                //    Tempo_save time = new Tempo_save();
                    
                 //   time.setCliente_time(rs.getString("Cliente_time"));
                 //   time.setCliente_time(rs.getString("Cliente_time"));
                 //   time.setSegundos(rs.getInt("Segundos"));
                 //   time.setMinutos(rs.getInt("Minutos"));
                 //   time.setHoras(rs.getInt("Horas"));
                 //   time.setCPF(rs.getString("CPF"));
                    Nome = rs.getString("Nome");
                 //   time.setTempo_limite(rs.getInt("Tempo_limite"));
                 
                   // lista.add(time);
                //}
                
            } catch (SQLException ex) {
               // Logger.getLogger(ProdutoDAO_Pao.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Deu erro");
            }finally{
                ConnectionFactory.closeConnection(con, stmt, rs);
            }
            return Nome;
        }
    
    public void update(Tempo_save temp){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
         
            stmt = (PreparedStatement) con.prepareStatement("UPDATE Tempo SET Cliente_time = ?,Segundos = ?,Minutos = ?,Horas = ?,Nome = ?, CPF = ?, Tempo_limite = ?  WHERE idTempo = ?");
            
            stmt.setString(1, temp.getCliente_time());
            stmt.setInt(2,temp.getSegundos());
            stmt.setInt(3,temp.getMinutos());
            stmt.setInt(4,temp.getHoras());
            
            stmt.setString(5, temp.getNome());
            stmt.setString(6,temp.getCPF());
            stmt.setInt(7,temp.getTempo_limite());  
            
            stmt.setInt(8,temp.getIdTempo());
      
            stmt.executeUpdate();
            
            //System.out.println("Atualizado com sucesso !");
            //JOptionPane.showMessageDialog(null,"Atualizado com sucesso !");
        } catch (SQLException ex) {
            //System.out.println("Erro ao Atualizar !");
            //JOptionPane.showMessageDialog(null,"Erro ao Atualizar !" + ex);
        }finally{
           ConnectionFactory.closeConnection(con, stmt);
        }
        
        
    }
    
}
