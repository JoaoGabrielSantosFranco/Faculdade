package adapter;

public class Cliente {
    public static void main(String args[]){
        Service service = new Service();
        String xml = "<aluno><nome>ze</nome></aluno>";
        Adapter adaptador = new Adapter();
        adaptador.setService(service);
        adaptador.method(xml);
    }
    
}
