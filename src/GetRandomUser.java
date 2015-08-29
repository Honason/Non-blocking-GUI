import randomperson.RandomUser;
import randomperson.RandomUserGenerator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GetRandomUser extends Thread {

    public void run() {
        RandomUser user = null;

        try {
            user = RandomUserGenerator.getRandomUser();
        } catch (InterruptedException ex) {
            Logger.getLogger(RandomUserControl.class.getName()).log(Level.SEVERE, null, ex);
        }

        RandomUserControl control = new RandomUserControl();
        control.updateObservers(user);
    }
}
