/**
 *
 * @author Victor Calebe
 */
public class Main {
     public static void main(String[] args) {
        
        Cliente victor = ClienteDAO.getInstance().retrieveById(2);
         
        //ClienteDAO.getInstance().create("Spiderman","New York City","921456789","00234-900","spider@avengers.com");
        AnimalDAO.getInstance().create("Bilbo", 2015, "Macho", 1, victor);
        
        //System.out.println(ClienteDAO.getInstance().retrieveAll());
        System.err.println(AnimalDAO.getInstance().retrieveAll());
        //System.out.println(ClienteDAO.getInstance().retrieveById(2));
                
    }
}
