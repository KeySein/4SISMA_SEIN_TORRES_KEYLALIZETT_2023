
public class Michi extends Animal{
    private int num_vidas;
    public Michi(){    
    }
    public Michi (String nombre, String raza, String tipo_alimento, int edad, int num_vidas){
        super( nombre, raza, tipo_alimento, edad);
        this.num_vidas = num_vidas;
    }
    public void setNum_vidas(int num_vidas){
        this.num_vidas = num_vidas;
    }
    public int getNum_vidas(){
        return num_vidas;
    }
    public void mostrarMichi(){
System.out.println("el nombre del michi es :"+ getNombre() + " \n"
                 + "la raza del michi es: " + getRaza() +  "\n"
                 + "su  alimento es :" + getTipo_alimento() + "\n"
                 + "la edad del michi es : " + getEdad() + "\n"
                 + " las vidas del michi son: " + num_vidas + "\n");

    }
}
