package composite;

import java.util.ArrayList;

public class Composite {
    
    private ArrayList<Componente> Children = new ArrayList<>();
        
    
    public void execute(){

    }

    public void add(Componente component){
        Children.add(component);
    }

    public void remove(Componente component){
        Children.remove(component);
    }
    public ArrayList<Componente>getChildren(){
        return this.Children;
    }
}

