package factory;

public class Cliente {
    public static void main(String args[]){
        Dialog janela; 
        janela= new WindowsDialog();
        //janela= new HTMLDialog();

        janela.render();
        
    }
}
