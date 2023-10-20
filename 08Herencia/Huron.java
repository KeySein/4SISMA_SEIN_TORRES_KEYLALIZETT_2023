public class Huron extends Animal {
    private int peso;
    public Huron(){    
    }
    public Huron (String nombre, String raza, String tipo_alimento, int edad, int peso){
        super( nombre, raza, tipo_alimento, edad);
        this.peso = peso;
    }
    public void setPeso(int peso){
        this.peso = peso;
    }
    public int getPeso(){
        return peso;
    }
    public void mostrarHuron(){
System.out.println("el nombre del huron es :"+ getNombre() + " \n"
                 + "la raza del huron es: " + getRaza() +  "\n"
                 + "el alimento  que requiere el huron  es :" + getTipo_alimento() + "\n"
                 + "el numero de años del huron es: " + getEdad() + "\n"
                 + "el peso de este huron es  : " + peso + "\n");

    }
}     

