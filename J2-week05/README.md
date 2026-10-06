# J2-week05 - Spring Data JPA로 영속성 부여

## 1. JPA 의존성 추가

Java를 SQL로 통역시켜주는 것: ORM
Spring Boot에서 주로 Spring Data JPA 사용
Spring Data JPA의 처리 구조: Spring Data JPA -> JPA -> 하이버네이트 -> JDBC Driver -> MySQL Driver -> MySQL 


## 2. Article 테이블

```bash
@Id는 primary key다
```
spring.jpa.hibernate.ddl-auto=update 설정하면 DB 테이블에 자동으로 세팅
코드 삭제해도 만들어진 column은 삭제되지 않음
<img width="793" height="947" alt="image" src="https://github.com/user-attachments/assets/56a53af6-9d9f-447f-a197-375a36912ba6" />

'''bash
  logging:
    level:
      demo03: DEBUG
      org.hibernate.SQL: DEBUG
      org.hibernate.orm.jdbc.bind: TRACE
      org.hibernate.orm.jdbc.extract: TRACE
      org.springframework.transaction.interceptor: TRACE
  '''
  SQL 자세하게 출력함 

## 3. 게시물
Bean: 개발자가 직접 new를 통해서 객체를 생성하지 않아도 되도록 Spring Boot가 직접 관리하는 객체
Bean에는 @Configuration 붙어있어야 함
모든 데이터 출력은 select * ~
데이터 개수 출력은 select count(*) ~
@Builer를 추가할거면 @NoArgsConstructor, @AllArgsConstructor 모두 추가
물리적인 트랜잭션은 DBMS에서의 트랜잭션
