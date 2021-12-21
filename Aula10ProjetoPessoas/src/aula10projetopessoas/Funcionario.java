
package aula10projetopessoas;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;
    
    //Métodos
    private void mudarTrabalho(String area){
        this.trabalhando = !this.trabalhando;
    }
    
    //Métodos Especiais

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    @Override
    public String toString() {
        return "Funcionario " + this.getNome() + ", idade = " + this.getIdade()+ " anos" 
                + ", sexo " + this.getSexo() + ", setor " + this.getSetor()+ ", trabalhando " + this.getTrabalhando()+ '.';
    }
    
    
}
