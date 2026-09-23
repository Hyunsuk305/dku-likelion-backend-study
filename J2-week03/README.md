**fly.io로 서비스 배포하기** 
- fly launch --no-deploy 하면 fly.toml 생김
- fly.toml은 앱의 설정 변경할 때 사용
- Dockerfile이 같이 있으면 fly deploy: fly.toml 빼고 나머지 파일들 업로드 
- 로컬과 서버에서 port를 다르게 만들고 싶으면 설정 2개
- spring: profiles: dev - 개발환경에서만, prod: 운영환경에서 - application.yml이 기본, 이후 로드된 정보들이 덮어씌워짐
- @Value로 설정 파일 내용 불러올 수 있음
- GITHUB ACTION은 fly delpoy 입력하지 않아도 되게 함, 이를 CI/CD라고 부름
