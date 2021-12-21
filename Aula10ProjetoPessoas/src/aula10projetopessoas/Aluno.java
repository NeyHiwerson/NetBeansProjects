
package aula10projetopessoas;

public class Aluno extends Pessoa {
    private int matr;
    private String curso;
    
    //Métodos
    public void pagarMensalidade(){
        System.out.println("Mensalidade paga com sucesso.");
    }
    public void cancelarMatr(){
        System.out.println("Matricula será Cancelada!");
    }

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno "+this.getNome() +" idade "+this.getIdade()+"anos e sexo "+this.getSexo()+
                ", cuja matricula = " + this.getMatr() + " do curso " + this.getCurso()+ '.';
    }
    
    
    
}
