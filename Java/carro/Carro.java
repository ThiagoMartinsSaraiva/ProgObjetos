package carro;

public class Carro {
  private String marca;
  private String modelo;
  private int ano;
  private float quilometragem;

  public Carro() {

  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public int getAno() {
    return ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  public float getQuilometragem() {
    return quilometragem;
  }

  public void setQuilometragem(float quilometragem) {
    this.quilometragem = quilometragem;
  }

  public float quilometrosPorAno(int ano, float quilometragem) {
    return quilometragem / (2019 - ano);
  }

  public void oCarroRodaMuito(int ano, float quilometragem) {
    if (quilometrosPorAno(ano, quilometragem) > 10000) {
      System.out.println("O carro roda muito.");
    } else {
      System.out.println("O carro roda normal.");
    }
  }

  @Override
  public String toString() {
    return "Modelo: " + getMarca() + ", modelo: " + getModelo() + ", ano: " + getAno() + ", quilometragem: " + getQuilometragem() + ".";
  }

}