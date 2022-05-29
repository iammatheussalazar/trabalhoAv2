package trabalhoAv2;

public class Principal {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        c1.setNome("Anderson");
        c1.setEndereco("Rua Aztecas, 58");
        Fixa f1 = new Fixa(35, "3333-3333");
        f1.setCliente(c1);
        Movel m1 = new Movel(235, "99999-9999", true);
        m1.setCliente(c1);
        c1.adicionarLinhaTelefonica(f1);
        c1.adicionarLinhaTelefonica(m1);
        
        Cliente c2 = new Cliente();
        c2.setNome("Alexia");
        c2.setEndereco("Rua Pereira de Figueiredo, 40");
        Fixa f2 = new Fixa(28, "4444-4444");
        f2.setCliente(c2);
        Movel m2 = new Movel(285, "98888-8888", false);
        m2.setCliente(c2);
        c2.adicionarLinhaTelefonica(f2);
        c2.adicionarLinhaTelefonica(m2);
        
        System.out.println(c1);
        System.out.println("\n");
        System.out.println(c2);
        
    }
}
