package advanced.models;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public class AbstractPerson extends BaseModel{

    private String fName;
    private String lName;

    public String getDetails() {
        return null;
    }


    public String getPassword() {
        return null;
    }
}
