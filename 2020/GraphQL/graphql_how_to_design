# HOW-TO 그래프QL 설계 개념

## GraphQL 이란
> 그래프QL은 일반적인 관계형 데이터베이스에서 벗어나 
> **"객체-관계"** 로 이루어진 데이터베이스이다.

## <br>
## 특징
1. 일반적인 관계형 데이터베이스의 **Table - Column** 형태와는 달리 **Type - Field** 형태로 정의 된다

   * 일반적인 관계형 데이터베이스
    ```
    // EMPLOYEE 테이블
    +-----+--------+------+-------+
    |EMPID|EMPNM   |EMPAGE|EMPDEPT|    // 컬럼
    +-----+--------+------+-------+
    |1    |John Doe|29    |Dev    |    // 인스턴스
    +-----+--------+------+-------+
    ```
    
   * GraphQl 데이터베이스
   
    ```
    {
        "data": {
            // 타입
            "employee" {
                // 필드
                "empId" : "1"
                "empNm" : "John Doe"
                "empAge" : 29
                "empDept" : "Dev"
                .
                .
                .

            }
        }
    }
    ```
1. 쿼리를 해올때에 TYPE과 FIELD를 명시한 대로 나온다
