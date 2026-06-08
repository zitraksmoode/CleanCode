package NewPet.newpet.entitys;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Books {
    private Long id;
    private String name;
    private People people;
    private long count;
    private  ExclusivityLevel exclusivityLevel;
}
