## PostgreSQL
ddl-auto:update이면 DB에 테이블 생성
cname: 별칭 정함, 특정 도메인의 작동 따라감
도커 빌드는 fly.io 내부에서 실행
AWS: 여러 서비스 조합
- IAM: 인증, 인가
- EC2: 컴퓨터
- RDS: DB
- S3: 스토리지 

## Terraform, AWS
resource "aws_vpc" "example" {
  cidr_block = "10.0.0.0/16"

  tags = {
    Name = "example"
  }
  ->
aws_vpc example = new aws_vpc("10.0.0.0/16", "example");

- terraform init
라이브러리 다운로드
라이브러리 관련 소스코드가 바뀔 때 마다 실행해야 한다.

- terraform plan
실제 리소스 생성을 하는것은 아니고
현재 소스코드가 실행가능한지 검사

- terraform apply
리소스 생성
yes 입력
소스코드 상의 자원과 AWS 자원을 동기

- terraform destroy
리소스 삭제
yes 입력

nginx 사용하면 요청이 nginx로 들어옴 -> port로 구분하지 않아도 됨
