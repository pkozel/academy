package theory.lecture_15.behavior.strategy;

public class OpeationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
