**스프링부트로 구현하는 ‘URL 단축 서비스’**
- spring boot가 실행되는 곳은 개인 pc가 아님.
- @GetMapping을 달면 해당 메서드는 브라우저에서 호출 가능, 액션 메서드로 만들어줌
- @Controller 붙이면 new HomeController() 만들어 객체 생성
- 클라이언트와 서버가 소통하려면 둘 다 이해 가능한 String 형식으로 통신
- url에서 ?로 정보 표현, &로 구분함 
