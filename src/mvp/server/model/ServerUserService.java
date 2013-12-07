package mvp.server.model;

import mvp.server.dao.UserDao;

public class ServerUserService implements UserService {
	private UserDao userDao = new UserDao();
	
	public void saveUser(User user) {
		userDao.saveUser(user);
	}

	@Override
	public User findById(String id) {
		return userDao.findById(id);
	}

}
