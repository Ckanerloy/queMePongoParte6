class GeneradorSugerencia{

  public generarSugerencia(){
    Repositorio.instance().getUsuarios.forEach(usuario => {
      Sugerencia unaSugerencia = generadorSugerencia.generarSugerencia(usuario,apiClima);
      usuario.actualizarpropuesta(sugerencia);
  })
}