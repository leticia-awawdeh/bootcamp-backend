package Remotos;
import Serviços.Servico;
public class RemotoAvancado extends RemotoBasico {
    public RemotoAvancado(Servico device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
    
}
