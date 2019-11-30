# 싱글톤 패턴 (Singleton Pattern)

---

프로그램이 실행 될 때 특정 객체를 한개만 생성하고 재사용하도록 하는 방법

## 조건
1. 클래스 생성자를 private으로 선언하여 클래스 외부에서 생성자로 객체를 생성할 수 없도록 한다.
2. 생성된 객체를 리턴해 주는 메소드 존재 getInstance()
3. 객체를 저장해 둘 자기 자신의 변수 instance

## 예제
### Speaker.java
- 가장 기본적인 싱글톤 패턴
- 멀티 쓰레드 환경에서 객체가 두개 이상 생성 될 수 있다는 문제점 존재

### Printer.java
- synchronized 키워드를 이용한 싱글톤 패턴
- 가장 기본적인 싱글통 패턴의 단점을 synchronized 키워드로 해결
- synchronized 키워드를 사용하면 해당 메서드에 lock이 걸리므로 성능상의 문제가 존재

### Refrigerator.java
- 현재까지 가장 완벽하다고 평가받는 LazyHolder 싱글톤 패턴
- 객체의 생성 지점을 최대한 미룬다고 해서 LazyHolder
- 클래스 안에 static 클래스를 만들고 그 안에 static final로 객체를 선언하므로써 클래스 로딩 시점에 한번만 호출 되도록 한다.
- 클래스 안에 static 클래스는 getInstance 메서드가 호출되기 전에는 참조되지 않는다.
- LazyHolder의 INSTANCE를 참조하는 순간 클래스가 로딩되며 초기화가 진행



