package factory;

public abstract class Dialog {
    public void render(){
        Button botao = createButton();
        System.out.println(botao.render());
        botao.onClick();
    }

    public abstract Button createButton();

}
