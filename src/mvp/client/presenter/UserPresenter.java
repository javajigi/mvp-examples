package mvp.client.presenter;

import mvp.client.view.UserView;
import mvp.server.model.User;
import mvp.server.model.UserService;

public class UserPresenter {
	private UserService userService;
	private UserView view;

	public UserPresenter(UserService userService, UserView view) {
		this.userService = userService;
		this.view = view;
	}

	public void saveUser(User user) {
		userService.saveUser(user);
	}

	public void loadUser(String id) {
		User user = userService.findById(id);
		System.out.println("User : " + user);
		if (user != null) {
			view.setId(user.getId());
			view.setName(user.getName());
		}
	}
}
