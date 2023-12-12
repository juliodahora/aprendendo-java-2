public class Aluno {

        String nome;
        int codAluno;
        int notaUm;


        void status() {

            if (notaUm > 7) {
                System.out.println("Aluno aprovado");
            } else {
                System.out.println("Aluno reprovado");}
        }

        void nomeOla (){

            System.out.println("Olá, " + nome + " seu código é: " + codAluno);

        }
}
