#  Book CRUD API (week06)

Spring Boot와 Spring Data JPA를 활용한 도서(Book) CRUD REST API 프로젝트입니다.

##  기술 스택

- **Language**: Java 25
- **Framework**: Spring Boot 4.1.0
- **ORM**: Spring Data JPA (Hibernate)
- **DB**: H2 (인메모리)
- **Build Tool**: Gradle
- **기타**: Lombok

##  프로젝트 구조

```
week06/
├── src/main/java/com/example/books/
│   ├── BookApplication.java        # 메인 실행 클래스
│   ├── controller/
│   │   └── BookController.java     # REST API 엔드포인트
│   ├── service/
│   │   └── BookService.java        # 비즈니스 로직
│   ├── repository/
│   │   └── BookRepository.java     # JPA Repository
│   └── entity/
│       └── Book.java               # 도서 엔티티
└── src/main/resources/
    └── application.properties      # DB 및 환경 설정
```

##  Entity

| 필드      | 타입    | 설명        |
|-----------|---------|-------------|
| id        | Long    | 도서 ID (PK, 자동 생성) |
| bookName  | String  | 도서명      |
| price     | int     | 가격        |
| author    | String  | 저자        |

##  API 명세

| Method | URL            | 설명           |
|--------|----------------|----------------|
| POST   | `/books`       | 도서 등록      |
| GET    | `/books`       | 전체 도서 조회 |
| GET    | `/books/{id}`  | 단건 도서 조회 |
| PUT    | `/books/{id}`  | 도서 수정      |
| DELETE | `/books/{id}`  | 도서 삭제      |

### 요청/응답 예시

**도서 등록 (POST `/books`)**
```json
// Request
{
  "bookName": "책1",
  "price": 18000,
  "author": "홍길동"
}

// Response (201 Created)
{
  "id": 1,
  "bookName": "책1",
  "price": 18000,
  "author": "홍길동"
}
```
<img width="892" height="770" alt="image" src="https://github.com/user-attachments/assets/3ef59241-4557-45f3-bcad-92cb243f6d60" />

**도서 수정 (PUT `/books/1`)**
```json
// Request
{
  "bookName": "책2",
  "price": 23000,
  "author": "홍길동"
}
```
<img width="876" height="741" alt="image" src="https://github.com/user-attachments/assets/977f7b56-fa47-4a24-ab72-5645ea75a2a5" />

**도서 삭제 (DELETE `/books/1`)**
```json
// Request
{
  "bookName": "책2",
  "price": 23000,
  "author": "홍길동"
}
```

<img width="885" height="708" alt="image" src="https://github.com/user-attachments/assets/a457229d-46c5-48b8-82ea-c5b6edb31b41" />


**존재하지 않는 도서 조회 시**
```
404 Not Found - "책을 찾을 수 없습니다. id=999"
```

## ⚙️ 실행 방법

```bash
./gradlew bootRun
```

서버 실행 후 `http://localhost:8080/books`로 접속하여 API를 테스트할 수 있습니다.

### H2 콘솔 확인
```
http://localhost:8080/h2-console
```
- JDBC URL: `jdbc:h2:mem:testdb`
- Username: `sa`
- Password: (없음)
