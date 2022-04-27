package factory;

public class WindowsButton implements Button{
    @Override
    public String render() {
        StringBuilder builder = new StringBuilder();
        builder.append("+----------+\n");
        builder.append("| me clica |\n");
        builder.append("+----------+\n");
        return builder.toString();
    }

    @Override
    public void onClick() {
        System.out.println("WinButton: Fui clicado...");
    }   
}
