package exercicios.exercicio04;

public class Relogio {
    private int hora, minuto, segundo;

    public Relogio(int hora, int minuto, int segundo) {
        setHora(hora);
        setHora(minuto);
        setHora(segundo);

    }

    // minuto
    public void setMinuto(int novoMinuto) {
        if (novoMinuto >= 0 && novoMinuto <= 59) {
            minuto = novoMinuto;
        }
    }

    public int getMinuto() {
        return minuto;
    }

    // -----------------------------------------------
    // hora

    public void setHora(int novoHora) {
        if (novoHora >= 0 && novoHora <= 23) {
            hora = novoHora;
        }
    }

    public int getHora() {
        return hora;
    }

    // -----------------------------------------------
    // segundo

    public void setSegundo(int novoSegundo) {
        if (novoSegundo >= 0 && novoSegundo <= 60) {
            segundo = novoSegundo;
        }
    }

    public int getSegundo() {
        return segundo;
    }

    public String getHoraAtual() {
        //System.out.printf("hora atual: %d:%d:%d ", hora, minuto, segundo);
        return String.format ("hora atual: %d:%d:%d ", hora, minuto, segundo);
    }

}
