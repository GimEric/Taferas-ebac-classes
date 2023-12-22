public class PrimeiraClasse {

    public static void main(String args[]){
       System.out.println("Olá Eric");
       Cliente cliente = new Cliente();
       cliente.cadastrarEndereco("AV DOM JOAO");
       cliente.setCodigo(2);
       System.out.println(cliente.getCodigo());
       cliente.imprimirEndereço();

    }
}
