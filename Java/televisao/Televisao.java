package televisao;

public class Televisao {
  private int volume;
  private int numeroCanal;
  private String nomeCanal;

  public Televisao() {

  }

  public int getVolume() {
    return this.volume;
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }

  public int getNumeroCanal() {
    return this.numeroCanal;
  }

  public void setNumeroCanal(int numeroCanal) {
    this.numeroCanal = numeroCanal;
  }

  public String getNomeCanal() {
    return this.nomeCanal;
  }

  public void setNomeCanal(String nomeCanal) {
    this.nomeCanal = nomeCanal;
  }

  public void aumentarVolume() {
    if (this.volume < 100) {
      this.volume++;
      System.out.println("Volume atual: " + this.volume);
    } else {
      System.out.println(this.volume);
    }
  }

  public void diminuirVolume() {
    if (this.volume > 0) {
      this.volume--;
      System.out.println("Volume atual: " + this.volume);
    } else {
      System.out.println("Mudo " + this.volume);
    }
  }

  public void nomeNumeroCanal(int canal) {
    switch(canal) {
      case 2:
        this.setNomeCanal("Record");
        this.setNumeroCanal(canal);
        System.out.println("Canal atual: " + this.getNumeroCanal());
        break;
      case 4:
        this.setNomeCanal("Rede TV");
        this.setNumeroCanal(canal);
        System.out.println("Canal atual: " + this.getNumeroCanal());
        break;
      case 5: 
        this.setNomeCanal("SBT");
        this.setNumeroCanal(canal);
        System.out.println("Canal atual: " + this.getNumeroCanal());
        break;
      case 10:
        this.setNomeCanal("Band");
        this.setNumeroCanal(canal);
        System.out.println("Canal atual: " + this.getNumeroCanal());
        break;
      case 12:
        this.setNomeCanal("Globo");
        this.setNumeroCanal(canal);
        System.out.println("Canal atual: " + this.getNumeroCanal());
        break;
      default:
        this.nomeCanal = "Sem sinal";
        this.setNumeroCanal(canal);
        System.out.println("Canal atual: " + this.getNumeroCanal());
    }
    System.out.println(this.nomeCanal);
  }

  public void aumentarCanal() {
    this.numeroCanal++;
    nomeNumeroCanal(this.numeroCanal);
  }

  public void diminuirCanal() {
    this.numeroCanal--;
    nomeNumeroCanal(this.numeroCanal);
  }
  
}