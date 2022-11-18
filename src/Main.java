
import dio.desafiobanco.Cliente;
import dio.desafiobanco.ContaCorrente;
import dio.desafiobanco.ContaPoupanca;

public class Main {
    public static void main(String[] args) {

        Cliente Theo = new Cliente();
        Theo.setNome("Theo");
        ContaCorrente cc = new ContaCorrente(Theo);
        ContaPoupanca cp = new ContaPoupanca(Theo);

        cc.depositar(100);
        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
