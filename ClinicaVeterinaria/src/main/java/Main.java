/**
 *
 * @author victor Calebe
 */
public class Main {
     public static void main(String[] args) {
        
        Cliente calebe = ClienteDAO.getInstance().retrieveById(1);
         
        //ClienteDAO.getInstance().create("calebe","Campinas","123456789","00789-450","calebe@calebe.com");
        //ClienteDAO.getInstance().create("neymar","Paris","879456123","00000-700","neymar@neymar.com");
        //AnimalDAO.getInstance().create("Bolis", 2013, "Macho", 7, calebe);
        
        
        //System.out.println(ClienteDAO.getInstance().retrieveAll());
        //System.err.println(AnimalDAO.getInstance().retrieveAll());
        
        System.out.println(ClienteDAO.getInstance().retrieveById(3));
        System.out.println(AnimalDAO.getInstance().retrieveById(7));
        System.out.println(AnimalDAO.getInstance().retrieveById(8));
        System.out.println(AnimalDAO.getInstance().retrieveById(9));
                
    }
}
