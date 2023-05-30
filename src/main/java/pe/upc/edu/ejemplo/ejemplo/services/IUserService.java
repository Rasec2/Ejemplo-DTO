package pe.upc.edu.ejemplo.ejemplo.services;

import pe.upc.edu.ejemplo.ejemplo.entities.User;

import java.util.List;

public interface IUserService {
    public void insert(User user);

    List<User> list();

    public void delete(int idUser);

    public User listId(int idUser);

}
