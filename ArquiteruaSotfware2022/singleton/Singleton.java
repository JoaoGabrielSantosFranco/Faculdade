package singleton;

public class Singleton {
    
    private static Singleton instance;
    private String coisaImportante;

    private Singleton(){

    }
    public String getCoisaImportante() {
        return coisaImportante;
    }
    public void setCoisaImportante(String coisaImportante) {
        this.coisaImportante = coisaImportante;
    }
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    
}
