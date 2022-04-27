package observer;

public class ConcreteSubscriber implements Subscriber {

    @Override
    public void update(String context) {
        System.out.println(context);
        
        
    }
    
}
