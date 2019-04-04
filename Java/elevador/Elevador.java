package elevador;

public class Elevador {
  private int andarAtual;
  private int terreo;
  private int totalAndares;
  private int totalPessoas;
  private int capacidadeElevador;

  public Elevador() {
    this.terreo = 0;
    this.totalPessoas = 0;
    this.andarAtual = 0;
  }

  public Elevador(int totalAndares, int capacidadeElevador) {
    this.terreo = 0;
    this.totalPessoas = 0;
    this.andarAtual = 0;
    this.totalAndares = totalAndares;
    this.capacidadeElevador = capacidadeElevador;
  }

  public int getTerreo() {
    return terreo;
  }

  public int getAndarAtual() {
    return andarAtual;
  }

  public void setAndarAtual(int andarAtual) {
    this.andarAtual = andarAtual;
  }

  public int getTotalAndares() {
    return totalAndares;
  }

  public void setTotalAndares(int totalAndares) {
    this.totalAndares = totalAndares;
  }

  public int getTotalPessoas() {
    return totalPessoas;
  }

  public void setTotalPessoas(int totalPessoas) {
    this.totalPessoas = totalPessoas;
  }

  public int getCapacidadeElevador() {
    return capacidadeElevador;
  }

  public void setCapacidadeElevador(int capacidadeElevador) {
    this.capacidadeElevador = capacidadeElevador;
  }

  public void entrar(int totalPessoas, int capacidadeElevador) {
    if (totalPessoas < capacidadeElevador) {
      this.totalPessoas++;
      System.out.println("Depois da entrada: " + this.totalPessoas);
    } else {
      System.out.println("Elevador cheio!");
    }
  }

  public void sair(int totalPessoas) {
    if (totalPessoas > 0) {
      this.totalPessoas--;
      System.out.println("Depois da saida: " + this.totalPessoas);
    } else {
      System.out.println("Elevador estah vazio!");
    }
  }

  public void subir(int andarAtual, int totalAndares) {
    if (andarAtual < totalAndares) {
      this.andarAtual++;
      System.out.println("Andar atual: " + this.andarAtual);
    } else {
      System.out.println("Jah estamos na cobertura!");
    }
  }

  public void descer(int andarAtual, int terreo) {
    if (andarAtual > terreo) {
      this.andarAtual--;
      System.out.println("Andar atual: " + this.andarAtual);
    } else {
      System.out.println("Nao vamos alem disso, companheiro!");
    }
  }

}