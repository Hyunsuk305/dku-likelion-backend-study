## throw, Handler
return RsData.of("400-1", "아이디를 입력해주세요."); 대신에 throw new Exception("400-1", "아이디를 입력해주세요.") 사용
return보다 throw가 좋은 이유: return으로 하면 리턴 타입이 허용하는 범위 내에서 예외 정보를 표현해야 하기 때문에 쓸데없는 코드와 어색한 코드를 쓸 수 밖에 없는 상황이 발생한다. 그에 비해 throw 는 리턴 타입와 상관이 없음
Spring Boot는 기계와 인간에 맞춰서 응답을 보냄, 정보와 꾸밈을 모두 처리 가능(MPA)
정보만 따로 써야하는 경우는 프론트엔드 서버 사용(SPA)

## POSTMAN
POSTMAN으로 GET, POST, PUT, PATCH, DELETE HTTP 메서드로 요청, 쿼리스트링 뿐 아니라 요청본문으로도 부가정보를 요청에 담음
HTTP 메서드를 활용하면 URL 이 명사화 

## Jackson
Jackson 은 객체를 다양한 표현양식으로 변환해 줌
Map <-> Person
Map <-> Json
Person <-> Json

## Validation
유효성 체크와 관련된 라이브러리
@NotBlank, @NotNull, @Min 등 룰 걸 수 있음

## rq
rq는 요청과 응답 쌍에 대한 추상화된 레이어
rq는 내부적으로 요청(HttpServletRequest)과 응답(HttpServletResponse)에 접근하고 다룰 수 있음
