package Clases;

public class Ruta {
    private String origenDestino;
    private double precio;

    // Constructor
    public Ruta(String origenDestino, double precio) {
        this.origenDestino = origenDestino;
        this.precio = precio;
    }

    // Getter
    public String getOrigenDestino() {
        return origenDestino;
    }

    public double getPrecio() {
        return precio;
    }

    // Setter
    public void setOrigenDestino(String origenDestino) {
        this.origenDestino = origenDestino;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
