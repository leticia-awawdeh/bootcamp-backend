
import Serviços.Servico;
import Serviços.Radio;
import Serviços.Tv;
import Remotos.RemotoBasico;
import Remotos.RemotoAvancado;

public class Cliente {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }
    public static void testDevice(Servico device) {
        System.out.println("Tests with basic remote.");
        RemotoBasico basicRemote = new RemotoBasico(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        RemotoAvancado advancedRemote = new RemotoAvancado(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}

