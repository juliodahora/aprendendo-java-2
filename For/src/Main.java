import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

        System.out.println("Deseja utilizar  a tabuada? [S/N]");
        String resp = s.nextLine();
        while (resp.equalsIgnoreCase("Sim")){
        System.out.println("de qual numero?");
        int num = s.nextInt();
        for (int i = 0; i <= 10; i++){
            System.out.println(num + " X " + i + " = " + i*num);
        }
            resp = s.nextLine();
            System.out.println("Deseja utilizar novamente  a tabuada? [S/N]");
            resp = s.nextLine();
    }

        System.out.println("obrigado");
}
    }