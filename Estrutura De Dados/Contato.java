import java.util.ArrayList;
import java.util.Scanner;

public class Contato implements Cloneable{
    

    private int id;
    private String nome;
    private String telefone;
    private String email;
    private PilhaEstatica historico = new PilhaEstatica(100);
    ArrayList<Contato> lista = new ArrayList<Contato>();
    int i = 0;
    Scanner scanner = new Scanner(System.in); 

    public Contato(int id, String nome, String telefone , String email){
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }
    



    /* 
        Metodo para que um contato seja criado e adicionado a lista
    */ 
    public void criarContato() throws PilhaCheiaException{
            System.out.println("informe o nome");
            String nome = (scanner.next());

            System.out.println("informe o Telefone");
            String Telefone = (scanner.next());

            System.out.println("informe o Email ");
            String Email = (scanner.next());

            Contato contato = new Contato(i ,nome,Telefone,Email);
            i++;
            lista.add(contato);
    }

    /* 
        Metodo para que a lista de contatos seja exibido na tela
    */ 
    public void exibir() throws PilhaVaziaException{
        for (Contato cntt : lista) {
            System.out.println(cntt.toString());
        }
    }

    public Contato clone(){
        return new Contato(this.id, this.nome, this.telefone, this.email);
    }


    /* metodo para editar o ultimo contatato adicionado*/
    public void editar() throws PilhaCheiaException{
        historico.push(clone());

        System.out.println("informe o nome");
        String nome = (scanner.next());

        System.out.println("informe o Telefone");
        String telefone = (scanner.next());

        System.out.println("informe o Email ");
        String email = (scanner.next());


        
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;

    }

    public void excluir() throws PilhaCheiaException{
        System.out.println("informe o ID do contato");
        int id = (scanner.nextInt());

        lista.remove(id);
}


    /* metodo para desfazer a ultima edição */
    public void desfazer() throws PilhaVaziaException{
        Contato antigo = historico.pop();
        this.setNome(antigo.getNome());
        this.setTelefone(antigo.getTelefone());
        this.setEmail(antigo.getEmail());

    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("   ID : "+this.id+"   Nome : "+nome+"   Telefone : "+telefone+"    Email : "+email+"  ");
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
        
    }
    
    
}

 