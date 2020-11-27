package exercicios.exercicio04;

public class App {
    public static void main(String[] args) {
        Relogio horaAtual = new Relogio (15,10,30);
        
        horaAtual.setMinuto(75);
        System.out.println("Minuto: " +horaAtual.getMinuto());

        horaAtual.setHora(16);
        System.out.println("Hora: " +horaAtual.getHora());

        horaAtual.setSegundo(20);
        System.out.println(horaAtual.getHoraAtual());
        
        
        horaAtual.getHoraAtual();
        
    }
    
}
