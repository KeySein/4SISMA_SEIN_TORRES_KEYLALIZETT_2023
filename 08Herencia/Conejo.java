public class Conejo extends Animal{
    private String tamaño;
    public Conejo(){    
    }
    public Conejo (String nombre, String raza, String tipo_alimento, int edad, String tamaño){
        super( nombre, raza, tipo_alimento, edad);
        this.tamaño = tamaño;
    }
    public void setTamaño(String tamaño){
        this.tamaño = tamaño;
    }
    public String getTamaño(){
        return tamaño;
    }
    public void mostrarConejo(){
System.out.println("el nombre del conejito es :"+ getNombre() + " \n"
                 + "la raza del conejito es: " + getRaza() +  "\n"
                 + "el alimento para el conejito  es :" + getTipo_alimento() + "\n"
                 + "el numero de años de este conejito es: " + getEdad() + "\n"
                 + "el tamaño de este conejito es  : " + tamaño + "\n");

    }
}    

