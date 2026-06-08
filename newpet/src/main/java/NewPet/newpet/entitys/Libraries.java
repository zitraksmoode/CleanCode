package NewPet.newpet.entitys;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
public class Libraries {
    private long id;
    private String name;
    private List<Books> booksList;

}
