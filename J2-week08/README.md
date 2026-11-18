## REST API
/{id}(은)는 패턴이고, 해당 위치에는 실제로 숫자가 들어옴
더티 체킹은 엔티티 객체에 변경사항이 없다면 UPDATE 쿼리를 수행하지 않습니다.
더티 체킹:  JPA(Java Persistence API)나 Hibernate 등 ORM 프레임워크에서 영속성 컨텍스트(Persistence Context)가 관리하는 엔티티의 상태 변화를 자동으로 감지하는 메커니즘

## DTO
엔티티가 바로 json화 되는 것을 막기 위해서 DTO로 바꿈

## DBCP(Connection Pool)
스프링부트는 DB와의 통신회선(DB 커넥션)을 미리 여러개 만들어 둠
요청이 몰릴 때를 대비해서 미리 만들어 두는 것

## OSIV
OSIV를 끄면 DB 커넥션이 유지되는 시간이 줄어서 전체 성능이 좋아짐
반대로 켜져있으면 코딩이 쉬워짐

## Rq
Request Scope Bean
HttpServletRequest 객체에 접근이 가능

단점: 호출마다 DB 조회발생 -> 메모리 캐싱으로 빠른 호춣
