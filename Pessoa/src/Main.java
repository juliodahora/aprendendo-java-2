import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome;
        String sexo;
        Scanner scan = new Scanner(System.in);
        List<Pessoa> Masculino = new ArrayList<Pessoa>();
        List<Pessoa> Feminino = new ArrayList<Pessoa>();
        List<Pessoa> lista = new ArrayList<Pessoa>();


        System.out.println("*********** LISTA DE NOMES **********");
        System.out.println("Digite o nome: ");
        nome = scan.nextLine();
        System.out.println("Digite o sexo: ");
        sexo = scan.nextLine();

        Pessoa pessoa1 = new Pessoa(nome,sexo);

        System.out.println("Digite o nome: ");
        nome = scan.nextLine();
        System.out.println("Digite o sexo: ");
        sexo = scan.nextLine();

        Pessoa pessoa2 = new Pessoa(nome,sexo);

        if (pessoa1.genero.equalsIgnoreCase("Masculino")){
            Masculino.add(pessoa1);
        } else  {
            Feminino.add(pessoa1);
        }

        if (pessoa2.genero.equalsIgnoreCase("Masculino")){
            Masculino.add(pessoa2);
        } else  {
            Feminino.add(pessoa2);
        }



        System.out.println(Masculino);
        System.out.println(" ");
        System.out.println(Feminino);









    }

    }






