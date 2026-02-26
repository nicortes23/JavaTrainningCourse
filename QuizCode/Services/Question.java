package Services;

public class Question {
    private String enunciado;
    private String f1;
    private String f2;
    private String f3;
    private String t;

    //Constructor
        public Question(String enunciado, String f1, String f2, String f3, String t) {
        this.enunciado = enunciado;
        this.f1 = f1;
        this.f2 = f2;
        this.f3 = f3;
        this.t = t;
    }

    //Getters and Setters
    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }
    public String getF1() {
        return f1;
    }
    public void setF1(String f1) {
        this.f1 = f1;
    }
    public String getF2() {
        return f2;
    }
    public void setF2(String f2) {
        this.f2 = f2;
    }
    public String getF3() {
        return f3;
    }
    public void setF3(String f3) {
        this.f3 = f3;
    }
    public String getT() {
        return t;
    }
    public void setT(String t) {
        this.t = t;
    }
}
