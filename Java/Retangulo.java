public class Retangulo {
  public float width;
  public float height;

  public float getWidth() {
    return width;
  }

  public void setWidth(float width) {
    this.width = width;
  }

  public float getHeight() {
    return height;
  }

  public void setHeight(float height) {
    this.height = height;
  } 

  public Retangulo(float width, float height) {
    this.width = width;
    this.height = height;
  }

  public Retangulo() {
    
  }

  public float calculateArea(float width, float height) {
    return width * height;
  }

  public float calculatePerimeter(float width, float height) {
    return width * 2 + height * 2;
  }
  
}