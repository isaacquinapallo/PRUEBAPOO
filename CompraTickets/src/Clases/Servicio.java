package Clases;

public class Servicio {
    private String nombreServicio;
    private String descripcionServicio;
    private boolean maletaAdicional;

    // Constructor
    public Servicio(String nombreServicio, String descripcionServicio, boolean maletaAdicional) {
        this.nombreServicio = nombreServicio;
        this.descripcionServicio = descripcionServicio;
        this.maletaAdicional = maletaAdicional;
    }

    // Getter
    public String getNombreServicio() {
        return nombreServicio;
    }

    public String getDescripcionServicio() {
        return descripcionServicio;
    }

    public boolean isMaletaAdicional() {
        return maletaAdicional;
    }

    // Setter
    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public void setDescripcionServicio(String descripcionServicio) {
        this.descripcionServicio = descripcionServicio;
    }

    public void setMaletaAdicional(boolean maletaAdicional) {
        this.maletaAdicional = maletaAdicional;
    }
}

