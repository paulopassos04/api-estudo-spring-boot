package br.com.api.services;

import br.com.api.models.User;
import br.com.api.repositories.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepositories userRepositories;

    public List<User> findAll(){
        return userRepositories.findAll();
    }

    public User findById(Long id){
        Optional<User> obj = userRepositories.findById(id);
        return obj.get();
    }
    
}
