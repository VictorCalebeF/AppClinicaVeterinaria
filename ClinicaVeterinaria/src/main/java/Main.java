/**
 *
 * @author Victor Calebe
 */
public class Main {
     public static void main(String[] args) {
        System.out.println("Funcionando!");
        Cliente c1 = new Cliente(01,"Victor","Rua Palmeiras","12345","54321","victorcalebe@.com");
        c1.setEmail("calebe@eu.com");
        
        Animal a1 = new Animal(01,"Bolis",03,01);
        Animal a2 = new Animal(02,"Bilbo",07,01);
        
        c1.addAnimal(a1);
        c1.addAnimal(a2);
        
        System.out.println(c1);

        
    }
}
