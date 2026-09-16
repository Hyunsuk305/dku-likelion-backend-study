**스프링부트로 구현하는 ‘URL 단축 서비스’**
- spring boot가 실행되는 곳은 개인 pc가 아님.
- @GetMapping을 달면 해당 메서드는 브라우저에서 호출 가능, 액션 메서드로 만들어줌
- @Controller 붙이면 new HomeController() 만들어 객체 생성
- 클라이언트와 서버가 소통하려면 둘 다 이해 가능한 String 형식으로 통신
- url에서 ?로 정보 표현, &로 구분함 
- Jackson은 액션 메서드가 String 이외의 형태의 데이터를 리턴하면 String 형태(그 중에서도 Json)으로 변환해줌
- Lombok에서 제공하는 @Builder 어노테이션은 new 대신, 빌더 패턴으로 객체 생성하게 해줌
- GetMapping 할 때 ("/{id}") 형식으로 표현하는 거 선호
- URL의 쿼파라미터 값은 URL 인코딩이 정석
- HttpReqeustServlet은 받은 요청의 대한 자세한 정보를 얻어야 할 때 사용

