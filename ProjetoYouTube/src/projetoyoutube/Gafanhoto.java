
package projetoyoutube;

public class Gafanhoto extends Pessoa {
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login=login;
        this.totAssistido=0;
    }

    @Override
    public String toString() {
        return "Gafanhoto " + "login " + login + ", nome "+this.getNome()+", sexo "
                +this.getSexo()+ " com idade de "+this.getIdade()+" e experiencia de "
                +this.getExperiencia()+", total de videos Assistidos  " + totAssistido 
                +".";
                //+ ".\n\n"+super.toString();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
    
    
}
