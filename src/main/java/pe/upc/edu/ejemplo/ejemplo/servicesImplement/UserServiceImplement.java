package pe.upc.edu.ejemplo.ejemplo.servicesImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.upc.edu.ejemplo.ejemplo.entities.User;
import pe.upc.edu.ejemplo.ejemplo.repositories.IUserRepository;
import pe.upc.edu.ejemplo.ejemplo.services.IUserService;

import java.util.List;

@Service
public class UserServiceImplement implements IUserService {
    @Autowired
    private IUserRepository uR;

    @Override
    public void insert(User user) {
        uR.save(user);
    }

    @Override
    public List<User> list() {
        return uR.findAll();
    }

    @Override
    public void delete(int idUser) {
        uR.deleteById(idUser);

    }

    @Override
    public User listId(int idUser) {
        return uR.findById(idUser).orElse(new User());
    }
}
