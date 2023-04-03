
package main;

public class Profesores implements Comparable<Profesores>{
    
    private String nombre;
    private String materia;
    private Double pago;
  
    
      public Profesores(String nombre, String materia, Double pago) {
        this.nombre = nombre;
        this.materia = materia;
        this.pago = pago;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMateria() {
        return materia;
    }

    public Double getPago() {
        return pago;
    }  
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", imparte la materia de: " + materia + ", y gana: $" + pago +"\n";
    }
    
    @Override
    public int compareTo(Profesores Pr) {
        return this.getPago().compareTo(Pr.getPago());
    }
        
}
