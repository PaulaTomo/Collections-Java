package advanced.models;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class User extends AbstractPerson{

    private String userName;

    @ToString.Exclude
    private String password;

    @Override
    public String getDetails(){
        return String.format("Name = %s %s", this.getFName(), this.getLName());
    }

}
