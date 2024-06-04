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
        boolean check = input % 3 == 0;
        return check;
    }

    @Override
    public boolean checkBuzz(int input) {
        if(input % 5 ==0){
            return true;
        }
        return false;
    }
}
