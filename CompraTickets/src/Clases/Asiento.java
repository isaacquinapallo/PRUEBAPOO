package Clases;

public class Asiento {
    private int numero;
    private String tipo;
    private boolean disponibilidad;

    // Constructor
    public Asiento(int numero, String tipo, boolean disponibilidad) {
        this.numero = numero;
        this.tipo = tipo;
        this.disponibilidad = disponibilidad;
    }

    // Getter
    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    // Setter
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}
