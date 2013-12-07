Model View Presenter(MVP) examples
================================
이 예제는 [MVP 패턴의 이해와 활용](http://steveyoon.tistory.com/188)이라는 글을 보고 간단히 작성해 본 예제이다.

이 예제는 모바일과 웹 서버가 연동한다고 가정할 때의 MVP 패턴을 적용한 애플리케이션 아키텍처의 흐름을 기반으로 구현했다.
아키텍처에 구조는 다음 그림과 같다.

![](http://www.slipp.net/wiki/download/attachments/12878076/mvp.jpg)

(출처 : http://steveyoon.tistory.com/188)

MVP 기본 클래스 
-------------------------
MVP는 안드로이드 개발 구조를 추상화해서 간략하게 만들었다. MVP에 대한 기본 구조는 src 소스 디렉토리의 mvp.client 패키지에서 확인할 수 있다.

* mvp.client.view.FromActivity : 안드로이드의 Activity 클래스라고 가정하고 만들었다. Activity에서 Click 이벤트 처리는 모의로 만들어 처리했다.
* mvp.client.view.UserView : MVP에서 View를 담당
* mvp.client.presenter.UserPresenter : MVP에서 Presenter를 담당
* mvp.client.delegate.ClientUserDelegate : Server API와 통신해 Client에서 사용 가능한 형태로 데이터를 변환하는 작업을 담당하게 된다. 이 예제에서는 서버를 직접 호출하는 구조로 구현되어 있다. 