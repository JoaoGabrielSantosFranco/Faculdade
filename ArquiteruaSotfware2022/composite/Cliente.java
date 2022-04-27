package composite;

public class Cliente {
    public static void main(String[] args){

        Composite embalagemIphone13 = new Composite();
        Telefone Iphone13 = new Telefone();
        embalagemIphone13.add(Iphone13);
        
        Composite embalagemMotoG = new Composite();
        Telefone motoG = new Telefone();
        Carregador carregador = new Carregador();
        embalagemMotoG.add(motoG);
        embalagemMotoG.add(carregador);




        
    }
    
}
