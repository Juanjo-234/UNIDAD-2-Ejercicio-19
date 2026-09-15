//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
PerfilUsuario usuario1  =new PerfilUsuario("Juan Perez" );
PulseraInteligente pulsera = new PulseraInteligente(usuario1);

pulsera.registrarPasos(7500);
pulsera.registrarPasos(500);

usuario1.otorgarInsignia("Principiante");

    System.out.println("\n=== ESTADO FINAL DEL PERFIL ===");
    System.out.println("Usuario: " + usuario1.getNombre());
    System.out.println("Pasos Totales: " + usuario1.getPasosAcumulados());
    System.out.println("Insignias Obtenidas en la lista:");
}
