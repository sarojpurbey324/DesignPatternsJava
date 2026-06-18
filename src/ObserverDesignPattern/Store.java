package ObserverDesignPattern;


import ObserverDesignPattern.observable.IphoneObservableImpl;
import ObserverDesignPattern.observable.StockObservable;
import ObserverDesignPattern.observer.EmailAlertObserverImpl;
import ObserverDesignPattern.observer.MobileAlertObserverImpl;
import ObserverDesignPattern.observer.NotificationAlertObserver;

public class Store {

    public static void main(String[] args) {

        StockObservable iphoneStockObservable=new IphoneObservableImpl();

        NotificationAlertObserver observer1=new EmailAlertObserverImpl("abc@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2=new EmailAlertObserverImpl("xyz@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer3=new MobileAlertObserverImpl("abc_username", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);
    }
}
