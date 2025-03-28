public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Richard Rios";
        p1.idade = 24;
        p1.apresentar();

        Contabancaria cb = new Contabancaria();
        cb.setSaldo(1500000);
        System.out.println(cb.getSaldo());
                                                                                            
        Pessoa p2 = new Pessoa();
        p2.nome = "Manu Rios";
        p2.idade = 26;
        p2.apresentar(); 
        
        Contabancaria cb2 = new Contabancaria();
        cb2.setSaldo(300000);
        System.out.println(cb2.getSaldo());
                                             
    }
}
