package pl.sda.springbootweb.service;

import org.springframework.stereotype.Service;
import pl.sda.springbootweb.dto.UserDto;
import pl.sda.springbootweb.model.User;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    public List<UserDto> list() {
        return new ArrayList<>();
    }

    public void add(UserDto user) {

    }

    public void delete(Long id){

    }
}
