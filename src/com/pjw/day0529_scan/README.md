# 0529 Scanner 입력

## 핵심

`Scanner`는 콘솔창에서 사용자가 입력한 값을 Java 코드 안으로 가져올 때 사용합니다.

```java
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
```

- `nextInt()` : 정수 입력
- `next()` : 단어 입력
- `nextLine()` : 한 줄 입력
