import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import randomperson.RandomUser;

public class RandomUserControl extends Observable {

    public static List<MyObserver> observers = new ArrayList();

    public void registerMyObserver(MyObserver o){
        observers.add(o);
    }

    public void fetchRandomUser() {

        GetRandomUser getUserThread = new GetRandomUser();
        getUserThread.start();
    }

    public void updateObservers(RandomUser randomUser) {
        for(MyObserver observer : observers){
            observer.update(randomUser);
        }
    }
}
