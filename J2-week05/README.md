# J2-week05 - Spring Data JPA로 영속성 부여

## 1. JPA 의존성 추가

Java를 SQL로 통역시켜주는 것: ORM
Spring Boot에서 주로 Spring Data JPA 사용
Spring Data JPA의 처리 구조: Spring Data JPA -> JPA -> 하이버네이트 -> JDBC Driver -> MySQL Driver -> MySQL 

## 2. Article 테이블

@Id는 primary key다
spring.jpa.hibernate.ddl-auto=update 설정하면 DB 테이블에 자동으로 세팅
코드 삭제해도 만들어진 column은 삭제되지 않음
<img width="793" height="947" alt="image" src="https://github.com/user-attachments/assets/56a53af6-9d9f-447f-a197-375a36912ba6" />

```bash
  logging:
    level:
      demo03: DEBUG
      org.hibernate.SQL: DEBUG
      org.hibernate.orm.jdbc.bind: TRACE
      org.hibernate.orm.jdbc.extract: TRACE
      org.springframework.transaction.interceptor: TRACE
```
  SQL 자세하게 출력함 

## 3. 게시물
Bean: 개발자가 직접 new를 통해서 객체를 생성하지 않아도 되도록 Spring Boot가 직접 관리하는 객체
Bean에는 @Configuration 붙어있어야 함
모든 데이터 출력은 select * ~
데이터 개수 출력은 select count(*) ~
@Builer를 추가할거면 @NoArgsConstructor, @AllArgsConstructor 모두 추가
물리적인 트랜잭션은 DBMS에서의 트랜잭션
메소드에다 @Transactional 붙이면 그 안의 SQL들은 하나로 묶임
영속성 컨텍스트의 내용과 Repository의 내용을 비교해봤을 때 달라지면 dirty
this를 통한 객체 내부 메서드에 의한 호출은 @Transactional을 발동시키지 않음
Optional은 리스트와 비슷하지만, 값이 최대 1개만 저장될 수 있음

### 4. ArticleService
Repository는 보통 관련 서비스에서만 접근이 가능하고, 그 외에 다른 모듈에서 직접 Repository를 다루지 않는 게 보통

### 5. Entity의 생성, 수정날짜 자동기입
Java에서 보통 날짜를 저장할 때는 LocalDateTime 사용, 이는 MySQL의 DATETIME 타입과 호환

### 6. RsData 도입
RsData를 사용하면 결과 데이터 뿐 아니라 상태코드, 메시지까지 묶어서 리턴할 수 있음

### 7. 오류상태를 리턴말고 예외발생
예외 상황 발생 시 빠른 리턴보다 예외를 발생시키는 게 관례
IllegalArgumentException 도 좋지만 추후 더 세밀한 예외 핸들링을 위해서 GlobalException 을 추가
@Transactional 이 붙은 메서드에서 RuntimeException 계열 예외를 발생시킴, 그러면 해당 로직을 포함한 물리 트랜잭션(가장 바깥쪽 @Transactional 붙은 메서드)의 모든 쿼리가 취소
GlobalException 은 getRsData() 메서드를 통해서 오류 상태에 대한 정보를 받을 수 있음

### 8. 서비스에 @Transactional 적용
서비스의 모든 public 메서드에는 @Transactional 을 붙여야 함, 그 중 오직 조회(SELECT)로만 구성된 메서드는 @Transactional(readOnly = True) 를 붙여야 한다.
클래스 수준에서 @Transactional(readOnly = True) 를 붙힘

### 9. Article에 Member 추가
@ManyToOne은 하나의 Article를 많은 Member가 쓸 수 있기 때문에 붙여줌

### 10. Likelion에 author 필드 추가
@RequestScope는 생명주기를 바꿔 요청이 들어올 때마다 객체 생성
findById와 getReferenceById 같음, 다만 getReferenceById는 Proxy 객체 리턴


