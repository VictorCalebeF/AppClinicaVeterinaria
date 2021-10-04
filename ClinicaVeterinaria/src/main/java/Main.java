
import model.ClienteDAO;
import model.Cliente;
import model.AnimalDAO;

/**
 *
 * @author victor Calebe
 */
public class Main {
     public static void main(String[] args) {
                 
        Cliente calebe = ClienteDAO.getInstance().retrieveById(1);
         
        //ClienteDAO.getInstance().create("calebe","Campinas","123456789","00789-450","calebe@calebe.com");
        //ClienteDAO.getInstance().create("neymar","Paris","879456123","00000-700","neymar@neymar.com");
        
        
        
        //System.out.println(ClienteDAO.getInstance().retrieveAll());
        //System.err.println(AnimalDAO.getInstance().retrieveAll());
        /*
        System.out.println(ClienteDAO.getInstance().retrieveById(3));
        System.out.println(AnimalDAO.getInstance().retrieveById(7));
        System.out.println(AnimalDAO.getInstance().retrieveById(8));
        System.out.println(AnimalDAO.getInstance().retrieveById(9));
        */
        Cliente c1 = ClienteDAO.getInstance().retrieveById(1);
        Cliente c2 = ClienteDAO.getInstance().retrieveById(2);
        
        AnimalDAO.getInstance().create("Bolis", 2013, "Macho", 1, c1);
        
        //System.out.println(ClienteDAO.getInstance().retrieveAll());
        System.out.println(AnimalDAO.getInstance().retrieveByIdCliente(c1.getId()));
        //System.out.println(AnimalDAO.getInstance().retrieveByIdCliente(c2.getId()));
                
    }
}
