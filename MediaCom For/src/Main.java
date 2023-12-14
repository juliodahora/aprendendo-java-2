import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float s = 0;
        System.out.println("quantas notas você quer analisar?");
        int j = scan.nextInt();

        for (int i = 1; i <=j; i++){

            System.out.println("Digite a " + i + "a nota: ");
            int nota = scan.nextInt();

            s = s+nota;
        }
        float media = s/j;
        System.out.println("sua média é: " + media);

        status(media);

    }
    public static void status(float media){
       if (media > 7){
           System.out.println("Aluno aprovado");
       } else if (media < 7 && media >= 5){
           System.out.println("Aluno de recuperação");
       } else {
            System.out.println("Aluno reprovado");
        }
    }
}