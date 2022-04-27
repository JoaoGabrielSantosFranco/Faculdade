package observer;

public class Cliente {
    public static void main(String[] args){ 
        Publisher jovemnerd = new Publisher();
        
        Subscriber zezinho = new ConcreteSubscriber();
        Subscriber luizinho = new ConcreteSubscriber();
        Subscriber huguinho = new ConcreteSubscriber();

        jovemnerd.subscriber(zezinho);
        jovemnerd.subscriber(luizinho);
        jovemnerd.subscriber(huguinho);
        
        jovemnerd.setMainState("Nos vendemos para a magalu");
        jovemnerd.notifySubscribers();
    }
    
}
