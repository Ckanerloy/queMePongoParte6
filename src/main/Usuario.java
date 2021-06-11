class Usuario{
  private Sugerencia sugerenciaDelDia;
  private InteresadoClima interesados;

  public void actualizarSugerenciaDelDia(Sugerencia sugerencia) {
    sugerenciaDelDia = sugerencia;
  }

  public void seActualizaronLasAlertas(alertas){
    this.interesados.forEach(interesado => {interesado.notificar(usuario,alertas)} )
  }
}