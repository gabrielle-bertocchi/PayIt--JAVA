import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {

        System.out.println("You are in a house in the middle of the forest");
        System.out.println("Choose a direction (w, d, s, a): ");

        Scanner scan = new Scanner(System.in);
        String opcao;

        do{
            opcao = scan.nextLine();

            if(opcao.equals("w")){
                System.out.println("Wall! You hit it in the head...");
            }else if(opcao.equals("d")) {
                System.out.println("Wild wolves! You've been devoured...");
            }else if (opcao.equals("s")) {
                System.out.println("Careful! Monster! You were crushed...");
            }else if(opcao.equals("a")) {
                System.out.println("You found the way out! Congratulations...");
            }


        }while(!opcao.equals("a"));
    }

}
