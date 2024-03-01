public class App {
    public static void main(String[] args) throws Exception {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(7862);
        p1.setDono("Deivis");
        p1.abrirConta("CC");
        

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Gugu");
        p2.abrirConta("CP");
        
        p1.depositar(320);
        p2.depositar(931);

        p1.sacar(35);
        p2.sacar(100);

        p1.estadoAtual();
        p2.estadoAtual();
    }
}
