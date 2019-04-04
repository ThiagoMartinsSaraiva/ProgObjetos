package elevador;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    Elevador e = new Elevador();

    System.out.println("Digite o total de andares: ");
    e.setTotalAndares(scan.nextInt());
    System.out.println("Digite a capacidade do elevador: ");
    e.setCapacidadeElevador(scan.nextInt());
    System.out.println("Andar atual: " + e.getAndarAtual());
    System.out.println("Terreo: " + e.getTerreo());
    System.out.println("Capacidade do elevador: " + e.getCapacidadeElevador());
    System.out.println("Total de andares: " + e.getTotalAndares());
    System.out.println("Total de pessoas: " + e.getTotalPessoas());
    e.subir(e.getAndarAtual(), e.getTotalAndares());
    e.subir(e.getAndarAtual(), e.getTotalAndares());
    e.subir(e.getAndarAtual(), e.getTotalAndares());
    e.descer(e.getAndarAtual(), e.getTerreo());
    e.descer(e.getAndarAtual(), e.getTerreo());
    e.descer(e.getAndarAtual(), e.getTerreo());
    e.entrar(e.getTotalPessoas(), e.getCapacidadeElevador());
    e.entrar(e.getTotalPessoas(), e.getCapacidadeElevador());
    e.entrar(e.getTotalPessoas(), e.getCapacidadeElevador());
    e.sair(e.getTotalPessoas());
    e.sair(e.getTotalPessoas());
    e.sair(e.getTotalPessoas());

    scan.close();
  }
}