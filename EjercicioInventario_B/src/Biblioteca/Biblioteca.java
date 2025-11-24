package Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private String direcion;
    private String telefono;
    List<Recurso> recursos;
    private int capacidad;

    public Biblioteca(String nombre, String direcion, String telefono, int capacidad) {
        this.nombre = nombre;
        this.direcion = direcion;
        this.telefono = telefono;
        this.recursos = new ArrayList<>();
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirecion() {
        return direcion;
    }

    public void setDirecion(String direcion) {
        this.direcion = direcion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Recurso> getRecursos() {
        return recursos;
    }

    public void setRecursos(List<Recurso> recursos) {
        this.recursos = recursos;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void agregarRecurso(Recurso recurso){
        recursos.add(recurso);
    }

    public void verRecurso(){
        for (Recurso recurso:recursos){
            recurso.info();
        }
    }

    public Recurso buscarPorTitulo(String titulo){
        for(Recurso r:recursos){
            if(r.getTitulo().equalsIgnoreCase(titulo)){
                return r;
            }
        }
        return null;
    }
}
