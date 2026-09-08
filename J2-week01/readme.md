**할 일 관리 서비스
- 고객이 몇 개의 할 일 생성할 지 모르기 때문에 배열보다는 리스트 사용 권장
- 변수는 실행할 때 값 취급해줘야 함
- for(Todo todo: todos) {...} 하면 body 부분이 todos.size()만큼 반복 수행
- todos.forEach -> 처럼 표현하는 방법도 있음
- forEach는 요소의 개수만큼 실행됨
- string.parseLong(): string을 long의 형태로 바꿔
- 리스트.removeIf(요소 -> 조건식): 해당 리스트에서 조건식을 수행한 결과가 참인 요소를 전부 제거
- 리스트.stream().filter(요소 -> 조건식).findFirst().orElse(null): 해당 리스트에서 조건식의 결과가 참인 요소를 하나만 반환하고, 없다면 null을 반환
