
package aula10projetopessoas;

public class Aula10ProjetoPessoas {

    public static void main(String[] args) {
        // 
        //Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        Bolsista p5 = new Bolsista();
        
        //p1.setNome("Pedro");
        //p1.setIdade(20);
        //p1.setSexo("M");
        p2.setNome("Narcisa");
        p2.setIdade(17);
        p2.setSexo("F");
        p2.setMatr(1234);
        p2.setCurso("Astronomia");
        p3.setNome("Joao");
        p3.setIdade(45);
        p3.setSexo("M");
        p3.setEspecialidade("Fisica Quantica");
        p3.setSalario(25000);
        p4.setNome("Samanta");
        p4.setIdade(35);
        p4.setSetor("Contabilidade");
        p4.setSexo("F");
        p5.setNome("Juvenal");
        p5.setIdade(22);
        p5.setSexo("M");
        p5.setMatr(2345);
        p5.setCurso("Engenharia");
        p5.setBolsa(70f);
        
        //System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());
    }
    
}
