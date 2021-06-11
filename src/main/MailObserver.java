public class MailObserver{
  void notificar(usuario, alertas){
    mailSender.send(usuario,alertas);
  }
}