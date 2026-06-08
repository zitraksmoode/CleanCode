package NewPet.newpet.exeptions;

public class UserNotFoundException extends RuntimeException {
    public  UserNotFoundException(String message) {
        super(message);
    }
}
