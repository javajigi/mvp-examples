package mvp.client.view;

import mvp.client.delegate.ClientUserDelegate;
import mvp.client.presenter.UserPresenter;
import mvp.server.model.User;
import mvp.server.model.UserService;

public class FormActivity implements UserView {
	private UserService userDelegate;
	private UserPresenter presenter;
	
	private EventListener listener;

	public FormActivity(EventListener listener) {
		this.listener = listener;
	}

	public void onCreate(String id) {
		userDelegate = new ClientUserDelegate();
		presenter = new UserPresenter(userDelegate, this);
		
		if (id != null) {
			presenter.loadUser(id);
		}
	}

	/**
	 * 테스트를 위해 가짜로 click 이벤트를 발생
	 * 사용자 저장 버튼이 클릭되는 상황을 모의로 재현 
	 * 
	 * @param user
	 */
	public void saveUser(final User user) {
		OnClickListener clickListener = new OnClickListener () {
			public void onClick() {
				presenter.saveUser(user);
			}
		};
		clickListener.onClick();
	}

	/**
	 * 테스트를 위해 가짜로 click 이벤트를 발생
	 * 사용자 조회 버튼이 클릭되는 상황을 모의로 재현
	 * 
	 * @param id
	 */
	public void loadUser(final String id) {
		OnClickListener clickListener = new OnClickListener () {
			public void onClick() {
				presenter.loadUser(id);
			}
		};
		clickListener.onClick();
	}

	@Override
	public void setId(String id) {
		listener.setId(id);
	}

	@Override
	public void setName(String name) {
		listener.setName(name);
	}

}
