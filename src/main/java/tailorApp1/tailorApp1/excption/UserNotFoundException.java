package tailorApp1.tailorApp1.excption;


public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String str){
        super(str);
    }
}
