package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static model.DAO.getConnection;

public class ConsultaDAO extends DAO {
    private static ConsultaDAO instance;

    private ConsultaDAO() {
        getConnection();
        createTable();
    }

    // Singleton
    public static ConsultaDAO getInstance() {
        return (instance==null?(instance = new ConsultaDAO()):instance);
    }

    
// CRUD    
    public Consulta create(Calendar data, int hora, String comentarios, int idAnimal, int idVeterinario, int idTratamento, boolean terminou) {
        try {
            PreparedStatement stmt;
            stmt = DAO.getConnection().prepareStatement("INSERT INTO consulta (data, horario, comentario, id_animal, id_vet, id_tratamento, terminou) VALUES (?,?,?,?,?,?,?)");
            stmt.setString(1, dateFormat.format(data.getTime()));
            stmt.setInt(2, hora);
            stmt.setString(3, comentarios);
            stmt.setInt(4, idAnimal);
            stmt.setInt(5, idVeterinario);
            stmt.setInt(6, idTratamento);
            stmt.setInt(7, (terminou?1:0));
            executeUpdate(stmt);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this.retrieveById(lastId("consulta","id"));
    }
    

    private Consulta buildObject(ResultSet rs) {
        Consulta consulta = null;
        try {
            Calendar dt = Calendar.getInstance();
            dt.setTime(dateFormat.parse(rs.getString("data")));
            
            consulta = new Consulta(rs.getInt("id") ,dt , rs.getInt("hora"), rs.getString("comentario"), rs.getInt("id_animal"), rs.getInt("id_vet"), rs.getInt("id_tratamento"), rs.getInt("terminou")==1);
        } catch (SQLException e) {
            System.err.println("Exception: " + e.getMessage());
        } catch (ParseException ex) {
            Logger.getLogger(ConsultaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return consulta;
    }

    // Generic Retriever
    public List retrieve(String query) {
        List<Consulta> consultas = new ArrayList();
        ResultSet rs = getResultSet(query);
        try {
            while (rs.next()) {
                consultas.add(buildObject(rs));
            }
        } catch (SQLException e) {
            System.err.println("Exception: " + e.getMessage());
        }
        return consultas;
    }
    
    // RetrieveAll
    public List retrieveAll() {
        return this.retrieve("SELECT * FROM consulta");
    }
    
    // RetrieveLast
    public List retrieveLast(){
        return this.retrieve("SELECT * FROM consulta WHERE id = " + lastId("consulta","id"));
    }

    // RetrieveById
    public Consulta retrieveById(int id) {
        List<Consulta> consultas = this.retrieve("SELECT * FROM consulta WHERE id = " + id);
        return (consultas.isEmpty()?null:consultas.get(0));
    }
  
        
    // Updade
    public void update(Consulta consulta) {
        try {
            PreparedStatement stmt;
            stmt = DAO.getConnection().prepareStatement("UPDATE consulta SET data=?, horario=?, comentario=?, id_animal=?, id_vet=?, id_tratamento=?, terminado=? WHERE id=?");
           
            stmt.setString(1, dateFormat.format(consulta.getData().getTime()));
            stmt.setInt(2, consulta.getHora());
            stmt.setString(3, consulta.getComentarios());
            stmt.setInt(4, consulta.getIdAnimal());
            stmt.setInt(5, consulta.getIdVeterinario());
            stmt.setInt(6, consulta.getIdTratamento());
            stmt.setInt(7, (consulta.isTerminou()?1:0));
            stmt.setInt(8, consulta.getId());
            executeUpdate(stmt);
        } catch (SQLException e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }
        // Delete   
    public void delete(Consulta consulta) {
        PreparedStatement stmt;
        try {
            stmt = DAO.getConnection().prepareStatement("DELETE FROM consulta WHERE id = ?");
            stmt.setInt(1, consulta.getId());
            executeUpdate(stmt);
        } catch (SQLException e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }

}
