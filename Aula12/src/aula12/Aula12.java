
package aula12;

public class Aula12 {

    public static void main(String[] args) {
        // TODO code application logic here
        //A linha abaixo não pode ser instanciada pois é uma classe abstrata
        //Animal n = new Animal();
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldfish g = new Goldfish();
        Arara e = new Arara();
        k.setPeso(15);
        k.setIdade(7);
        k.setMembros(4);
        k.setCorPelo("Marron");
        System.out.println(k.toString());
        k.locomover();
        //k.locomover();
        k.alimentar();
        k.emitirSom();
        k.reagir("ola");
        k.reagir("vai dormir");
        k.reagir(6,30);
        k.reagir(13, 30);
        k.reagir(20, 30);
        k.reagir(3, 8.3f);
        k.reagir(4, 12.5f);
        k.reagir(8, 5.5f);
        k.reagir(9, 15.8f);
        k.reagir(15, 7.5f);
        k.reagir(16, 21.7f);
        k.reagir(true);
        k.reagir(false);
        
        
        
        /*
        k.emitirSom();
        m.setMembros(4);
        m.setCorPelo("marron");
        m.setIdade(5);
        m.setPeso(180.5f);
        System.out.println(m.toString());
        m.alimentar();
        m.locomover();
        m.emitirSom();
        
        a.locomover();
        p.locomover();
        r.locomover();*/
    }
    
}
