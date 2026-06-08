package NewPet.newpet.exeptions;

public class IllegalPersonNameException extends RuntimeException{
    public IllegalPersonNameException(String message) {
        super(message);
    }
}
