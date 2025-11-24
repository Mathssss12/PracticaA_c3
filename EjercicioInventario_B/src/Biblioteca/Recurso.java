package Biblioteca;

public class Recurso {
    private String titulo;
    private String autor;
    private double precio;
    private boolean disponible;

    public Recurso(String titulo, String autor, double precio, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.disponible = disponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void prestar(){
        if(disponible){
            disponible=false;
            System.out.println("Recurso prestado: "+titulo);
        }else {
            System.out.println("NO esta disponible");
        }
    }

    public void devolver(){
        disponible=true;
        System.out.println("Recurso devuelto: "+titulo);
    }

    public void info(){
        System.out.println("Titulo: "+titulo+" Autor: "+autor+" Precio: "+precio+" Disponible: "+(disponible?"si":"no"));
    }
}
