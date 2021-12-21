
package aula10projetopessoas;

public final class Tecnico extends Aluno {
    public String regProf;
    
    //Métodos
    public void praticar(){
        System.out.println("Praticando e ganhando experiência.");
    }
    //Métodos especiais

    public String getRegProf() {
        return regProf;
    }

    public void setRegProf(String regProf) {
        this.regProf = regProf;
    }

    @Override
    public String toString() {
        return "Tecnico "+this.getNome() + " regProf: " + this.getRegProf() +" idade "+this.getIdade()+"anos e sexo "+this.getSexo()+
                ", cuja matricula = " + this.getMatr() + " do curso " + this.getCurso()+ '.';
    }
    
    
    
}
