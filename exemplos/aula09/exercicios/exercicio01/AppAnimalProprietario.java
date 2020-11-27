package exercicios.exercicio01;

public class AppAnimalProprietario {
    public static void main(String[] args) {
       /*  Animal animal = new Animal("Alaska", "persa","branco", 2018);
        Proprietario proprietario = new Proprietario("Jessica", "9999999999"); */
       /*  animal.setProprietario(proprietario); */

        Gerenciar animais = new Gerenciar();

        animais.novoAnimal("Pantera", "gato","preto", 2018, "Jessica", "99999999");
        animais.novoAnimal("Alaska", "Persa","branco", 2018, "Jessica", "99999999");

        //System.out.println(animais.buscaPorRaca());


        
    }
    
}
