## p.159 선택정렬

- 선택정렬은 0부터 9까지의 숫자가 있을 때, 이 중에서 가장 작은 데이터를 선택해 맨 앞에 있는 데이터와 바꾸고,
- 첫 번째 데이터는 정렬되었으니까 이제 두 번째부터 또 가장 작은 데이터를 선택해 2번째에 있는 데이터와 바꾼다
- 위 과정을 반복.
- 선택정렬은 (N - 1)번만큼 가장 작은 수를 찾아서 맨 앞으로 보내야 한다. 그리고 매번 가장 작은 수를 찾기 위해 비교연산이 필요하다.
- 상수항은 무시되므로 선택정렬의 시간복잡도는 `O(N^2)`이다.

[Java코드](https://github.com/azurealstn/coding-test/blob/master/Sort/Selection.java)

## p.164 삽입정렬

- 데이터를 하나씩 확인하며, 각 데이터를 적절한 위치에 삽입
- 1번째 원소는 정렬되어있다고 판단하고 그대로 두고, 2번째 원소부터 적절한 위치에 삽입
- 선택정렬보다 빠른게, 반복문으로 계속 비교하는 선택정렬과 다르게 이미 정렬되어있는 경우에는 무시하기 때문에 속도는 `삽입정렬 > 선택정렬` 이다.
- 삽입정렬의 최선의 경우에는 `O(N)`, 평균 속도는 `O(N^2)`

[Java코드](https://github.com/azurealstn/coding-test/blob/master/Sort/Insertion.java)

## p.168 퀵정렬

- 기준 데이터를 설정하고 그 기준보다 큰 데이터와 작은 데이터의 위치를 바꾸어 분할시킨다.
- 리스트에서 1번째 데이터를 피벗으로 정한다.
- 각 분할된 상태에서 다시 왼쪽과 오른쪽을 퀵정렬을 한다. (재귀적 함수)
- 시간복잡도는 `O(NlogN)`이다. 이는 데이터의 개수가 많으면 많을수록 압도적으로 빠른 속도를 자랑한다. 다만, 최악의 경우 `O(N^2)`이다.

[Java코드](https://github.com/azurealstn/coding-test/blob/master/Sort/Quick.java)

## p.171 계수 정렬

- 특정한 조건이 부합할 경우에만 사용가능하지만 그만큼 매우 빠른 정렬 알고리즘
- 데이터의 크기 범위가 제한되어 정수 형태로 표현할 경우에만 (반대로 무한한 범위를 가질 수 있는 실수형 데이터는 사용하기 어려움)

[Java코드](https://github.com/azurealstn/coding-test/tree/master/Sort/Counting.java)

## p.178 위에서 아래로

- 이 문제는 가장 기본적인 정렬을 할 수 있는지
- 선택, 삽입, 퀵, 계수 정렬중 어느것을 사용해도 무방하지만 자바 기본 정렬 라이브러리를 이용하여 구현

[Java코드](https://github.com/azurealstn/coding-test/blob/master/Sort/UpAndDown.java)

## p.180 성적이 낮은 순서로 학생 출력하기

- 이 문제는 학생 정보를 (점수, 이름)으로 묶은 뒤에 점수를 기준으로 정렬을 수행
- 이 문제 역시 정렬 라이브러리 이용하여 구현
- 먼저 객체를 정렬하는 Comparable 인터페이스 상속받는다
- `Collections.sort()` 메소드로 정렬 수행

[Java코드](https://github.com/azurealstn/coding-test/blob/master/Sort/Students.java)

## p.182 두 배열의 원소 교체

- 배열 A에서 가장 작은 원소를 골라서 배열 B에서 가장 큰 원소와 서로 교체하는 방식으로 해결
- 위 과정을 K번 반복
- 최종적으로 A배열에서 모든 원소의 합 출력

[Java코드](https://github.com/azurealstn/coding-test/blob/master/Sort/ArrayReplace.java)
