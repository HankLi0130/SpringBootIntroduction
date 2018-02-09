package tw.hankli.springrestdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tw.hankli.springrestdemo.model.User;
import tw.hankli.springrestdemo.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public User save(String name, String phone) {
        return userRepository.save(new User(name, phone));
    }

    public User findOne(Long id) {
        return userRepository.findOne(id);
    }
}
