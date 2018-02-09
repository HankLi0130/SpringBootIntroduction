package tw.hankli.springrestdemo.model;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

@NodeEntity(label = "User")
public class User {

    @GraphId
    public Long id;

    @Property(name = "Name")
    public String name;

    @Property(name = "Phone")
    public String phone;

    public User() {
    }

    public User(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}
