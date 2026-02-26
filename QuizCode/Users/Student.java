package Users;
public class Student extends Professor{
    private int score;

    public Student(String username, String password) {
        super(username, password);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
}
