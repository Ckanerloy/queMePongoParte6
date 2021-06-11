public class PropuestaDiariaObserver{
  void notificar(usuario,alertas){
    Sugerencia unaSugerencia = generadorSugerencia.generarSugerencia(usuario,apiClima);
    usuario.actualizarpropuesta(sugerencia);
  }
}