public class Compromiso {

      private Persona persona;
       private String descripcion;

  public Compromiso() {
      this.persona = Null;
      this.descripcion = Null;
  }

    public Persona getPersona(){
      return this.persona;
    }
    public String getDescripcion(){
      return this.descripcion;
    }

      public void setPersona(Persona value){
        this.persona = value;
      }

      public void setDescripcion(String value){
        this.descripcion = value;
      }


}