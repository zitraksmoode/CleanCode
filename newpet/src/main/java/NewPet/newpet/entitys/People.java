package NewPet.newpet.entitys;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.UUID;

@Data
@RequiredArgsConstructor
public class People {
    private UUID id;
    private String name;
    private ArrayList<Books> books;
    private String status;
    private boolean debtor;
}
