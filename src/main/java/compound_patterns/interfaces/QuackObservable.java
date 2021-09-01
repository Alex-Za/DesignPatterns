package compound_patterns.interfaces;


public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
