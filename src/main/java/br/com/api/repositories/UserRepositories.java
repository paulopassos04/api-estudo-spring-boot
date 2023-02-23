package br.com.api.repositories;

import br.com.api.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositories extends JpaRepository<User, Long> {
}
