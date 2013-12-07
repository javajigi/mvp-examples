package mvp.server.dao;

import java.util.HashMap;
import java.util.Map;

import mvp.server.model.User;

public class UserDao {
	// 가짜의 메모리 데이터베이스 구현
	public static Map<String, User> users = new HashMap<String, User>();
	
	public void saveUser(User user) {
		users.put(user.getId(), user);
	}
	
	public User findById(String id) {
		return users.get(id);
	}
}
