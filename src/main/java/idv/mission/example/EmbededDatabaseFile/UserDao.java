package idv.mission.example.EmbededDatabaseFile;

import java.util.List;

public interface UserDao {
	User findByName(String name);
	List<User> findAll();
}