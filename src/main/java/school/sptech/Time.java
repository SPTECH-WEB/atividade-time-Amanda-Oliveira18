package school.sptech;

public class Time {
    String nome;
    Integer vitorias = 0;
    Integer empates = 0;
    Integer derrotas = 0;


    public void registrarVitoria(){
        vitorias++;
    }
    public void registrarEmpate(){
        empates++;
    }
    public void registrarDerrota(){
        derrotas++;
    }
    public Integer getPontos(){
        return vitorias * 3 + (empates * 1);
    }
    public Integer getTotalPartidas(){
        return vitorias + empates + derrotas;
    }
    public Integer getAproveitamento(){
        return (vitorias * 100) / getTotalPartidas();
    }
    public void compararAproveitamento(Time dois){
        if(getAproveitamento() > dois.getAproveitamento()){
            System.out.println("O time " + nome + " tem um aproveitamento maior que o time " + dois.nome);
        } else if(dois.getAproveitamento() > getAproveitamento()){
            System.out.println("O time " + dois.nome + " tem um aproveitamento maior que o time " + nome);
        } else{
            System.out.println("O time " + nome + " e " + dois.nome + " têm o mesmo aproveitamento.");
        }
    }

    public void exibirInformacoes(){
        System.out.println("Time: " + nome);
        System.out.println("Vitórias: " + vitorias);
        System.out.println("Empates: " + empates);
        System.out.println("Derrotas: " + derrotas);
        System.out.println("\nPontos" + getPontos());
        System.out.println("Total de partidas: " + getTotalPartidas());
        System.out.println("Aproveitamento: " + getAproveitamento() + "%");
        System.out.println("\n--- \n");

    }
}
