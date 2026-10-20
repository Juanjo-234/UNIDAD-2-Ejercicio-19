Este programa está diseñado para modelar y gestionar el monitoreo de la actividad física y el otorgamiento automático de logros mediante una pulsera inteligente y el perfil de usuario utilizando programación orientada a objetos (por ejemplo, en Java).

A continuación se detalla exactamente lo que hace cada parte del programa:

Define la clase PerfilUsuario: Modela al usuario de la plataforma encapsulando sus atributos principales: el nombre (nombre), los pasos acumulados (pasosAcumulados) y una lista de insignias obtenidas (insigniasObtenidas), además de incluir el método otorgarInsignia(String nombreInsignia) para actualizar su estado interno.

Diseña la clase PulseraInteligente: Implementa el dispositivo wearable que mantiene una referencia directa al perfil del usuario y expone el método registrarPasos(int cantidad), el cual actualiza la actividad y evalúa en tiempo real si se superó la meta diaria establecida.

Procesa la lógica de recompensas: Incorpora la validación necesaria para detectar el momento exacto en que el usuario cruza el umbral de pasos requeridos, disparando el mensaje correspondiente hacia el perfil para registrar nuevos logros de manera automatizada.

Ejecuta la prueba (main): Instancia el perfil de usuario y la pulsera inteligente vinculada, simula el registro de una gran cantidad de pasos fraccionados en varias sesiones, y verifica por consola que la insignia correspondiente se haya entregado correctamente.
