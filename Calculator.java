package StepsForFeatureFile;



public class Calculator {
    public int number1;
    public int number2;
    public int result;

    public void enter(int number) {
        if (number1 == 0) {
            number1 = number;
        } else {
            number2 = number;
        }
    }

    public int add() {
        result = number1 + number2;
        return result;
    }
}

