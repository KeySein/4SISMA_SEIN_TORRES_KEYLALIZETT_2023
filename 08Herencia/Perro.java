public class Perro extends Animal {
        private String color;
        public Perro(){    
        }
        public Perro (String nombre, String raza, String tipo_alimento, int edad, String color){
            super( nombre, raza, tipo_alimento, edad);
            this.color = color;
        }
        public void setColor(String color){
            this.color = color;
        }
        public String getColor(){
            return color;
        }
        public void mostrarPerro(){
    System.out.println("el nombre del perro es :"+ getNombre() + " \n"
                     + "la raza del perro es: " + getRaza() +  "\n"
                     + "el alimento del perrito  es :" + getTipo_alimento() + "\n"
                     + "los años del perro es de : " + getEdad() + "\n"
                     + "el color del perrito es de : " + color + "\n");
    
        }
    } 

