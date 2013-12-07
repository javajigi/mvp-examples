package mvp.client.delegate;

import mvp.server.model.ServerUserService;
import mvp.server.model.User;
import mvp.server.model.UserService;

public class ClientUserDelegate implements UserService {
	private UserService userService = new ServerUserService();
	
	public void saveUser(User user) {
		userService.saveUser(user);
	}

	public User findById(String id) {
		return userService.findById(id);
	}
}
