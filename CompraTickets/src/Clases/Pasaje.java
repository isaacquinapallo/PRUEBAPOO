package Clases;

public class Pasaje {
    private double precio;
    private String tipo;

    // Constructor
    public Pasaje(double precio, String tipo) {
        this.precio = precio;
        this.tipo = tipo;
    }

    // Getter
    public double getPrecio() {
        return precio;
    }

    public String getTipo() {
        return tipo;
    }

    // Setter
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
