
package aula10projetopessoas;

public final class Professor extends Pessoa {
    
    private String especialidade;
    private float salario;
    
    //Métodos
    public void ReceberAum(float aum){
        this.setSalario(this.getSalario()+ aum);
    }
    
    //Métodos Especiais

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor " +this.getNome()+" idade "+this.getIdade()+"anos e sexo "
                +this.getSexo()+ ", especialidade " + especialidade + ", salario de " + salario + '.';
    }
    
    
}
