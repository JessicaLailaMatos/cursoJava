package exemplos.exemplo01;


import java.util.Scanner;

public class AppConta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int menu;
        int numeroConta;
        double limite, valor;
        GerenciaConta gerenciaConta = new GerenciaConta();
     

        do {
            System.out.println("1-Nova Conta Corrente");
            System.out.println("2-Nova Conta Especial");
            System.out.println("3-Nova Conta Poupança");
            System.out.println("4-Fazer Depósito");
            System.out.println("5-fazer saque");
            System.out.println("6-Exibir saldo");
            System.out.println("7-Sair");
            try{
            menu = teclado.nextInt();
        } catch (Exception e){
            System.out.println("Entrada invalida");
            menu = 11;
            teclado.nextLine();
            continue;
        }


            switch (menu) {
                case 1:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    gerenciaConta.novaContaCorrente(numeroConta);
                    break;

                case 2:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    System.out.println("Informe o valor do limite:");
                    limite = teclado.nextDouble();
                    gerenciaConta.novaContaEspecial(numeroConta, limite);
                    break;

                case 3:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                     gerenciaConta.novaContaPoupanca(numeroConta);
                    break;

                case 4:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    System.out.println("Informe o valor do depósito:");
                    valor = teclado.nextDouble();
                    gerenciaConta.depositar(numeroConta, valor);
                    if(gerenciaConta.depositar(numeroConta, valor)){
                    System.out.println("Deposito concluido");
                }else{
                    System.out.println("Deposito não conluido");
                }
                    break;

                case 5:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    System.out.println("Informe o valor do saque:");
                    valor = teclado.nextDouble();
                    if(gerenciaConta.sacar(numeroConta, valor)){
                        System.out.println("Saque concluido");
                    }else{
                        System.out.println("Saque não conluido");
                    }
                    break;

                case 6:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    System.out.println(gerenciaConta.exibir(numeroConta));
                    break;

                case 7:

                    break;

                default: // se não for nenhuma das opções acima
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (menu != 7);

        teclado.close();
    }

}
