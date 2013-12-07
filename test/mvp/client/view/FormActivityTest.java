package mvp.client.view;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import mvp.server.dao.UserDao;
import mvp.server.model.User;

import org.junit.Before;
import org.junit.Test;

public class FormActivityTest {
	private FormActivity activity;
	private User user;
	private EventListener eventListener;
	
	@Before
	public void setup() {
		user = new User("id", "password", "name");
		eventListener = new EventListener(user);
		activity = new FormActivity(eventListener);
		activity.onCreate(null);

	}
	
	@Test
	public void onCreate_수정화면() throws Exception {
		UserDao.users.put("id", user);
		activity.onCreate("id");
		
		assertThat(eventListener.getCountOfId(), is(1));
		assertThat(eventListener.getCountOfName(), is(1));
	}

	@Test
	public void saveUser() {
		activity.saveUser(user);
		
		assertThat(UserDao.users.get("id"), is(user));
	}
	
	@Test
	public void loadUser() throws Exception {
		UserDao.users.put("id", user);
		
		activity.loadUser("id");
		
		assertThat(eventListener.getCountOfId(), is(1));
		assertThat(eventListener.getCountOfName(), is(1));
	}
}
