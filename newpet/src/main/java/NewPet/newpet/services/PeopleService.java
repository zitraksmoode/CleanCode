package NewPet.newpet.services;

import org.springframework.stereotype.Service;

@Service
public class PeopleService implements People{
    @Override
    public String createPeople(String name, String id) {
        return "";
    }

    @Override
    public String addBooksForPeople(String name, String Books) {
        return "";
    }
}
