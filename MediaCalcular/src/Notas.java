public class Notas {
    int nota1;
    int nota2;
    int nota3;
    int nota4;
    int media;

    public void calcularMedia (){
        media = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.println("A média é: " + media);

    }

    public void reprovadoAprovadoRecuperacao(){

        if (media >= 7){
            System.out.println("Aluno aprovado");
        }
         else if (media <7 && media >= 5)  {
            System.out.println("Aluno de recuperação");
        }
        else  {
            System.out.println("Aluno Reprovado");
        }
    }
}
