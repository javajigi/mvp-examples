package mvp.server.model;

public interface UserService {
	void saveUser(User user);
	
	User findById(String id);
}
