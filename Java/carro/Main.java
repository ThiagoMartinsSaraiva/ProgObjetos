package carro;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    Carro c = new Carro();

    System.out.println("Digite o modelo: ");
    c.setModelo(scan.nextLine());
    System.out.println("Digite a marca: ");
    c.setMarca(scan.nextLine());
    System.out.println("Digite o ano: ");
    c.setAno(scan.nextInt());
    System.out.println("Digite a quilometragem: ");
    c.setQuilometragem(scan.nextFloat());
    c.oCarroRodaMuito(c.getAno(), c.getQuilometragem());
    System.out.println("Quilometros por ano: ");
    System.out.println(c.quilometrosPorAno(c.getAno(), c.getQuilometragem()));
    c.oCarroRodaMuito(c.getAno(), c.getQuilometragem());
    System.out.println(c.toString());
    scan.close();
  }
}