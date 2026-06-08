package NewPet.newpet.exeptions;

public class LibraryNotFoundException extends  RuntimeException{
    public  LibraryNotFoundException(String message) {
        super(message);
    }
}
