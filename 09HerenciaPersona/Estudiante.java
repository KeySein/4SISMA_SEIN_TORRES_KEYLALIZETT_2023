

public class Estudiante extends Persona{
    private int numBoletas; 
    private String chillon;

    public Estudiante(){

    }
    public Estudiante(int numBoletas, String nombre, int edad, char genero, String chillon){
        super(nombre, edad, genero);
        this.numBoletas = numBoletas;
        this.chillon = chillon;
    }
    public Estudiante(int numBoletas, String nombre, int edad, char genero){
        super(nombre, edad, genero);
        this.numBoletas = numBoletas;
    }

    public int getnumBoletas(){
        return numBoletas;
    }
    public void setnumBoletas(int numBoletas){
        this.numBoletas = numBoletas;
    }
     public String getchillon(){
        return chillon;
    }
    public void setchillon(String chillon){
        this.chillon = chillon;
    }


}
