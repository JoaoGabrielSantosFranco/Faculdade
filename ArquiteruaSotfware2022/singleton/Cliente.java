package singleton;

public class Cliente {
    public static void main(String[] args) {
        Singleton.getInstance().setCoisaImportante("12345");
        System.out.println(Singleton.getInstance().getCoisaImportante());
    }
}
