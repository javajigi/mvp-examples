package mvp.client.delegate;

import mvp.server.model.ServerUserService;
import mvp.server.model.User;
import mvp.server.model.UserService;

/**
 * Core J2EE Pattern 중에서 Business Delegate 역할을 한다.
 * 이 예제의 구현은 정말 단순하지만 실제 구현에서는 서버와의 통신을 담당하다.
 * JSON 또는 XML 데이터를 자바 객체로 변환하거나 서버에 데이터를 전송한다.
 * 
 * @author javajigi
 */
public class ClientUserDelegate implements UserService {
	private UserService userService = new ServerUserService();
	
	public void saveUser(User user) {
		userService.saveUser(user);
	}

	public User findById(String id) {
		return userService.findById(id);
	}
}
