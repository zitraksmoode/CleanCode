package NewPet.newpet.entitys;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
public class Libraries {
    private Long id;
    private String name;
    private List<Books> booksList;

}
