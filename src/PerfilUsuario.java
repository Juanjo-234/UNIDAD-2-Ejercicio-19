import java.util.ArrayList;
import java.util.List;

public class PerfilUsuario {
    String nombre;
    int pasosAcumulados;
    List< String> InsigniasObtenidas;

    public PerfilUsuario(String nombre){
        this.nombre = nombre;
        this.InsigniasObtenidas = new ArrayList<>();
        this.pasosAcumulados = 0;
    }

    List<String>  getInsigniasObtenidas(){
        return  InsigniasObtenidas;
    }
    public String getNombre() {
        return nombre;
    }

    public int getPasosAcumulados() {
        return pasosAcumulados;
    }

    public void setPasosAcumulados() {
        this.pasosAcumulados = pasosAcumulados;
    }

    void otorgarInsignia(String nombreInsignia){
        if (nombreInsignia != null && !nombreInsignia.trim().isEmpty()) {
                if (!InsigniasObtenidas.contains(nombreInsignia)) {
                    InsigniasObtenidas.add(nombreInsignia);
                    System.out.println("¡Felicidades, " + nombre + "! Has ganado la insignia: " + nombreInsignia);
                }
            }
    }

    public void sumarPasos(int cantidad) {
        if (cantidad > 0) {
            this.pasosAcumulados += cantidad;
        }
    }

}
