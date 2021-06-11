public class TormentaObserver{

  void notificar(usuario,alertas){
    if(alertas.contains("Tormenta")){
      this.notificationService.notify("Deberias llevar paraguas");
    }
  }
}