package factory;

public class HTMLButton 
    implements Button{

    @Override
    public String render() {
        return "<button>Me Clica</button>";
    }

    @Override
    public void onClick() {
        System.out.println("HTMLButton: Fui clicado...");
    }
}
