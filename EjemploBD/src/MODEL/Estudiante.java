package MODEL;

public class Estudiante {
    public String id;
    public String nombreEst;
    public double nota1;
    public double nota2;
    public double promedio;
    public String estado;

    public Estudiante(String id, String nombreEst, double nota1, double nota2) {
        this.id = id;
        this.nombreEst = nombreEst;
        this.nota1 = nota1;
        this.nota2 = nota2;
        
    }

    public Estudiante(String id, String nombreEst, double nota1, double nota2, double promedio, String estado) {
        this.id = id;
        this.nombreEst = nombreEst;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.promedio = promedio;
        this.estado = estado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreEst() {
        System.out.println(nombreEst);
        return nombreEst;
    }

    public void setNombreEst(String nombreEst) {
        this.nombreEst = nombreEst;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "cedula=" + id + ", nombreEst=" + nombreEst + ", nota1=" + nota1 + ", nota2=" + nota2 + ", promedio=" + promedio + ", estado=" + estado + '}';
    }
}