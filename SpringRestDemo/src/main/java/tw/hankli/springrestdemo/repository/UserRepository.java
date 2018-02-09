package tw.hankli.springrestdemo.repository;

import org.springframework.data.neo4j.repository.GraphRepository;
import tw.hankli.springrestdemo.model.User;

public interface UserRepository extends GraphRepository<User> {
}
