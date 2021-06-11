public interface ServicioMeteorologico {
  public Map<String,Object> obtenerCondicionesClimaticas(String direccion);
  public void obtenerAlertas(String direccion);
}