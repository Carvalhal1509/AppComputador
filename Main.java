package trabalhojava;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int pc = 1;
        ArrayList<Computador> listaComputador = new ArrayList<Computador>();
        Scanner sc = new Scanner(System.in);
        while (pc < 5) { System.out.println("============================================="
                + System.lineSeparator()
                +"Criando Objeto Computador "
                + pc +":"
                + System.lineSeparator());
            System.out.println("Digite a marca do computador: ");
            String marca = sc.next();
            System.out.println("Digite o modelo do computador: ");
            String modelo = sc.next();
            System.out.println("Digite o valor do computador: ");
            float valor = sc.nextFloat();
            System.out.println("digite o tamanho do HD(numero): ");
            int hd = sc.nextInt();
            System.out.println("É usado?(true ou false): ");
            boolean pcUsado = sc.nextBoolean();
            if(pc > 2) { listaComputador.add(new Computador(modelo, marca, valor, hd, pcUsado));
            }else { Computador novoComputador = new Computador();
                novoComputador.setNome(modelo);
                novoComputador.setMarca(marca);
                novoComputador.setValor(valor);
                novoComputador.setMemoriaHD(hd);
                novoComputador.setPcUsado(pcUsado);
                listaComputador.add(novoComputador);
            } pc++;
        } sc.close();
        System.out.println(Computador.imprimir(listaComputador.get(0), listaComputador.get(1), listaComputador.get(2), listaComputador.get(3))); 
    }
}
