public class FizzBuzzImpl implements Fizzbuzz{

    @Override
    public String checkFizzBuzz(int input) {
        return null;
    }

    @Override
    public boolean checkFizz(int input) {
        return false;
    }

    @Override
    public boolean checkBuzz(int input) {
        if(input % 5 ==0){
            return true;
        }
        return false;
    }
}
