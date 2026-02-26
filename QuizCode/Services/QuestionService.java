package Services;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class QuestionService {
    private Question banco[] = new Question[5];

    public QuestionService(){
        banco[0] = new Question("2+2:", "5", "6", "0", "4");
        banco[1] = new Question("2+3:", "2", "6", "0", "5");
        banco[2] = new Question("3+2:", "1", "6", "0", "5");
        banco[3] = new Question("8+2:", "5", "6", "0", "10");
        banco[4] = new Question("5+2:", "5", "6", "0", "7");
    }

    public QuestionService(int id, String enunciado, String f1, String f2, String f3, String t){
        banco[id] = new Question(enunciado, f1, f2, f3, t);
    }

    public char displayQuestion(int id){
        char rta='z';
        int k=0;
        String options[] = new String[4];
        options[0] = banco[id].getF1();
        options[1] = banco[id].getF2();
        options[2] = banco[id].getF3();
        options[3] = banco[id].getT();
        List<String> lista = Arrays.asList(options);
        Collections.shuffle(lista);
        options = lista.toArray(new String[0]);

        System.out.println(banco[id].getEnunciado());

        for (int i = 65; i <= 68; i++){
            char j = (char)i;
            System.out.println(j+" - "+options[k]);
            
            if (options[k].equals(banco[id].getT())){
                rta = j;
            }
            k++;
        }
        return rta;
    }
}
