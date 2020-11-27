package exemplos.Exemplo02;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<User> lista = new ArrayList<>();

    User u1 = new User("Jessica","jessica@jessica.com");
    User u2 = new User("Richard","richard@richard.com");
    User u3 = new User("Rebeca","rebeca@rebeca.com");

    lista.add(u1);
    lista.add(u2);
    lista.add(u3);

    for (User item : lista){
        System.out.println(item.getNome() + "-" +item.getEmail());
    }

    }
    
    
}
