package tn.esprit.testprojet.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.testprojet.entities.User;
import tn.esprit.testprojet.repositories.UserRepo;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements IUserService{
    UserRepo userRepo;

    @Override
    public User ajouterUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public void supprimerUser(Long id) {
        userRepo.deleteById(id);
    }

    @Override
    public List<User> getUsers() {
        return userRepo.findAll();
    }

    @Override
    public User getUser(Long id) {
        return userRepo.findById(id).orElse(null);
    }

    @Override
    public User modifierUser(User user) {
        return userRepo.save(user);
    }
}
