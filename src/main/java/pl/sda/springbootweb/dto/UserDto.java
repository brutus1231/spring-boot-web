package pl.sda.springbootweb.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto implements Serializable {
    private Long id;
    private String firstName;
    private String lastName;
    private String address;
}
