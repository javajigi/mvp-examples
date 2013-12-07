package mvp.client.view;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import mvp.server.model.User;

/**
 * 메소드 호출과 전달하는 값이 일치하는지를 확인하는 클래스
 * 테스트 용도로 만든 가짜 클래스이다. 따라서 실제 구현에서는 필요없다.
 *  
 * @author javajigi
 */
public class EventListener implements UserView {
	private int countOfId = 0;
	private int countOfName = 0;
	private User user;
	
	public EventListener(User user) {
		this.user = user;
	}
	
	@Override
	public void setId(String id) {
		countOfId++;
		assertThat(id, is(user.getId()));
	}

	@Override
	public void setName(String name) {
		countOfName++;
		assertThat(name, is(user.getName()));
	}
	
	public int getCountOfId() {
		return countOfId;
	}
	
	public int getCountOfName() {
		return countOfName;
	}
}
