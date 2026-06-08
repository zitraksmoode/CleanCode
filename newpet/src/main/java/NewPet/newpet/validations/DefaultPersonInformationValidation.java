package NewPet.newpet.validations;

import NewPet.newpet.exeptions.IllegalPersonNameException;

public class DefaultPersonInformationValidation implements PersonInformationValidation{
    private final String rxg = "^[A-Z][a-z]{1,19}$";
    public String ValidationName(String name){
        if(name.matches(rxg)) return name;
        throw new IllegalPersonNameException("Имя:"+name+" Не подходит");
    }
}
