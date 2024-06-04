public class FizzBuzzImpl implements Fizzbuzz{

    @Override
    public String checkFizzBuzz(int input) {
        return null;
    }

    @Override
    public boolean checkFizz(int input) {
        boolean check = input % 3 == 0;
        return check;
    }

    @Override
    public boolean checkBuzz(int input) {
        return false;
    }

}
