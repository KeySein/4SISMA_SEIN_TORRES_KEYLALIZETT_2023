public class Hamster extends Animal {
    private String sexo;
    public Hamster(){    
    }
    public Hamster(String nombre, String raza, String tipo_alimento, int edad, String sexo){
        super( nombre, raza, tipo_alimento, edad);
        this.sexo= sexo;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public String getSexo(){
        return sexo;
    }
    public void mostrarHamster(){
System.out.println("el nombre del hamster es :"+ getNombre() + " \n"
                 + "la raza del hamster es: " + getRaza() +  "\n"
                 + "el alimento para el hamster  es :" + getTipo_alimento() + "\n"
                 + "el numero de años de este hamster es: " + getEdad() + "\n"
                 + "el sexo del hamster es  : " + sexo + "\n");

    }
}    

