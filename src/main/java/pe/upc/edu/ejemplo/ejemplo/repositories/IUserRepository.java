package pe.upc.edu.ejemplo.ejemplo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.upc.edu.ejemplo.ejemplo.entities.User;

public interface IUserRepository extends JpaRepository<User,Integer> {
}
