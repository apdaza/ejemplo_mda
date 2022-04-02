public class Direccion {

       private String calle;
       private String ciudad;
       private String pais;
       private int numero;

  public Direccion() {
      this.calle = Null;
      this.ciudad = Null;
      this.pais = Null;
      this.numero = Null;
  }

    public String getCalle(){
      return this.calle;
    }
    public String getCiudad(){
      return this.ciudad;
    }
    public String getPais(){
      return this.pais;
    }
    public int getNumero(){
      return this.numero;
    }

      public void setCalle(String value){
        this.calle = value;
      }

      public void setCiudad(String value){
        this.ciudad = value;
      }

      public void setPais(String value){
        this.pais = value;
      }

      public void setNumero(int value){
        this.numero = value;
      }


}