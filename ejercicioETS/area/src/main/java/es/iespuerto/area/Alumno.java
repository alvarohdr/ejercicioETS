package es.iespuerto.area;

public class Alumno {
    private String tipo;
    private Integer valor1;
    private Integer valor2;

    /**
     * Constructor por defecto
     */
    public Alumno(){

    }

    /**
     * Constructor con un parametro
     * @param valor1 de la clase
     */
    public Alumno(Integer valor1){
        this.valor1 = valor1;
    }

    /**
     * Constructor con dos parametros
     * @param valor1 de la clase
     * @param valor2 de la clase
     */
    public Alumno(Integer valor1, Integer valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    /**
     * Metodo que calcula el area dados dos valores
     * @param valor1 de la clase
     * @param valor2 de la clase
     * @return devuelve el area
     */
    public Double calcularArea(Integer valor1, Integer valor2){
        Double area = null;
        return area;
    }
}
