
package aula10projetopessoas;

public class Bolsista extends Aluno {
    private float bolsa;
    
    //Métodos
    public void renovarBolsa(){
        System.out.println("Bolsa renovada com sucesso, use seu desconto por mais um semestre");
    }
    @Override
    public void pagarMensalidade(){
        System.out.println("Bolsista tem desconto de "+this.getBolsa()+" em sua mensalidade.");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public String toString() {
        return "Bolsista " +this.getNome()+" idade "+this.getIdade()+"anos e sexo "+this.getSexo()+
                ", cuja matricula = " + this.getMatr() + " do curso " + this.getCurso()+
                ". Tem bolsa de " + this.getBolsa() + "%.";
    }
    
    
}
