package Biblioteca;

public class Bibliotecario extends Persona{
    private String turno;
    private double salario;
    private Biblioteca biblioteca;

    public Bibliotecario(String nombre, String id, String turno, double salario, Biblioteca biblioteca) {
        super(nombre, id);
        this.turno = turno;
        this.salario = salario;
        this.biblioteca = biblioteca;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public void asiganarUnabiblioteca(Biblioteca biblioteca1){
        biblioteca=biblioteca1;
    }

    public void prestar(String titulo){
        Recurso r=biblioteca.buscarPorTitulo(titulo);
        if(r!=null){
            r.prestar();
        }else{
            System.out.println("NO existe el recurso");
        }
    }

    public void devolver(String titulo){
        Recurso r=biblioteca.buscarPorTitulo(titulo);
        if(r!=null){
            r.devolver();
        }else{
            System.out.println("NO existe el recurso");
        }
    }
}
