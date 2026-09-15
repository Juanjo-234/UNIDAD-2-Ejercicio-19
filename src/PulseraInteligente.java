public class PulseraInteligente {
PerfilUsuario usuario;
int pasos;
private static final int metaDiaria = 6000;

public PulseraInteligente(PerfilUsuario usuario){
    this.usuario = usuario;
    this.pasos = 0;
}

void registrarPasos(int cantidad){
    if(cantidad <= 0 ){
        System.out.println("No se han registrado pasos en este día");
    }
        this.pasos += cantidad;
        usuario.sumarPasos(cantidad);
        System.out.println("Pasos acumulados en el dia: " + usuario.getPasosAcumulados());



    if(usuario.getPasosAcumulados() > metaDiaria){
        System.out.println("Se ha superado la meta diaria de " + metaDiaria + " pasos diarios");
    }
}



}
