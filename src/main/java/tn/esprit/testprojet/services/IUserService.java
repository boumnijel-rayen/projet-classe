package tn.esprit.testprojet.services;

import tn.esprit.testprojet.entities.Universite;
import tn.esprit.testprojet.entities.User;

import java.util.List;

public interface IUserService {
    public User ajouterUser(User user);
    public void supprimerUser(Long id);
    public List<User> getUsers();
    public User getUser(Long id);
    public User modifierUser(User user);
}
