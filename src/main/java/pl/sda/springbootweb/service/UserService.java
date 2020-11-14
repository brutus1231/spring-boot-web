package pl.sda.springbootweb.service;

import org.springframework.stereotype.Service;
import pl.sda.springbootweb.dto.UserDto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private List<UserDto> users = new ArrayList<>();

    public List<UserDto> list() {
        return users;
    }

    public void add(UserDto user) {
        users.add(user);
    }

    public void delete(Long id) {
        UserDto userToDelete =
                users.stream()
                        .filter(t -> t.getId().equals(id))
                        .collect(Collectors.toList()).get(0);
        users.remove(userToDelete);
    }
}
