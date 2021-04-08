# HOW-TO 그래프QL의 모델링에 대한 고찰

## GraphQL 이란
> [그래프QL][graphql_addr]은 일반적인 관계형 데이터베이스에서 벗어나 
> **"타입-관계"** 로 이루어진 데이터베이스이다.

## 특징
1. **일반적인 관계형 데이터베이스의 `Table - Column` 형태와는 달리 `Type - Field` 형태로 정의 된다**

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
                // 필드 (key-value)
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
    * 기본적으로 key : value 형태를 따른다
    ```

2. **쿼리를 해올때에 `TYPE`과 `FIELD`를 명시한 *구조* 대로 나온다**
   ```
    {                               {    
        me {                          "me": {
            name            =>          "name": "Luke Skywalker"
        }                             }    
    }                               }

   ```

   > 일반적으로 관계형 데이터베이스에서는 모든 컬럼을 가지고 오는 `SELECT *` 과 같은 문법이 있지만 GraphQL에서 **모든 필드를 가지고 오는 형태의 문법은 존재하지 않는다**. _개인적으로 아쉬운 부분_










[graphql_addr]: https://graphql.org/