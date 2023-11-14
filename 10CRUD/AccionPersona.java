import java.util.ArrayList;

public class AccionPersona {
 public ArrayList<Persona> listapersonas = new ArrayList<Persona>();
 public void agregarPersona(Persona p){
    listapersonas.add(p);
 }

    public Persona buscarPersona(int id){
       Persona encontrada = new Persona();
       for(Persona p : listapersonas){
        if(id == p.getId()){
            encontrada = p;
        }else{
            System.out.println("No existe el registro de esa persona");

        }
       }
       return encontrada;
    }
    public void actualizarPersona(Persona actualizada){
        Persona actualizar = buscarPersona(actualizada.getId());
        listapersonas.remove(actualizar);
        listapersonas.add(actualizar);

    }
    public void eliminarPersona(Persona eliminada){
        listapersonas.remove(eliminada);

    }
      public ArrayList<Persona> mostrarPersona(){
        return listapersonas;
      }
    }

