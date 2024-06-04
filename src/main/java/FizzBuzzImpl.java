public class FizzBuzzImpl implements Fizzbuzz{

    @Override
    public String checkFizzBuzz(int input) {
        StringBuilder stringBuilder = new StringBuilder();
        if(checkFizz(input)){
            stringBuilder.append("Fizz");
        }
        if(checkBuzz(input)){
            stringBuilder.append("Buzz");
        }
        if(stringBuilder.isEmpty()){
            stringBuilder.append(input);
        }
        return stringBuilder.toString();
    }

    @Override
    public boolean checkFizz(int input) {
        return false;
    }

    @Override
    public boolean checkBuzz(int input) {
        return false;
    }

}
