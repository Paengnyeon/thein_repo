# thein_repo Java 수업 정리

Eclipse에서 바로 열어서 사용할 수 있게 정리한 Java 수업 프로젝트입니다.

## 폴더 구조

```text
thein_repo
├─ src
│  └─ com
│     └─ pjw
│        ├─ day0527_basic
│        ├─ day0528_datatype
│        ├─ day0528_operators
│        ├─ day0529_control
│        ├─ day0529_scan
│        └─ day0529_class
├─ .project
├─ .classpath
└─ README.md
```

## 정리 기준

- `bin`, `.class`, `.metadata` 같은 자동 생성 파일은 제외했습니다.
- Java 원본 파일만 `src` 아래에 정리했습니다.
- 날짜별 + 주제별 패키지로 나눴습니다.
- 다음 수업 때는 `src/com/pjw/day다음날짜_주제` 패키지를 새로 만들고 파일을 추가하면 됩니다.

## Eclipse에서 여는 방법

1. Eclipse 실행
2. `File > Import > Existing Projects into Workspace`
3. 이 폴더 선택
4. `thein_repo` 프로젝트 체크 후 Finish

## 다음 수업 추가 예시

예를 들어 6월 1일 배열 수업을 하면 아래처럼 만들면 됩니다.

```text
src/com/pjw/day0601_array/Ex01_Array.java
```

패키지는 이렇게 시작하면 됩니다.

```java
package com.pjw.day0601_array;
```
