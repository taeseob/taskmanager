# To-do Manager

개발 연습용 To-do Manager 프로그램

## 연습할것들

* TDD - 테스트 코드 작성 습관 들이기
* Git - 명령어 사용하는 연습
* Maven - 툴 사용법
* UML을 사용한 설계 - 개발 전 설계하는 연습
* Java의 함수형 문법
* 리팩토링
* 디자인패턴
* 가능하다면 프론트엔드 관련 기술 학습까지

## 사용 해 본 Git 명령어들
```
git -c "http.proxy=168.219.61.252:8080" clone https://github.com/taeseob/todomanager.git D:/WORK/MY_OWN_PROJECT/todomanager
git checkout -b dev

git add README.md
git commit -m "README.md 파일 작성"
git -c "http.proxy=168.219.61.252:8080" push origin dev
```

## SSH KEY 생성
```
$ ssh-keygen -t rsa -b 4096 -C "tsshin1985@gmail.com"
$ eval $(ssh-agent -s)
$ ssh-add ~/.ssh/id_rsa
```

## 설계
design 디렉토리 아래 *.uml 파일들은 [PlantUML](http://plantuml.com) 사용

