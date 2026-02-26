package Services;

import java.util.Scanner;

public class BucleGameService {
    private QuestionService game = new QuestionService();
    private int score;
    private Scanner sc = new Scanner(System.in);

    public BucleGameService(){
        for (int i=0; i<=4; i++){
            char r = 'z';
            while ("ABCD".indexOf(r) == -1){

                System.out.println("Pregunta "+(i+1)+":");
                char rta = game.displayQuestion(i);
                System.out.print("Ingresa tú respuesta (A-D): ");
                r = sc.nextLine().charAt(0);

                if ("ABCD".indexOf(r) == -1){
                    System.out.println("Opcón de respuesta invalida, intente de nuevo:");
                }

                if (r == rta){
                    score += 10;
                }
            }
        }
        System.out.println("Tu puntaje es: "+score);
    }
        
}
