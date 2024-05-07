package Servico;

import java.util.Scanner;

public class Rotina {

    private String hora;
    private String atividade;

    public static void main(String[] args){
        Scanner lerAtividade = new Scanner(System.in);
        System.out.println("Quantas atividades tem a ser feita hj");
        int quantidadeAtividade = lerAtividade.nextInt();

        Rotina[] rotinas = new Rotina[quantidadeAtividade];

        for (int i = 0; i < quantidadeAtividade; i++) {
            System.out.println("Digite a tarefa que tem que ser realizada: ");
            String atividade = lerAtividade.next();
            System.out.println("Digite a hora que a atividade deve ser realizada: ");
            String hora = lerAtividade.next();
            rotinas[i] = new Rotina(atividade, hora);
        }

        System.out.println("\nAtividades do dia:");
        for (Rotina rotina : rotinas) {
            System.out.println(rotina.getHora() + " - " + rotina.getAtividade());
        }
    }

    // Construtor
    public Rotina(String atividade,String hora) {
        this.atividade = atividade;
        this.hora = hora;
    }

    //Get && Set
    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
